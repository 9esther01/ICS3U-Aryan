/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.slotmachine;

import java.util.Scanner;

/**
 *
 * @author 1GHAHREMANZA
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //var list
        int a;
        int b;
        int c;
        int amountOfCoins = 50;
        int userChoice = 0;
        
        //object list
        Scanner input = new Scanner(System.in);


        while (amountOfCoins > 0 || userChoice == 2) {
            System.out.println("Press 1 to play and 2 to exit.");
            
            userChoice = input.nextInt();
            
            if (userChoice == 1) {
                amountOfCoins--;
                a = (int) (Math.random() * 4) + 1;
                b = (int) (Math.random() * 4) + 1;
                c = (int) (Math.random() * 4) + 1;
                System.out.format("%6s %6s %6s %17s \n", a, b, c, amountOfCoins);
                if (a == 1 && b == 1 && c == 1) {
                } else if (a == 1 && b == 1 && c == 1) {
                    System.out.println("You won 4 tokens.");
                    amountOfCoins = amountOfCoins + 4;
                } else if (a == 2 && b == 2 && c == 2) {
                    System.out.println("You won 6 tokens.");
                    amountOfCoins = amountOfCoins + 6;
                } else if (a == 3 && b == 3 && c == 3) {
                    System.out.println("You won 8 tokens.");
                    amountOfCoins = amountOfCoins + 8;
                } else if (a == 4 && b == 4 && c == 4) {
                    System.out.println("You won 10 tokens.");
                    amountOfCoins = amountOfCoins + 10;
                }

            } else if (userChoice == 2) {
                System.out.println("Thanks for playing");
            } else {
                System.out.println("Invalid choice, try again: ");
            }
        }

    }
}
