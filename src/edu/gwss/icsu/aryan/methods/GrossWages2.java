package edu.gwss.icsu.aryan.methods;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: October 28th, 2013
 * Version: 0.1v
 * Description: A program that gets the hours and hourly wage and calculates your weekly pay in Canada (including overtime) and in other countries in the world as well. 
 *
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class GrossWages2 {
    // constants list
    static final double BANGLADESH = 0.15;
    static final double CHINA = 0.48;
    static final double DOMINICAN_REPUBLIC = 1.60;
    static final double HAITI = 0.55;

    public static void main(String[] args) { 
        System.out.println("This program gets the hours and hourly wage and calculates your weekly pay in Canada and other deceloping countries around the world. \n"
                + "It calculates overtime (over 40 hours) to be time and a half");
        double wage;
        int hours;

        wage = getWage();
        hours = getHours();
        calculateWage(hours, wage);

    }

    public static double getWage() {
        //variable list
        double wage;
        //object list
        Scanner input = new Scanner(System.in);
        //gets wage
        System.out.println("Enter your hourly wage: ");
        wage = input.nextDouble();
        return wage; //returns wage

    }

    public static int getHours() {
        //variable list
        int hours;
        //object list
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of hours you work during a week: ");
        hours = input.nextInt();
        return hours; //returns wage

    }

    public static void calculateWage(double hours, double wage) {
        // variable list
        double overTime;
        double canadianWage;
        //object list
        NumberFormat money = NumberFormat.getCurrencyInstance(); //money format
        //calculates canadian wage for overtime and without overtime
        if (hours < 40) {
            canadianWage = (wage * hours);
        } else {
            overTime = hours - 40;
            hours = 40;
            canadianWage = (wage * hours) + (overTime * (wage * 1.5));
        }
        // Final output statement of what wages will be in Canada and other parts of the world
        System.out.println("");
        System.out.println("Canada: " + money.format(canadianWage));
        System.out.println("Bangladesh: " + money.format((hours * BANGLADESH)));
        System.out.println("China: " + money.format((hours * CHINA)));
        System.out.println("Domincan Rebublic: " + money.format((hours * DOMINICAN_REPUBLIC)));
        System.out.println("Haiti: " + money.format((hours * HAITI)));
    }
}
