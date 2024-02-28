/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;
public class billsCalcu {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value: ");
        int val = scanner.nextInt();
        
        if (val < 1 || val > 999) {
            System.out.println("Invalid. Please put a value 1-999.");
            return;
        }
        
        int[] denominations = {500, 200, 100, 50, 20, 10, 5, 1};

        for (int i = 0; i < denominations.length; i++) {
            int count = val / denominations[i];
            val %= denominations[i];
            System.out.println(denominations[i] + " = " + count);
        }
        
        scanner.close();
    }

    static void fun() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount value: ");
        int amount = scanner.nextInt();

        int[] denominations = {500, 200, 100, 50, 20, 10, 5, 1};

        for (int i = 0; i < denominations.length; i++) {
            int countDenominations = amount / denominations[i];
            amount %= denominations[i];
            System.out.println(denominations[i] + " = " + countDenominations);
        }

        scanner.close();
    }
}