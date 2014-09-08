package edu.gwss.ics3u.aryan.unit1ifstructures;

import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh Date: September 25, 2013 Version: v0.1
 * Description: This program determines if the pH level in water is safe for the
 * fish.
 *
 */
public class AcidRain {

    public static void main(String[] args) {

        // variable list
        double pHlevel;

        // object list
        Scanner input = new Scanner(System.in);

        // description of program and acid rain
        System.out.println("Acid Rain!");
        System.out.println("Acid rain is rain that has been made acidic by certain pollutants in the air. Acidity is measured ");
        System.out.println("using a pH scale. This program determines if the pH level in water is safe for the fish");
        System.out.print("Enter a pH level: ");
        pHlevel = input.nextDouble(); // gets pH level

        // to see if the pH is a valid number and if it is, then is it too acidic, alkaline or neutral
        if (pHlevel > 14 || pHlevel < 0) { //checks if it's an invalid number
            System.out.println("Error! Invalid pH level! ");
        } else if (pHlevel > 7.5) { //if pH is greater than 7.5 it is too alkaline
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pHlevel < 6.5) { //if pH is lower than 6.5 it is too acidic
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else { // if pH is neither of the 3 comparisons above then fish can survive
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");

        }
    }
}
