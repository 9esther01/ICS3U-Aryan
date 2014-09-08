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
public class Digits {
    public static void main ( String[] args ){
   Scanner input = new Scanner(System.in);
   System.out.print ("Enter a number: ");
   int userInput = input.nextInt();

   int hundreds = userInput % 1000;
   hundreds = hundreds / 100;
   int tens = userInput % 100;
   tens = tens / 10;
   int ones = userInput % 10;

   System.out.println("There is " + hundreds + " hundreds");
   System.out.println("There is "+ tens + " tens" );
   System.out.println("There is "+ ones + " ones" );
}
}