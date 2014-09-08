/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gwss.ics3u.aryan;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1GHAHREMANZA
 */
public class RestarauntTab {
public static void main ( String[] args ){
    Scanner input = new Scanner(System.in);
    double costOfMeal = input.nextInt();
    double tax = costOfMeal * 0.13;
    double totalCost = costOfMeal + tax;

    // Money (localized)
    NumberFormat money = NumberFormat.getCurrencyInstance();

    System.out.println ("The cost of the meal is " + money.format (costOfMeal));
    System.out.println ("The tax is " + money.format (tax ));
    System.out.println ("The total cost is " + money.format (totalCost));
    }

}