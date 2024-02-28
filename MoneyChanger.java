/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;
public class MoneyChanger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float money = 0.0f;
            boolean validMoney = false;
            while (!validMoney) {
                System.out.println("Enter a PESO VALUE: ");
                if (sc.hasNextFloat()) {
                    money = sc.nextFloat();
                    validMoney = true;
                } else {
                    System.out.println("Invalid input. Please enter a value only: ");
                    sc.next();
                }
            }

            sc.nextLine();

            System.out.println("Menu: ");
            System.out.println("[A] DOLLAR");
            System.out.println("[B] YEN");
            System.out.println("[C] RIAL");

            System.out.print("Choices: ");
            String choices = sc.nextLine();
            if (choices.equalsIgnoreCase("A")) {
                float dollar = money / 44.35f;
                System.out.println("Dollar Values: " + dollar);
            } else if (choices.equalsIgnoreCase("B")) {
                float yen = money / 0.137f;
                System.out.println("YEN VALUES: " + yen);
            } else if (choices.equalsIgnoreCase("C")) {
                float rial = money / 0.184f;
                System.out.println("RIAL VALUES: " + rial);
            } else {
                System.out.println("Invalid choice, choose an option that only appear in the Menu.");
            }
        }
    }
}