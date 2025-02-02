import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Random number generator for computer's choice
        Random random = new Random();

        String[] choices = {"Scissors", "Rock", "Paper", "Lizard", "Spock"};

        int userScore = 0, computerScore = 0;
        boolean keepPlaying = true;
        
        int computerChoice = random.nextInt(5);

        System.out.print("Scissors (0), Rock (1), Paper (2), Lizard (3), Spock (4): ");
        int userChoice = scanner.nextInt();

        // Input validation
        if (userChoice < 0 || userChoice > 4) {
            System.out.println("Invalid choice! Please enter 0, 1, or 2.");
        } else {
            System.out.println("The computer is " + choices[computerChoice] + ". You are " + choices[userChoice] + ".");

            if (userChoice == computerChoice) {
                System.out.println("It is a draw");
            } else if ((userChoice == 0 && (computerChoice == 2 || computerChoice == 3)) ||  // Scissors cuts Paper, decapitates Lizard
                    (userChoice == 1 && (computerChoice == 0 || computerChoice == 3)) ||  // Rock crushes Scissors, crushes Lizard
                    (userChoice == 2 && (computerChoice == 1 || computerChoice == 4)) ||  // Paper covers Rock, disproves Spock
                    (userChoice == 3 && (computerChoice == 2 || computerChoice == 4)) ||  // Lizard eats Paper, poisons Spock
                    (userChoice == 4 && (computerChoice == 0 || computerChoice == 1))) {  // Spock smashes Scissors, vaporizes Rock
                System.out.println("You won");
            } else {
                System.out.println("You lost");
            }
        }

        scanner.close();
    }
}
