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
public class OrderChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of bolts: ");
        int numOfBolts = input.nextInt();
        System.out.print("Number of nuts: ");
        int numOfNuts = input.nextInt();
        System.out.print("Number of washers: ");
        int numOfWashers = input.nextInt();
        System.out.println("");
        if ((numOfNuts == numOfBolts) && (numOfWashers >= (numOfBolts * 2))) {
            System.out.print("Order is OK");
        } else if (numOfNuts != numOfBolts) {
            if (numOfNuts > numOfBolts) {
                System.out.println("Check the Order: too few bolts");
            } else {
                System.out.println("Check the Order: too few nuts");
            }
        } else if (numOfWashers < (numOfBolts * 2)) {
            System.out.println("Check the Order: too few Washers");
        }
        System.out.println("");
        int totalPrice = (numOfBolts * 5) + (numOfNuts * 3) + numOfWashers;
        System.out.println("The total price is $" + totalPrice);


    }
}

