import java.util.Scanner;

public class RockPaperScissors {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        int computerChoice;
        
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        
        userChoice = scanner.nextInt();
        computerChoice = generateComputerChoice();
        
        determineWinner(userChoice, computerChoice);
    }
    
    public static int generateComputerChoice() {
        // Generate a random number between 1 and 3
        return (int) (Math.random() * 3) + 1;
    }
    
    public static void determineWinner(int user, int computer) {
        System.out.println("Computer chose: " + getChoiceName(computer));
        System.out.println("You chose: " + getChoiceName(user));
        
        if (user == computer) {
            System.out.println("It's a tie!");
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Computer wins! Try again.");
        }
    }
    
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}
