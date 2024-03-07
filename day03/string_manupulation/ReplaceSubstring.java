/* Write a program to replace a given substring in a sentence with another string. For example, in the sentence,
 ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”. */


import java.util.Scanner;
public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String mySentence = sc.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldSubstring = sc.nextLine();

        System.out.print("Enter the new string: ");
        String newString = sc.nextLine();

        String newSentence = mySentence.replace(oldSubstring, newString);
        System.out.println("New sentence: " + newSentence);

    }
}

