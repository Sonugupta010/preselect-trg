/*  Write a program to find the number of vowels, consonents, digits and white space characters in a string. */


import java.util.Scanner;
public class CountLetterByGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String myString = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int whitespaceCount = 0;

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
            else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            else if (ch == ' ') {
                whitespaceCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of whitespace characters: " + whitespaceCount);

    }
}


