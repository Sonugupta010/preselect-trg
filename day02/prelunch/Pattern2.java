/* Print the following patterns using loop :
1010101
10101 
  101  
   1   
*/


public class Pattern2 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (k = 7; k >= (2 * i) - 1; k--) {
                if (k % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}