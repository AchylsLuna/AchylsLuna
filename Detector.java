/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;
public class Detector {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 10 letters: ");
            String letters = sc.nextLine();

            int upperletter = 0;
            int lowerletter = 0;

            for (int i = 0; i < letters.length(); i++) {
                char ch = letters.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    upperletter++;
                } else if (ch >= 'a' && ch <= 'z') {
                    lowerletter++;
                } else System.out.println("Letters Only.");
            }
            System.out.println("Number of uppercase letters: " + upperletter);
            System.out.println("Number of lowercase letters: " + lowerletter);
        }
    }

    @Override
    public String toString() {
        return "Detector []";
    }

}
