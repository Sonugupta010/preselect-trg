package com.revature.pattern;

import java.util.Scanner;

public class LeftTriangleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the left triangle number pattern
        printLeftTriangleNumberPattern(rows);

        scanner.close();
    }

    public static void printLeftTriangleNumberPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print numbers for each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
