package com.assignment.day04.part01.question1;
import java.util.Scanner;
public class Main extends Area{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Please enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        double area = rectangle.getArea();
        System.out.println("Area of the rectangle is : " + area);


    }
}
