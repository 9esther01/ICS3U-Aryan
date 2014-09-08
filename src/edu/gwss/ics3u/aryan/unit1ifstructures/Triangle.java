package edu.gwss.ics3u.aryan.unit1ifstructures;

import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: September 25, 2013 
 * Version: v0.1
 * Description: The user enters three lengths of sides and the program
 * determines whether the figure is a triangle or not.
 */
public class Triangle {

    public static void main(String[] args) {

        // variable list
        int side1;
        int side2;
        int side3;

        // object list
        Scanner input = new Scanner(System.in);

        //description of program
        System.out.println("Triangle");
        System.out.println("Three numbers represent the sides of a triangle when the sum of any two sides");
        System.out.println("is greater than the thirds side. This program has the suer enter three ");
        System.out.println("length of sides and determines whether the figure is a triangle or not.");

        // Gets side 1, side 2 and side 3
        System.out.print("Enter length of side 1: ");
        side1 = input.nextInt();
        System.out.print("Enter length of side 2: ");
        side2 = input.nextInt();
        System.out.print("Enter length of side 3: ");
        side3 = input.nextInt();

        // calculation to see if the length of 2 sides is smaller than a third side to check if it makes a triangle
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Cannot make a triangle!");
        } else {
            System.out.println("Can make a traingle!");
        }
    }
}
