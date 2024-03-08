package com.revature.day04.part2.question03;

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine();
        BankAccount[] accounts = new BankAccount[numDepositors];

        for (int i = 0; i < numDepositors; i++) {
            System.out.println("Enter information for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Account Type: ");
            String type = scanner.nextLine();
            System.out.print("Initial Balance: $");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            accounts[i] = new BankAccount(name, address, type, balance);
        }

        for (int i = 0; i < numDepositors; i++) {
            System.out.println("Operations for depositor " + (i + 1) + ":");
            accounts[i].displayAccountInfo();

            System.out.print("Enter amount to deposit: $");
            double depositAmount = scanner.nextDouble();
            accounts[i].deposit(depositAmount);
            accounts[i].displayAccountInfo();

            System.out.print("Enter amount to withdraw: $");
            double withdrawAmount = scanner.nextDouble();
            accounts[i].withdraw(withdrawAmount);
            accounts[i].displayAccountInfo();

            scanner.nextLine();
            System.out.print("Enter new address: ");
            String newAddress = scanner.nextLine();
            accounts[i].changeAddress(newAddress);
            accounts[i].displayAccountInfo();
        }
        System.out.println("Total number of transactions: " + BankAccount.getTotalTransactions());
    }
}
