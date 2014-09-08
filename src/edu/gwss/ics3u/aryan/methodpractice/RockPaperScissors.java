/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.methodpractice;

import java.util.Scanner;

public class RockPaperScissors {

    final static int ROCK = 1;
    final static int PAPER = 2;
    final static int SCISSORS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String humanChoice = getUserChoice(input.nextInt());

        introduction();
        System.out.println("Your choice is " + humanChoice);

    }

    public static void introduction() {
        System.out.println("Rock-Paper-Scissors is a game played between two individuals. \n "
                + "The rules of the game are Rock breaks Scissors, Scissors cut Paper, \n "
                + "and Paper covers Rock. In this game, the user will play against the computer.");
    }

    public static String getUserChoice(int userChoice) {

        String humanResult;


        switch (userChoice) {
            case ROCK:
                humanResult = "Rock";
                break;
            case SCISSORS:
                humanResult = "Paper";
                break;
            case PAPER:
                humanResult = "Scissors";
                break;
            default:
                humanResult = "Not a Valid Choice";
        }

        return humanResult;
    }

    public static void generateRandomNumber() {
    }
}
