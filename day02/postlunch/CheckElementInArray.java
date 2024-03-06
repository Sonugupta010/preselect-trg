/* Take 10 integer inputs from user and store them in an array. 
Again ask user to give a number. Now, tell user whether that number is present in array or not. */

import java.util.Scanner;
class CheckElementInArray{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		System.out.println("Please Enter 10 integer ");

		for(int i = 0; i<10; i++)
			arr[i]= sc.nextInt();

		System.out.println("Enter a number to check is it present in array or not? ");
		int num = sc.nextInt();

		boolean found = false;
        		for (int val : arr) {
           		 if (val == num) {
                	found = true;
                	break;
           		 }
       	 }
	if (found) {
            	System.out.println(num + " is present in the array.");
        	} else 
		System.out.println(num+ " is not present in the array.");
    
   	 }
}

