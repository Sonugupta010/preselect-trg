/*  Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc. */


import java.util.Scanner;
public class PallindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String myString = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < myString.length() / 2; i++) {
            if (myString.charAt(i) != myString.charAt(myString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string " + myString + " is a palindrome.");
        } else {
            System.out.println("The string " + myString + " is not a palindrome.");
        }
    }
}


