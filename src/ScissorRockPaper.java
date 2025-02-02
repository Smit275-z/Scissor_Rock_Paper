/**
 * RockPaperScissorsLizardSpock.java
 *
 * This program allows the user to play the Rock-Paper-Scissors-Lizard-Spock game
 * against the computer. The game tracks the score between the user and the computer,
 * displays the score after each round, and allows the user to quit at any time.
 *
 * @author Smit Patel
 * @date February 1, 2025
 * @studentNumber 0849357
 */

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

        while (true) {

            int computerChoice = random.nextInt(5);

            System.out.print("\nScissors (0), Rock (1), Paper (2), Lizard (3), Spock (4) or Quit (-1): ");
            int userChoice = scanner.nextInt();

            // Allow the user to quit
            if (userChoice == -1) {
                System.out.println("Game over! Final Score: You " + userScore + " - " + computerScore + " Computer.");
                break;
            }

            // Validate input
            if (userChoice < 0 || userChoice > 4) {
                System.out.println("Invalid choice! Please enter a number between 0 and 4.");
                continue;
            }

            System.out.println("The computer chose " + choices[computerChoice] + ". You chose " + choices[userChoice] + ".");

            if (userChoice == computerChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice == 0 && (computerChoice == 2 || computerChoice == 3)) ||  // Scissors cuts Paper, decapitates Lizard
                    (userChoice == 1 && (computerChoice == 0 || computerChoice == 3)) ||  // Rock crushes Scissors, crushes Lizard
                    (userChoice == 2 && (computerChoice == 1 || computerChoice == 4)) ||  // Paper covers Rock, disproves Spock
                    (userChoice == 3 && (computerChoice == 2 || computerChoice == 4)) ||  // Lizard eats Paper, poisons Spock
                    (userChoice == 4 && (computerChoice == 0 || computerChoice == 1))) {  // Spock smashes Scissors, vaporizes Rock
                System.out.println("You won this round!");
                userScore++;
            } else {
                System.out.println("You lost this round!");
                computerScore++;
            }

            // Display current score
            System.out.println("Score: You " + userScore + " - " + computerScore + " Computer.");
        }

        scanner.close();
    }
}
