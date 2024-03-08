package com.assignment.day04.part01.question7;

import java.util.Scanner;
public class Main extends Employee{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter salary of the employee: $");
        double salary = sc.nextDouble();

        System.out.print("Enter number of hours of work per day: ");
        int hoursOfWork = sc.nextInt();
        employee.getInfo(salary, hoursOfWork);

        employee.addSal();
        employee.addWork();
        employee.printFinalSalary();
    }
}
