/* Take 10 integer inputs from user and store them in an array and print them on screen. */

import java.util.Scanner;
public class MyArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter 10 integers:");
        		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();

		for(int val : arr)
			System.out.println(val);
	}
}