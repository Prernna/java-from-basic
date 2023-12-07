import java.util.Random;
import java.util.Scanner;

public class TruthOrDare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] truths = {
            "What is your biggest fear?",
            "What is the craziest thing you've ever done?",
            "Have you ever cheated during a game?",
            // Add more truth questions
        };

        String[] dares = {
            "Sing a song loudly for 1 minute!",
            "Do 10 pushups!",
            "Call a friend and tell them a funny joke!",
            // Add more dare challenges
        };

        char playAgain;
        do {
            System.out.println("Choose 'T' for Truth or 'D' for Dare: ");
            char choice = scanner.next().charAt(0);

            if (choice == 'T' || choice == 't') {
                int truthIndex = random.nextInt(truths.length);
                System.out.println("Truth: " + truths[truthIndex]);
            } else if (choice == 'D' || choice == 'd') {
                int dareIndex = random.nextInt(dares.length);
                System.out.println("Dare: " + dares[dareIndex]);
            } else {
                System.out.println("Invalid choice. Please select 'T' for Truth or 'D' for Dare.");
            }

            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("Thanks for playing Truth or Dare!");
        scanner.close();
    }
}
