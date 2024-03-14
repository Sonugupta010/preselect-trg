package com.revature.pattern;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of consecutive squares: ");
        int numSquares = scanner.nextInt();
        System.out.print("Enter the size of each square: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int s = 0; s < numSquares; s++) {
                for (int j = 1; j <= size; j++) {
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
