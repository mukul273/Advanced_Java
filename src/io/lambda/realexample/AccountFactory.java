package io.lambda.realexample;

public interface AccountFactory {
    public abstract BankAccount getBankAcount(int id, String accountName, double balance);
}
