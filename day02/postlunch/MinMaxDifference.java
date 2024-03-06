/* Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user.
 Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest */


import java.util.Scanner;

public class MinMaxDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxDifference = Integer.MIN_VALUE;
        int maxDiffElement1 = 0;
        int maxDiffElement2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int difference = Math.abs(array[i] - array[j]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                    maxDiffElement1 = array[i];
                    maxDiffElement2 = array[j];
                }
            }
        }

        int minDifference = Integer.MAX_VALUE;
        int minDiffElement1 = 0;
        int minDiffElement2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int difference = Math.abs(array[i] - array[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                    minDiffElement1 = array[i];
                    minDiffElement2 = array[j];
                }
            }
        }
        System.out.println("Pair with maximum difference: " + maxDiffElement1 + ", " + maxDiffElement2 + ", Difference: " + maxDifference);
        System.out.println("Pair with minimum difference: " + minDiffElement1 + ", " + minDiffElement2 + ", Difference: " + minDifference);
    }
}
