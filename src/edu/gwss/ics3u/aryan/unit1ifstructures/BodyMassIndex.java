package edu.gwss.ics3u.aryan.unit1ifstructures;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: September 25, 2013 
 * Version: v0.1
 * Description: Body Mass Indicator and Calculator. Gets the human weight and
 * height in either imperial or metric and tells them there BMI.
 *
 */
public class BodyMassIndex {

    public static void main(String[] args) {

        // Variable list
        int userChoice;
        int weightLb;
        int heightIn;
        int weightKg;
        double heightM;
        double valueBMI;
        String resultBMI = "";

        // Object list
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(3);

        // descirbes that it is a BMI calculator
        System.out.println("Body Mass indec calculator");
        System.out.print("Press 1 for imperial measurements and press 2 for metric: ");
        userChoice = input.nextInt(); //gets user choice for imperial or metric

        valueBMI = 0; // sets value BMI incase the user chooses an invalid option. 

        //if user choice is 1 it asks for imperial measurements and if its 2 it asks for metric measurements
        if (userChoice == 1) {
            System.out.print("How much do you weigh in pounds: ");
            weightLb = input.nextInt(); // gets weight in pounds
            System.out.print("How tall are you in inches?: ");
            heightIn = input.nextInt(); // gets height in inches
            valueBMI = ((weightLb * 703) / (heightIn * heightIn)); // calculates BMI in imperial
        } else if (userChoice == 2) {
            System.out.print("How much do you weigh in kilograms?: ");
            weightKg = input.nextInt(); // gets weight in kilograms
            System.out.print("How tall are you in meters?: ");
            heightM = input.nextDouble(); // gets height in meters
            valueBMI = ((weightKg) / (heightM * heightM)); // calculates BMI
        } else { //gives error if it is another option
            System.out.println("Error! not one of the options");
        }
        //if BMI is set to a value then it says what the result is
        if (valueBMI > 0) {
            if (valueBMI < 15) {
                resultBMI = "starvation. ";
            } else if (valueBMI < 18.5) {
                resultBMI = "underweight. ";
            } else if (valueBMI < 25) {
                resultBMI = "ideal. ";
            } else if (valueBMI < 30) {
                resultBMI = "overweight. ";
            } else if (valueBMI <= 40) {
                resultBMI = "obese. ";
            } else if (valueBMI > 40) {
                resultBMI = "morbidly obese. ";
            }
            // puts a finals sentance that shows the value of the users BMI and the result
            System.out.println("Your BMI is " + decimal.format(valueBMI) + " this means that you are " + resultBMI);
        }
    }
}
