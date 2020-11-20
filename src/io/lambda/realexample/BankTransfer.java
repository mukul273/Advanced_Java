package io.lambda.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {

    public static void main(String[] args) {
        // Below line is constructor reference
        AccountFactory accountFactory = BankAccount::new;

        BankAccount studentBankAccount = accountFactory.getBankAcount(100, "Chimp's account", 10000);
        BankAccount universityBankAccount = accountFactory.getBankAcount(100, "Chimp's University account", 100000);

        //Use BiPredicate because we want to pass two values and return boolean (To check if the student account has enough balance)
        BiPredicate<Double, Double> checkStudentBalance = (balance, amount) -> balance>amount;

        //Use BiConsumer to print the values and messages
        BiConsumer<String, Double> printX = (x,y) -> System.out.println(x+y);
        BiConsumer<BankAccount, BankAccount> printBankAccount = (student,university) ->
                System.out.println(
                        "Ending balance of student account:"+studentBankAccount.getBalance() +
                        " University account balance:" +universityBankAccount.getBalance()
                );

        ExecutorService service = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName() + " says:: Executing");
            try {
                double amount = 1000;
                if (!checkStudentBalance.test(studentBankAccount.getBalance(), amount)) {
                    printX.accept(Thread.currentThread().getName() +
                            "Chimp's account doesn't have enough balance:", amount);
                    return;
                }
                while (!studentBankAccount.transferBalance(universityBankAccount, amount)) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

            printX.accept(Thread.currentThread().getName()+
                    " says transfer successful, balance in university account:", universityBankAccount.getBalance());
        });

        for (int i=0; i<20; i++) {
            service.submit(t1);
        }
        service.shutdown();
        try {
            while (! service.awaitTermination(20L, TimeUnit.HOURS)) {
                System.out.println("Still waiting for termination.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printBankAccount.accept(studentBankAccount, universityBankAccount);
    }
}
