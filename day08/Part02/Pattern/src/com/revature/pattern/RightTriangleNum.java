package com.revature.pattern;

import java.util.Scanner;

public class RightTriangleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the right triangle number pattern
        printRightTriangleNumberPattern(rows);

        scanner.close();
    }

    public static void printRightTriangleNumberPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
