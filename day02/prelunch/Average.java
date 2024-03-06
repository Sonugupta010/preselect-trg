/* Take 10 integers from keyboard using loop and print their average value on the screen. */



import java.util.Scanner;

/**
* The Average program implements an application that
* simply calculate the average and displays "Average" to the standard output.
*
* @author  Sonu Gupta
* @since   2024-03-06 
*/ 

public class Average{
	public static void main(String[] args){
		double[] num = new double[10];
		double sum = 0;
		System.out.println("Please enter any 10 numbers ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++){
			num[i] = sc.nextDouble();
			sum += num[i];
		}
		double average = sum/10;
		System.out.println(" The average of given 10 numbes = "+average);
	}
}
 