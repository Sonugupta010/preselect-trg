/* Print the multiplication table of 15 using recursion. */



public class MultiplicationOf15{
    public static void main(String[] args) {
        int number = 15;
        printMultiplicationTable(number, 1);
    }

    public static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1); 
        }
    }
}


