package com.assignment.day04.part01.question4;

/** Write a program to print the area of a rectangle by creating a class named 'Area'
 *  taking the values of its length and breadth as parameters of its constructor and
 *  having a method named 'returnArea' which returns the area of the rectangle.
 *  Length and breadth of rectangle are entered through keyboard. */

public class Area {
    private double length;
    private double breadth;

    public Area() {
    }

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double returnArea() {
        return length * breadth;
    }
}