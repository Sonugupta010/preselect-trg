/* Write a program to find the sum and product of all elements of an array. */

import java.util.Scanner;
public class SumAndProd{
	public static void main(String[] args){
		int sum = 0;
		int product =1;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter 10 integers:");
        		for (int i = 0; i < 10; i++){
			arr[i] = sc.nextInt();
			sum +=arr[i];
			product *=arr[i];
		}
		System.out.println("Sum ="+sum +" Product ="+product);
	}
}