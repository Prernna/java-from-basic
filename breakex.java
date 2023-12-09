import java.util.Scanner;

public class BreakStatementExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting the loop.");
                break; // Exit the loop when the input is 0
            }

            // Do something with the number (optional)
            System.out.println("Entered number: " + number);
        }

        scanner.close();
    }
}
