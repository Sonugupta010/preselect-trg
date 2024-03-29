package com.revature.pattern;

import java.util.Scanner;

public class HollowDiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond: ");
        int size = scanner.nextInt();

        // Upper half of the diamond
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = size - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
