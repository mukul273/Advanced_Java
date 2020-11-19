package io.lambda.realexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccount {
    private int id;
    private String accountName;
    private double balance;

    final Lock lock = new ReentrantLock();

    BiFunction<Double, Double, Double> deductBalance = (balance, deductAmount) -> balance-deductAmount;
    BiFunction<Double, Double, Double> depositBalance = (balance, depositAmount) -> balance+depositAmount;


    public BankAccount(int id, String accountName, double balance) {
        this.id = id;
        this.accountName = accountName;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean withDraw(double amount) throws InterruptedException {
        if(this.lock.tryLock()) {
            Thread.sleep(100);
            balance = deductBalance.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) throws InterruptedException {
        if(this.lock.tryLock()) {
            Thread.sleep(100);
            balance = depositBalance.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public boolean transferBalance(BankAccount to, double amount) throws InterruptedException {
        if(withDraw(amount)) {
            System.out.println("Withdrawing amount:" + amount + " from account: " + getAccountName());
            if(to.deposit(amount)) {
                System.out.println("Depositing amount:" + amount + " to account:"+to.getAccountName());
                return true;
            } else {
                System.out.println("Failed to acquire the locks so refunding:" + amount + " to account:"+ getAccountName());
                while (!deposit(amount)) {
                    continue;
                }
            }
        }
        return false;
    }
}
