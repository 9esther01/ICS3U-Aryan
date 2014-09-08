package edu.gwss.ics3u.aryan.guessinggame;

import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh
 * Teacher: Mr.Muir
 * Version: 0.1v
 * Date: October 21, 2013
 * Description: A game that generates a random number between the number 1 and 20 which the user guesses.
 * 
 */
public class GuessingGame {


    public static void main(String[] args) {

        // Variable list
        int randNum;
        int userGuess;
        int amountOfGuesses = 0;

        // object list
        Scanner input = new Scanner(System.in);

        System.out.println("Guessing Game! try to guess the number between 1 and 20.");
        randNum = (int) (Math.random() * 20) + 1; // generates random number

        do {
            System.out.print("Guess a number between 1 and 20: ");
            userGuess = input.nextInt();
            amountOfGuesses++;

            // checks if lower or higher and if valid number
            if (userGuess > 20 || userGuess < 1) {
                System.out.println("Sorry that is an invalid number. Try again!");
                amountOfGuesses--; // does not count towards guess total
            } else if (userGuess > randNum) {
                System.out.println("Lower. Try again.");
            } else if (userGuess < randNum) {
                System.out.println("Higher. Try again. ");
            }

        } while (randNum != userGuess);

        // concluding sentance
        System.out.println("You won! It took you " + amountOfGuesses + " guesses to guess the number.");
    }
}
