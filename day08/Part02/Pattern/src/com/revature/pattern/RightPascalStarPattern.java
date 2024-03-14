package com.revature.pattern;

import java.util.Scanner;

public class RightPascalStarPattern {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of Pascal triangle : ");
        Scanner sc = new Scanner(System.in);
        int numberOfRows= sc.nextInt();
        for (int i= 0; i<= numberOfRows/2; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for (int i=numberOfRows/2 ; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}



