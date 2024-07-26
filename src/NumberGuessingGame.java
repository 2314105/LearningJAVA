import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int userGuess = 0;
        int attempts = 7;
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the number guessing game!");

        while (true) {
            if (attempts > 0) {
                System.out.println("You have " + attempts + " attempts left.");
            } else {
                System.out.println("You have no attempts left. You Lose...");
                System.out.println("The correct number was: " + randomNumber);
                break;
            }

            System.out.println("Please enter a number between 1 and 100:");
            userGuess = input.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed it!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println(userGuess + " is too low.");
            } else if (userGuess > randomNumber) {
                System.out.println(userGuess + " is too high.");
            }

            attempts--;
        }

        input.close();
    }
}
