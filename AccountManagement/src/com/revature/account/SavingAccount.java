package com.revature.account;

class SavingsAccount extends BankAccount implements Interest {
    private static final double INTEREST_RATE = 0.08;

    public SavingsAccount(String accountId, double balance) {
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

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Interest: Rs " + interest);
    }
}
