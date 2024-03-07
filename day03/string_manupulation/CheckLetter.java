/* Write a program to check if the letter 'e' is present in the word 'Umbrella'. */

public class CheckLetter {
    public static void main(String[] args) {
        String var = "Umbrella";

        boolean isEPresent = false;
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) == 'e') {
                isEPresent = true;
                break;
            }
        }

        if (isEPresent) {
            System.out.println("The letter 'e' is present in the word 'Umbrella'.");
        } else {
            System.out.println("The letter 'e' is not present in the word 'Umbrella'.");
        }
    }
}
