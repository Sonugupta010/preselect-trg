package com.revature.day04.part2.question01;
/**  */

import java.util.Date;
public class Employee {
    String name;
    double salary;
    Date dateOfJoining;

    public Employee() {
    }

    public Employee(String name, double salary, Date dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println();
    }
}
