/* Define two methods to print the maximum and the minimum number respectively among three numbers entered by user. */


import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Maximum number: " + findMaximum(num1, num2, num3));

        System.out.println("Minimum number: " + findMinimum(num1, num2, num3));

    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int findMinimum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
