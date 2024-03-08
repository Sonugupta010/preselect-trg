package com.revature.day04.part2.question03;

public class BankAccount {

    private static int accountCounter = 1000;
    private String accountNumber;
    private String depositorName;
    private String depositorAddress;
    private String accountType;
    private double balance;
    private int numTransactions;

    public BankAccount() {
    }
    public BankAccount(String name, String address, String type, double initialBalance) {
        this.depositorName = name;
        this.depositorAddress = address;
        this.accountType = type;
        this.balance = initialBalance;
        this.numTransactions = 0;
        this.accountNumber = "BA" + accountCounter++;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Depositor Address: " + depositorAddress);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }

    public void deposit(double amount) {
        balance += amount;
        numTransactions++;
        System.out.println("Deposit successful.");
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numTransactions++;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void changeAddress(String newAddress) {
        depositorAddress = newAddress;
        System.out.println("Address changed successfully.");
    }

    public static int getTotalTransactions() {
        return accountCounter - 1000;
    }
}
