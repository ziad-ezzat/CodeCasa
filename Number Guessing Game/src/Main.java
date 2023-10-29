import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberOfRounds = 3;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        for (int round = 1 ; round <= numberOfRounds ; round++ ) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("Round " + round + " of " + numberOfRounds);

            while (true) {
                System.out.println("Guess a number between " + lowerBound + " and " + upperBound + ":");
                int guess = input.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Correct! The number was " + targetNumber + ".");
                    System.out.println("It took you " + attempts + " attempts to guess the number.");
                    int score = maxAttempts - attempts + 1;
                    System.out.println("You scored " + score + " points this round.");
                    totalScore += score;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("You ran out of attempts!");
                    System.out.println("The number was " + targetNumber + ".");
                    break;
                }
            }
        }

        System.out.println("Game over!");
        System.out.println("Your total score is " + totalScore + ".");

        input.close();
    }
}