package usingjava.chapter_code.ex_4_2_3;

import textio.TextIO;

import java.util.Random;

public class guessingGame {
    static int gamesPlayed;
    static int gamesWon;

    public static void main(String[] args) {
        boolean answer;
        System.out.println("Alright, let's play a game, he he he...");
        System.out.println("You have six attempts.");
        System.out.println("Guess a number between 1 and 100: ");
        do {
            playGame();
            System.out.println("Would you like to play again?");
            answer = TextIO.getBoolean();
        } while (answer);
        System.out.printf("You played %d and won %d games. ", gamesPlayed, gamesWon);
        System.out.println("It was fun playing with you! Come again :)");
    }

    private static void playGame() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        gamesPlayed++;
        while (true) {
            int userGuess = TextIO.getlnInt();
            if (secretNumber == userGuess) {
                System.out.printf("Gz! You got it right, the number is %d!", userGuess);
                System.out.println();
                gamesWon++;
                break;
            }
            else if (attempts == 6){
                System.out.println("Sorry, but you've spent all six attempts.");
                System.out.println("Better luck next time! :)");
                break;
            }
            else if (userGuess < secretNumber) {
                System.out.printf("You guessed %d, which is a bit low. Try again: ", userGuess);
                System.out.println();
            } else {
                System.out.printf("You guessed %d, which is a bit high. Try again: ", userGuess);
                System.out.println();
            }
            attempts++;
        }
    }
}
