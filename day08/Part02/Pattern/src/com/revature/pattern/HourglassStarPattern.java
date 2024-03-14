package com.revature.pattern;

import java.util.Scanner;

public class HourglassStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the hourglass: ");
        int size = scanner.nextInt();

        // Upper half of the hourglass
        for (int i = size; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = 2; i <= size; i++) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

