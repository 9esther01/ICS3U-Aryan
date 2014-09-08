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
public class Y2KDetector {

    public static void main(String[] args) {

        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("Year of birth: ");
        int birthYear = input.nextInt();
        System.out.print("Current year: ");
        int currentYear = input.nextInt();
        if (birthYear > currentYear) {
            age = (currentYear + 100) - birthYear;
        } else {
            age = currentYear - birthYear;

        }
        System.out.println("Current age: " + age);
    }
}
