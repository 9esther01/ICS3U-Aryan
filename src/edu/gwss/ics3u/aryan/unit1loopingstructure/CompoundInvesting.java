package edu.gwss.ics3u.aryan.unit1loopingstructure;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: October 4th 2013 
 * Version: v0.1
 * Description: This program will print out a title table that will display the amount of a yearly investment over a period of up to 15 years.
 */
public class CompoundInvesting {

    public static void main(String[] args) {

        // variable list
        double yearlyInvestment;
        int numberOfYears;
        int loopStop;
        double total;
        double amountInAccount;
        double interestRate;
        double currentAmount;
        double interest;

        //object list
        NumberFormat money = NumberFormat.getCurrencyInstance(); //money format
        Scanner input = new Scanner(System.in);

        // Description of program
        System.out.println("This program will print out a title table that will display the amount of a yearly investment over a period of up to 15 years.");

        // asks and gets user input for amounts needed and calculates current amount and total using them
        System.out.print("Enter the yearly investment: ");
        yearlyInvestment = input.nextDouble();
        // checks if input is valid amount
        while (yearlyInvestment < 0) {
            System.out.println("That's an invalid option, try again");
            yearlyInvestment = input.nextDouble();
        }
        
        currentAmount = yearlyInvestment;
        
        System.out.print("Enter the interest rate: ");
        interestRate = input.nextDouble();
        // checks if input is valid amount
        while (interestRate < 0) {
            System.out.println("That's an invalid option, try again");
            System.out.print("Enter the interest rate: ");
            interestRate = input.nextDouble();           
        }
        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextInt();
        // checks if input is valid amount
        while (numberOfYears < 0 && numberOfYears > 16) {
            System.out.println("That's an invalid option, try againremember it will only calculate up to 15 years");
            System.out.print("Enter the number of years: ");
            numberOfYears = input.nextInt();

        }
        total = yearlyInvestment;
        
        // formats table title
        System.out.format("%-10s %8s %12s %10s", "Year", "Amount in Account", "Interest", "Total");
        System.out.println("");

        // loops to the same number as the amount of years the user inputs and makes calculations for all values
        for (int years = 1; years <= numberOfYears; years++) {
            interest = currentAmount * (interestRate / 100);
            total = currentAmount + interest;
            // formats and puts all the values in the table
            System.out.format("%-10s %7s %20s %12s", years, money.format(currentAmount), money.format(interest), money.format(total));
            System.out.println("");
            currentAmount = total + yearlyInvestment;

        }

    }
}
