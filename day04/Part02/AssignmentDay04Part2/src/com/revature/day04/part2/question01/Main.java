package com.revature.day04.part2.question01;

import java.util.Date;
public class Main{

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Date currDate = new Date();

        employees[0] = new Employee("John", 50000.0, currDate);
        employees[1] = new Employee("Alice", 60000.0, currDate);
        employees[2] = new Employee("Bob", 55000.0, currDate);
        employees[3] = new Employee("Emma", 70000.0, currDate);
        employees[4] = new Employee("David", 52000.0, currDate);
        employees[5] = new Employee("Mary", 58000.0, currDate);
        employees[6] = new Employee("James", 53000.0, currDate);
        employees[7] = new Employee("Sophia", 65000.0, currDate);
        employees[8] = new Employee("Michael", 62000.0, currDate);
        employees[9] = new Employee("Olivia", 54000.0, currDate);

        for (Employee employee : employees) {
            employee.printEmployeeDetails();
        }
    }
}
