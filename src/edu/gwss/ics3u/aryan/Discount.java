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
public class Discount {
public static void main ( String[] args ) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter amount of purchases: ");
         double priceOfPurchase = input.nextDouble();
         if( priceOfPurchase >= 10) {
             double amountOfDiscount = priceOfPurchase /10;
             priceOfPurchase = priceOfPurchase - amountOfDiscount;
             System.out.println ("Discounted price: " + priceOfPurchase);
    }
         }


}
