package edu.gwss.icsu.aryan.methods;
/* Name: Aryan Ghahremanzadeh
 * Date: October 28th, 2013
 * Version: 0.1v
 * Descrrption: This program reduces a fraction to its lowest possible value.
 */

import java.util.Scanner;

public class ReduceFraction {

    public static void main(String[] args) {
        // variable list
        int num = getNum();
        int den = getDen();
        int absNum = Math.abs(num); //uses absolute value
        int absDen = Math.abs(den);//uses absolute value
        int sign = 1;
        // Description of program
        System.out.println("This program reduces any fraction to its lowest possible form.");
        // if signs or less than zero it makes the sign a negative
        if (num * den < 0) {
            sign = -1;
        }
        //gets commondivisor from method
        int commonDivisor = getGcd(absNum, absDen);
        // prints the final reduced fraction
        System.out.println("The reduced fraction will be " + (sign * (absNum / commonDivisor)) + "/" + (absDen / commonDivisor));
    }

    public static int getNum() {
        //object list
        Scanner input = new Scanner(System.in);
        // gets numerator
        System.out.println("Enter the numerator: ");
        int num = input.nextInt();
        return num;
    }

    public static int getDen() {
        int den;
        //object list
        Scanner input = new Scanner(System.in);
        // gets denominator        
        do {
            System.out.println("Enter the denominator: ");
            den = input.nextInt();
            if (den == 0) {
                System.out.println("Not a valid number try again");
            } 
                
        } while (den == 0);
        return den;

    }

    public static int getGcd(int numerator, int denominator) {
        // if numerator is 0 there is no common denominator
        if (numerator == 0) {
            return denominator;
        }
        // if not 0 then find common divisor
        while (denominator != 0) { // exits when denominator is zero because numerator will be GCD
            if (numerator > denominator) { //always decreases other amount from the bigger of either the numerator or denominator until denominator becomes zero
                numerator = numerator - denominator;
            } else { 
                denominator = denominator - numerator;
            }
        }
        return numerator;
    }
}
