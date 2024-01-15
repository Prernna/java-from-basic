import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Print Hello");
            System.out.println("2. Exit");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        } while (userChoice != 2);

        scanner.close();
    }
}
