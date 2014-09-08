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
public class MmmmMath {
public static void main ( String[] args ) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the width: ");
         int x = input.nextInt();
         System.out.print("Enter the length: ");
         int y = input.nextInt();
         int area = (x * y);
         int perimiter = (x + x + y + y);
         System.out.println ("The width is " + x + "  and the length is " + y );
         System.out.println("The area is " + area );
         System.out.println("The perimiter is " + perimiter );



        }
}