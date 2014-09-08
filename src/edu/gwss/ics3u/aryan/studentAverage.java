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
public class studentAverage {
public static void main ( String[] args ) {
         Scanner input = new Scanner(System.in);
         System.out.print("What's your name?: ");
         String userName = input.nextLine();
         System.out.print("WHat was your average for subject #1?: ");
         double mark1 = input.nextInt();
         System.out.print("WHat was your average for subject #2?: ");
         double mark2 = input.nextInt();
         System.out.print("WHat was your average for subject #3?: ");
         double mark3 = input.nextInt();
         System.out.print("WHat was your average for subject #4?: ");
         double mark4 = input.nextInt();

          System.out.println(" Your average is " + ((mark1 + mark2 + mark3 + mark4)/ 4));


    }

}
