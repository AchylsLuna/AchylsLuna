/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;
public class computation {
    public static void main(String args[]) {
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            a = sc.nextInt();
            System.out.print("Enter the second number: ");
            b = sc.nextInt();
            System.out.print("Enter the third number: ");
            c = sc.nextInt();
        }
        
        int total = a + b + c;
       
        System.out.println("The sum of " + a + "," + b +" "+ " and " + c + " is: " + total);
    }
}
