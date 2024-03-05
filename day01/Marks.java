/* Input the marks of Robert in three subjects using Scanner (each out of 100 ), 
write a program to calculate his total marks and percentage marks. */


import java.util.Scanner;

class Marks {
	public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);
        		System.out.println("Enter marks for three subjects (out of 100) for Robert:");

        		System.out.print("Enter marks for subject 1: ");
       		int subject1 = sc.nextInt();

        		System.out.print("Enter marks for subject 2: ");
        		int subject2 = sc.nextInt();

        		System.out.print("Enter marks for subject 3: ");
        		int subject3 = sc.nextInt();

	int totalMarks = subject1 + subject2 + subject3;
	double percentageMarks = (totalMarks / 3.0);

        	System.out.println("Total Marks= " + totalMarks +" "+ "Percentage Marks =" +percentageMarks);
    }
}
