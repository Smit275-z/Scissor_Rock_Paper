import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Random number generator for computer's choice
        Random random = new Random();

        String[] choices = {"Scissor", "Rock", "Paper"};

        int computerChoice = random.nextInt(3);

        System.out.print("Scissor (0), Rock (1), Paper (2): ");
        int userChoice = scanner.nextInt();

        // Input validation
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice! Please enter 0, 1, or 2.");
        } else {
            System.out.println("The computer is " + choices[computerChoice] + ". You are " + choices[userChoice] + ".");

            if (userChoice == computerChoice) {
                System.out.println("It is a draw");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You won");
            } else {
                System.out.println("You lost");
            }
        }

        scanner.close();
    }
}
