/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;
public class equality{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Three Numbers: ");
            int[] num = new int[3];
            num[0] = scanner.nextInt();
            num[1] = scanner.nextInt();
            num[2] = scanner.nextInt();

            if (num[0] == num[1] && num[1] == num[2]) {
                System.out.println("EQUAL VALUES");
                return;
            }

            int minIndex, temp;
            for (int i = 0; i < 2; i++) {
                minIndex = i;
                for (int j = i + 1; j < 3; j++) {
                    if (num[j] < num[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    temp = num[i];
                    num[i] = num[minIndex];
                    num[minIndex] = temp;
                }
            }
            System.out.println("Ascending: " + num[0] + ", " + num[1] + ", " + num[2]);
            System.out.println("Descending: " + num[2] + ", " + num[1] + ", " + num[0]);
        }
    }
}
