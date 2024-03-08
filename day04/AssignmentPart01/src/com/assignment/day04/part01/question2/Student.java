package com.assignment.day04.part01.question2;

/**  Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 *  Assign the value of roll_no as '2' and that of name as "John" by creating an object of
 *  the class Student. Assign and print the roll number, phone number and address of two
 *  students having names "Sam" and "John" respectively by creating two objects of class 'Student'. */

public class Student {

    String name;
    int roll_no;

    public Student() {
    }

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}
