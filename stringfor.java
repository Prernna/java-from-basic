import java.util.Scanner;

public class UserInputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Individual characters in the string:");
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            System.out.println(character);
        }

        scanner.close();
    }
}
