/*  Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *.
 (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”. */


import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String myString = sc.nextLine();

        String[] words = myString.split("\\s+");

        StringBuilder modifiedString = new StringBuilder();


        for (String word : words) {
            if (isPalindrome(word)) {
                modifiedString.append("*".repeat(word.length())).append(" ");
            } else {
                modifiedString.append(word).append(" ");
            }
        }
        System.out.println("Modified string: " + modifiedString.toString().trim());

    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
