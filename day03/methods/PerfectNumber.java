/* Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3]. */

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (perfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
