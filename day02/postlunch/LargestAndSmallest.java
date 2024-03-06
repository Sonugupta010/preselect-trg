/* Find largest and smallest elements of an array */

import java.util.Scanner;
public class LargestAndSmallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter 10 integers:");
        		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();

		int smallest = arr[0];
        		int largest = arr[0];

        		for (int i = 1; i < arr.length; i++) {
           			if (arr[i] < smallest) {
                		smallest = arr[i];
            		}
            		if (arr[i] > largest) {
                	largest = arr[i];
           		 }
       	 }
        	System.out.println("Smallest element: " + smallest);
        	System.out.println("Largest element: " + largest);
	}
}