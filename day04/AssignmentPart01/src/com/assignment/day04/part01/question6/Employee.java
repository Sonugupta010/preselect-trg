package com.assignment.day04.part01.question6;

/** Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
 Name        Year of joining        Address
 Robert            1994                64C- WallsStreet
 Sam                2000                68D- WallsStreet
 John                1999                26B- WallsStreet */


public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee() {
    }

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
}
