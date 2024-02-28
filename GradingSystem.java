/*
Jonas J. Enriquez
 * UP-FC1-BSIT1-02
 * 2/28/2024
 */
import java.util.Scanner;

public class GradingSystem{
    public static char Grading(double grade) {
        char result;
        if (grade < 0 && grade > 100) {
            result = 'X';
        } else {
            switch ((int) grade / 10) {
                case 10:
                case 9:
                    result = 'A';
                    break;
                case 8:
                    result = 'B';
                    break;
                case 7:
                    result = 'C';
                    break;
                default:
                    result = 'F';
                    break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter grade value: ");
                double grade = scanner.nextDouble();
                char letterGrade = Grading(grade);
                System.out.println("Numeric value: " + letterGrade);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value only.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
