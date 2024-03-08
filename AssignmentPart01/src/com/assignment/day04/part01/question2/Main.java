package com.assignment.day04.part01.question2;

public class Main extends Student{
    public static void main(String[] args) {
        Student student1 = new Student("John", 2);

        System.out.println("Roll number: " + student1.roll_no);

        System.out.println("Phone number: N/A");
        System.out.println("Address: N/A");

        Student student2 = new Student("Sam", 3);

        System.out.println("Roll number: " + student2.roll_no);
        System.out.println("Phone number: N/A");
        System.out.println("Address: N/A");
    }
}

