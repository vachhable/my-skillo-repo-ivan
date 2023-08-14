package homeworks.lecture7;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        }
    }
}









