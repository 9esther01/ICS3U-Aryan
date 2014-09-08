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
public class alienDetector {

    public static void main(String[] args) {

        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("How many antennas? ");
        int antennas = input.nextInt();
        System.out.print("How many eyes? ");
        int eyes = input.nextInt();
        if ((antennas >= 3) && (eyes <= 4)) {
            System.out.println("TroyMartian");
            }
         else if ((antennas <= 6) && (eyes >= 2)) {
            System.out.println("VladSaturnian");
         }
    }
}
