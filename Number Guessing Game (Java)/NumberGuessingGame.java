import java.util.*;

public class NumberGuessingGame {
    
    // Method to generate a random number between 1 and 100
    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    // Method to provide hints based on the user's guess
    public static String giveHint(int number, int guess) {
        int difference = Math.abs(number - guess);
        
        if (difference == 0) {
            return "Correct! You got it!";
        } else if (difference <= 3) {
            return "Super Close! Try again.";
        } else if (difference <= 10) {
            return "Getting Closer! Keep going.";
        } else {
            return "Way Off! Try a different number.";
        }
    }

    // Method to run the guessing game with a 10-attempt limit
    public static void runGuess(Scanner scanner) {
        int secretNumber = getRandomNumber();
        int userGuess;
        int attempts = 0;
        int maxAttempts = 10; // Limit to 10 attempts
        String hint;

        System.out.println("\nA new number has been generated! Try to guess it.");
        System.out.println("\nNote: You have " + maxAttempts + " chances to guess the number.");

        while (attempts < maxAttempts) {
            System.out.print("\nEnter a number between 1 and 100: ");

            // Input validation
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                scanner.next(); // Clear invalid input
                continue;
            }

            userGuess = scanner.nextInt();
            attempts++;

            // Check if the guess is within the valid range
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Out of range! Please enter a number between 1 and 100.");
                continue;
            }

            hint = giveHint(secretNumber, userGuess);
            System.out.println(hint); // Output the hint

            if (hint.contains("Correct!")) {
                System.out.println("You guessed the number in " + attempts + " attempts!");
                return; // End game when the number is guessed correctly
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        // If user fails to guess within 10 attempts
        System.out.println("\nYou've used all 10 attempts!");
        System.out.println("The correct number was: " + secretNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            runGuess(scanner);
            System.out.print("\nDo you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! See you next time.");
        scanner.close();
    }
}