/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/25/2024
 */
import java.util.Scanner;

public class Calculator{
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an operation: ");
            String opera = scanner.nextLine();

            String[] ok = opera.split(" ");
            double num1 = Double.parseDouble(ok[0]);
            String math = ok[1];
            double num2 = Double.parseDouble(ok[2]);

            double res = 0;
            switch(math){
                case "+":
                res = num1 + num2;
                System.out.println("sum:" + res);
                break;
                case "-":
                res = num1 - num2;
                System.out.println(num2);
                System.out.println("differences" + res);
                break;
                case "*":
                res = num1 * num2;
                System.out.println("product" + res);
                break;
                case "/":
                res = num1 / num2;
                System.out.printf("QUOTIENT: %.2f%n", res);
                break;
                case "%":
                res = num1 % num2;
                System.out.println("MODULOS: " + res);
                break;
                default:
                System.out.println("Invalid operator");
                break;
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
