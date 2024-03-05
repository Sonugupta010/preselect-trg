/* Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner. */


import java.util.Scanner;

class SumOfThreeDigits {
	public static void main(String[] args) {
        		Scanner scanner = new Scanner(System.in);
        		System.out.print("Enter a 3-digit number: ");
        		int number = scanner.nextInt();

        	int firstDigit = number / 100;
        	int secondDigit = (number / 10) % 10;
        	int thirdDigit = number % 10;

        	int sum = firstDigit + secondDigit + thirdDigit;

        	System.out.println("Sum of the digits: " + firstDigit + " + " + secondDigit + " + " + thirdDigit + " = " + sum);
    }
}
