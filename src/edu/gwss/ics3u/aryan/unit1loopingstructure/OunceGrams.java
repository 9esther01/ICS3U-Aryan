package edu.gwss.ics3u.aryan.unit1loopingstructure;

import java.text.NumberFormat;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: October 4th 2013 
 * Version: v0.1 
 * Description: A program that prints out a titled table that can be used to convert ounces to grams, for values from 1 to 15 ounces.
 */
public class OunceGrams {

    public static void main(String[] args) {

        // variable list
        int ounceNumber;
        final double GRAMS_CONVERSION = 28.35;

        //object list for decimals
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(2);


        // Description of program
        System.out.println("Ounce to Grams Conversion Chart. ");
        System.out.println("This program will print out a table that can be used to convert ounces to grams, for values from 1 to 15)");

        //Formats the table title
        System.out.format("%-10s %4s", "Ounces", "Grams");
        System.out.println("");

        // for loop to repeat the conversion 15 times
        for (ounceNumber = 1; ounceNumber < 16; ounceNumber++) {
            System.out.format("%-10s %-8s", decimal.format(ounceNumber), decimal.format(ounceNumber * GRAMS_CONVERSION)); // calculation to convert ounces into grams and also formats the table
            System.out.println("");
        }










    }
}
