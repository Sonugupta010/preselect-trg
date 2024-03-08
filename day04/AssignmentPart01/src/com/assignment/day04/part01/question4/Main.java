package com.assignment.day04.part01.question4;
import java.util.Scanner;
public class Main extends Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        Area rectangle = new Area(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.returnArea());
    }
}
