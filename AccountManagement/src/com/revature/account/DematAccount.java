package com.revature.account;

public class DematAccount extends BankAccount{

    public DematAccount(String accountId, double balance) {
        super(accountId, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: Rs " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    double currentBalance() {
        return getBalance();
    }
}
