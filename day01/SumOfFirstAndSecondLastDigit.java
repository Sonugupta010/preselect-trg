/* Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner. */


import java.util.Scanner;

public class SumOfFirstAndSecondLastDigit {
    	public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);
        		System.out.print("Enter a 5-digit number: ");
        		int number = sc.nextInt();

        	int firstDigit = number / 10000;
        	int secondLastDigit = (number / 10) % 10;

        	int sum = firstDigit + secondLastDigit;

        	System.out.println("Sum of the first and second last digit: " + firstDigit + " + " + secondLastDigit + " = " + sum);
    }
}
