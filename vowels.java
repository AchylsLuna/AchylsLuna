/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/25/2024
 */
import java.util.Scanner;

public class vowels {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Character: ");
            String vowel = sc.next().toLowerCase();

            if ("aeiou".contains(vowel)) {
                System.out.println("vowel");
            } else {
                System.out.println("Not a vowel, put a vowel letters only.");
            }
        }

    }
}
