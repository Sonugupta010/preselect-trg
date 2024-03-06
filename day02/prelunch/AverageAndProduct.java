/* Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers. */

import java.util.Scanner;
class AverageAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        long product = 1;
        
        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = sc.next();
            
            if (input.equals("q")) {
                break;
            }
            
            if (isInteger(input)) {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of all numbers: " + average);
            System.out.println("Product of all numbers: " + product);
        } else {
            System.out.println("No numbers entered.");
        }
        
    }
    
    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && (i != 0 || str.charAt(i) != '-')) {
                return false;
            }
        }
        return true;
    }
}



