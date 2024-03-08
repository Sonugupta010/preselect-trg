package com.assignment.day04.part01.question7;

/**  Write a program by creating an 'Employee' class having the following methods and print the final salary.
 1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
 2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
 3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours. */
public class Employee {
    double salary;
    int hoursOfWork;
    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }
    public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}
