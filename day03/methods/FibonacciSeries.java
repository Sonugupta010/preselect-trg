/* Using recursion, define a method to know nth term of a Fibonacci series.
Nth term of Fibonacci series is
F(n) = F(n-1)+(n-2)
F(0) = 0
F(1) = 1
F(2) = F(1)+(0) = 1+0 = 1
F(3) = F(2)+(1) = 1+1 = 2
F(4) = F(3)+(2) = 2+1 = 3 */


import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
    System.out.println("Please enter the value of n ");
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of Fibonacci series is: " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
