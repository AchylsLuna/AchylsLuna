/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/25/2024
 */
import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        int a, b, c, d;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            a = sc.nextInt();
            System.out.print("Enter the second number: ");
            b = sc.nextInt();
            System.out.print("Enter the third number: ");
            c = sc.nextInt();
            System.out.print("Enter the fourth number: ");
            d = sc.nextInt();
        }
        
        int total = a + b + c + d;
        double average = (double) total / 4;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }  
    }

