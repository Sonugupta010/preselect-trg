package com.assignment.day04.part01.question5;
import java.util.Scanner;
public class Main extends Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        Average averageCalculator = new Average();

        averageCalculator.calculateAverage(num1, num2, num3);
    }
}
