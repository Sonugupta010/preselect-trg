package com.assignment.day04.part01.question3;

/** Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
 *  by creating a class named 'Triangle' with constructor having the three sides as its parameters. */

public class Triangle {
    double side1, side2, side3;
    public Triangle() {
    }

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
