import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            // Ask the user for their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Provide feedback to the user
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
            }
        }

        scanner.close();
    }
}
