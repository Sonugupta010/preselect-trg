/*  Write a program that takes your full name as input and displays the abbreviations of the 
first and middle names except the last name which is displayed as it is. For example, 
if your name is Robert Brett Roser, then the output should be R.B.Roser. */


import java.util.Scanner;
public class Abbreviations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = sc.nextLine();

        String[] nameParts = fullName.split(" ");

        StringBuilder abbrFirstAndMiddleName = new StringBuilder();

        for (int i = 0; i < nameParts.length - 1; i++) {
            String namePart = nameParts[i];
            abbrFirstAndMiddleName.append(namePart.charAt(0)).append(".");
        }

        abbrFirstAndMiddleName.append(nameParts[nameParts.length - 1]);
        System.out.println("Your Abbreviated name is : " + abbrFirstAndMiddleName.toString());
    }
}


