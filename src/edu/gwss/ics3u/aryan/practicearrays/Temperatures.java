/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.practicearrays;

import java.util.Scanner;

/**
 *
 * @author 1GHAHREMANZA
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] temperature = new int[7];
        double sum = 0;
        int max = temperature[0];
        int min = temperature[0];

        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Enter the temperature for Day " + (i + 1) + ": ");
            temperature[i] = input.nextInt();

        }
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Score " + (i + 1) + " is " + temperature[i]);
            sum = sum + temperature[i];
            if (max < temperature[i]) {
                max = temperature[i];
            } else if (min > temperature[i]) {
                min = temperature[i];
            }
        }
        System.out.println("Max temperature is " + max);
        System.out.println("Min temperature is " + min);
        System.out.println("Average score is " + (sum / 7));
    }
}
//called method that needed integer and returned back to main they didnt change because it was pass by value?
//pass by value or pass by refrence