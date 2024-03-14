package com.revature.pattern;

import java.util.Scanner;

public class PlusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the plus sign: ");
        int size = scanner.nextInt();

        int center = size / 2;

        for (int i = 0; i < center; i++) {
            // Print spaces until reaching the center
            for (int j = 0; j < center; j++) {
                System.out.print(" ");
            }
            // Print asterisk for the vertical line
            System.out.println("*");
        }
        // Print the horizontal line of the plus sign
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the vertical line of the plus sign
        for (int i = 0; i < center; i++) {
            // Print spaces until reaching the center
            for (int j = 0; j < center; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}

