package com.revature.account;

public class AccountManagement {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 5000);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 10000);
        DematAccount dematAccount = new DematAccount("DA001", 20000);


        savingsAccount.deposit(2000);
        savingsAccount.calculateInterest();
        System.out.println("Savings Account Balance: Rs " + savingsAccount.currentBalance());


        currentAccount.withdraw(500);
        System.out.println("Current Account Balance: Rs " + currentAccount.currentBalance());


        dematAccount.deposit(3000);
        dematAccount.withdraw(1000);
        System.out.println("Demat Account Balance: Rs " + dematAccount.currentBalance());
    }
}
