package com.revature.day04.part2.question02;
/**  Write a program to print the roll number and average marks of 8 students in three subjects
 *  (each out of 100). The marks are entered by user.
 -----------*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENTS = 8;
        final int NUM_SUBJECTS = 3;

        int[][] marks = new int[NUM_STUDENTS][NUM_SUBJECTS];
        double[] averageMarks = new double[NUM_STUDENTS];

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < NUM_STUDENTS; i++) {
            int totalMarks = 0;
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                totalMarks += marks[i][j];
            }
            averageMarks[i] = (double) totalMarks / NUM_SUBJECTS;
        }

        System.out.println("\nRoll Number\tAverage Marks");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println((i + 1) + "\t\t" + averageMarks[i]);
        }
    }
}

