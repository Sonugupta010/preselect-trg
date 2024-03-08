package com.assignment.day04.part01.question3;

public class Main extends Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        double area = triangle.getArea();
        double perimeter = triangle.getPerimeter();

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}
