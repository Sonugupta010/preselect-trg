package com.assignment.day04.part01.question6;

public class Main extends Employee{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 55000, "26B- WallsStreet");

        System.out.println("Name\t\tYear of Joining\t\tAddress");
        System.out.println(employee1.name + "\t\t" + employee1.yearOfJoining + "\t\t\t" + employee1.address);
        System.out.println(employee2.name + "\t\t" + employee2.yearOfJoining + "\t\t\t" + employee2.address);
        System.out.println(employee3.name + "\t\t" + employee3.yearOfJoining + "\t\t\t" + employee3.address);
    }
}
