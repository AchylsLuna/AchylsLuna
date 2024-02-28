/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;

public class identification {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an Alphabet: ");
            char letter = sc.next().charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("INVALID INPUT, ONLY LETTERS.");
                return;
            }

            String caseType = Character.isUpperCase(letter) ? "UPPERCASE" : "LOWERCASE";
            if ("aeiouAEIOU".indexOf(letter) != -1) {
                System.out.println("VOWEL " + caseType);
            } else {
                System.out.println("CONSONANT " + caseType);
            }
        }
    }
}
