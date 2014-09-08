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
public class HallCost {
public static void main ( String[] args ) {
         Scanner input = new Scanner(System.in);
         System.out.print("What's your name?: ");
         String userName = input.nextLine();
         System.out.print("How many people?: ");
         int amountOfGuests = input.nextInt();
         System.out.print("How much does each person cost ?: ");
         double costPerPerson = input.nextDouble();
         System.out.println("The cost per person is: " + (350 + (amountOfGuests * costPerPerson)));

}
}
