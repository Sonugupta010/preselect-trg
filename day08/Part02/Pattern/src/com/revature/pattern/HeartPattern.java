package com.revature.pattern;

import java.util.Scanner;

public class HeartPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the heart: ");
        int size = scanner.nextInt();
        printHeartPattern(size);
    }

    public static void printHeartPattern(int size) {
        // Upper half of the heart
        for (int i = size / 2; i <= size; i += 2) {
            // Print spaces
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }

            // Print left side of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between the two sides of the heart
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Print right side of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the heart
        for (int i = size; i >= 1; i--) {
            // Print spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }

            // Print left side of the heart
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

