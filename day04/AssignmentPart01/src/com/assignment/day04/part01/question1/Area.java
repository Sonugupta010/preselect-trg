package com.assignment.day04.part01.question1;

/** Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters
 and the second method named as 'getArea' returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard.*/
import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}


