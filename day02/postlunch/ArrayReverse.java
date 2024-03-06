/* Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. */

import java.util.Scanner;

public class ArrayReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		System.out.println("Enter 10 integers:");
        		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
            		arr2[i] = arr[arr.length - 1 - i];
       		}
        	System.out.println("\nElements in the reversed array:");
        	for (int num : arr2) {
            	System.out.println(num);
	}
}
}