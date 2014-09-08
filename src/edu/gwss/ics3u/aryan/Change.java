/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gwss.ics3u.aryan;

import java.util.Scanner;

/**
 *
 * @author 1GHAHREMANZA
 */
public class Change {
    public static void main ( String[] args ) {
   Scanner input = new Scanner(System.in);

   System.out.print(" Enter the number of coins here: ");
   int amountOfChange= input.nextInt();
   int amountOfQuarters = amountOfChange / 25;
   amountOfChange = amountOfChange % 25;
   int amountOfDimes = amountOfChange / 10;
   amountOfChange = amountOfChange % 10;
   int amountOfNickels = amountOfChange / 5;
   amountOfChange = amountOfChange % 5;
   int amountOfPennies = amountOfChange / 1;


   System.out.println("The minimum amount of coins is: ");
   System.out.println("Quarters: " + amountOfQuarters);
   System.out.println("Dimes: " + amountOfDimes);
   System.out.println("Nickels: "+ amountOfNickels);
   System.out.println("Pennies: "+ amountOfPennies);


}
}
