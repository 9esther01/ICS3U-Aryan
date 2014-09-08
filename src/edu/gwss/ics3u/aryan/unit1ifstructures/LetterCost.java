package edu.gwss.ics3u.aryan.unit1ifstructures;

import java.util.Scanner;

/**
 *
 * Name: Aryan Ghahremanzadeh 
 * Date: September 25, 2013 
 * Version: v0.1
 * Description: This program will ask the user what kind of letter they want and
 * depending on the weight it will calculate the cost.
 */
public class LetterCost {

    public static void main(String[] args) {
        // variable list
        int classChoice;
        int weightOfLetter = 0;
        double cost = 0;
        double totalCost;
        double additionalCost1 = (weightOfLetter - 100) * 0.0048;
        double additionalCost2 = (weightOfLetter - 100) * 0.0038;

        // object list
        Scanner input = new Scanner(System.in);

        //description on what the program does 
        System.out.println("This program will calculate the cost of a first class or second class letter depending on the weight of the letter");
        System.out.print("Enter letter class (1 for first class, 2 for second class): ");
        classChoice = input.nextInt(); // gets choice of first class or second class
        System.out.print("Enter the mass of the letter in grams: ");
        weightOfLetter = input.nextInt(); // gets the weight of the letter in grams

        // checks if first class or second class or an invalid option
        if (classChoice == 1) { //first class
            if (weightOfLetter <= 30 && weightOfLetter > 0) { //calcualtes the cost depending on the weight of the letter
                cost = 0.38;
            } else if (weightOfLetter <= 50) {
                cost = 0.55;
            } else if (weightOfLetter <= 100) {
                cost = 0.73;
            } else if (weightOfLetter > 100) {
                additionalCost1 = (weightOfLetter - 100) * 0.0048; // calcualtion for the additional cost of a first class letter
                cost = 0.73 + additionalCost1;
            } else {
                System.out.println("Error! Not a valid choice!");
                cost = 0;
            }
        } else if (classChoice == 2) { //second class
            if (weightOfLetter <= 30 && weightOfLetter > 0) { //calcualtes the cost depending on the weight of the letter
                cost = 0.28;
            } else if (weightOfLetter <= 50) {
                cost = 0.4;
            } else if (weightOfLetter <= 100) {
                cost = 0.55;
            } else if (weightOfLetter > 100) {
                additionalCost2 = (weightOfLetter - 100) * 0.0038; // calcualtion for the additional cost of a second  class letter
                cost = 0.5 + additionalCost2;
            } else { // if class choice is invalid then the program will let the user know
                System.out.println("Error! Not a valid choice!");
                cost = 0;
            }
        } else { // invalid choice
            System.out.println("Not a valid class choice. Cannot make calculation. ");
        }

        if (cost > 0) { // if cost of the letter is set then it shows a final message letting the user know the final cost of the letter. 
            System.out.println("The cost of sending this letter is $" + cost);
        }

    }
}
