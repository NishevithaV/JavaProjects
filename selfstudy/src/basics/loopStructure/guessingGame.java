package basics.loopStructure;
import java.util.Scanner;

public class guessingGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's play a guessing game! ");
        do {
            playAround(1, getRandomNumber(7,12));
        } while (askForAnotherRound("Try again?"));
        System.out.println("\n Thank you for playing!");
    }
    public static void playAround(int min, int max) {
        boolean validInput;
        int number, guess;
        String answer;

        // pick a random number
        number = getRandomNumber(min, max);

        // get the guess
        System.out.println("\n I'm thinking of a number" +
                "between " +min+" and " +max+ ".");
        System.out.print("What do you think it is? ");
        guess = getGuess(min,max);

        // check guess
        if (guess==number) {
            System.out.println("You're right!");
        }
        else {
            System.out.println("You're wrong. The number was " +
                    number);
        }
    }
    public static int getRandomNumber(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static int getGuess(int min, int max) {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max)) {
                System.out.print("Only between " +min+ " and " +max);
            }
            else {
                return guess;
            }
        }
    }
    public static boolean askForAnotherRound(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " Y or N ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
