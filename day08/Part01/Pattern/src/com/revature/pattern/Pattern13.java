package com.revature.pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the square
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Input number of repetitions
        System.out.print("Enter the number of repetitions: ");
        int repetition = scanner.nextInt();

        // Loop for repetition
        for (int i = 0; i < repetition; i++) {
            // Loop for rows
            for (int j = 1; j <= size; j++) {

                for (int k = 1; k <= size; k++) {
                    if (j == 1 || j == size || k == 1 || k == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (i < 2) {
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
