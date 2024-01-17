import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter another number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return; // Exit the program if attempting to divide by zero
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return; // Exit the program for invalid operations
        }

        System.out.println("Result: " + result);
    }
}
