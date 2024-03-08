package com.revature.day04.part2.question04;

import java.util.ArrayList;
import java.util.Scanner;
public class Directory {
    private ArrayList<DirectoryEntry> entries;
    public Directory() {
        entries = new ArrayList();
    }
    public void addEntry(DirectoryEntry entry) {
        entries.add(entry);
    }
    public void editEntry(String uniqueID) {
        for (DirectoryEntry entry : entries) {
            if (entry.getUniqueID().equals(uniqueID)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Editing entry with Unique ID: " + uniqueID);
                System.out.print("Enter new name: ");
                entry.name = scanner.nextLine();
                System.out.print("Enter new address: ");
                entry.address = scanner.nextLine();
                System.out.print("Enter new telephone number: ");
                entry.telephoneNumber = scanner.nextLine();
                System.out.print("Enter new mobile number: ");
                entry.mobileNumber = scanner.nextLine();
                System.out.print("Enter new head of family: ");
                entry.headOfFamily = scanner.nextLine();
                System.out.println("Entry updated successfully.");
                return;
            }
        }
        System.out.println("Entry with Unique ID: " + uniqueID + " not found.");
    }
    public void searchByKeyword(String keyword) {
        System.out.println("Search results for keyword: " + keyword);
        for (DirectoryEntry entry : entries) {
            if (entry.matchesKeyword(keyword)) {
                entry.displayEntry();
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter unique ID: ");
                    String uniqueID = scanner.nextLine();

                    DirectoryEntry newEntry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    directory.addEntry(newEntry);
                    System.out.println("Entry added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Unique ID of entry to edit: ");
                    String editID = scanner.nextLine();
                    directory.editEntry(editID);
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.searchByKeyword(keyword);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
