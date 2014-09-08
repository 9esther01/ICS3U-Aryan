package edu.gwss.ics3u.aryan.unit1ifstructures;

import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: September 25, 2013 
 * Version: v0.1
 * Description: The user enters three lengths of sides and the program determines whether the figure is a right triangle or not.
 *
 */
public class RightTriangle {

    public static void main(String[] args) {

        //variable list
        int side1;
        int side2;
        int side3;
        int n1;
        int n2;
        int n3;

        //object list
        Scanner input = new Scanner(System.in);

        //description for what the program does
        System.out.println("Right Triangle");
        System.out.println("A right-angled triangle has the property that when the values of the lengths");
        System.out.println("of the sides are squared, the sum of the two smaller values is equal to the");
        System.out.println("larger value. This program asks the user to enter three values then");
        System.out.println("determines whether the triangle created is a right triangle or not.");
        System.out.print("Enter length of side 1: ");
        n1 = input.nextInt(); //gets side 1
        System.out.print("Enter length of side 2: ");
        n2 = input.nextInt(); //gets side 2
        System.out.print("Enter length of side 3: ");
        n3 = input.nextInt(); //gets side 3
        // squares each side
        side1 = n1 * n1;
        side2 = n2 * n2;
        side3 = n3 * n3;

        if (side1 + side2 == side3 || side1 + side3 == side2 || side2 + side3 == side1) { // calculation to see if it can make a right traingle if the sqaured of 2 sides is equal to one 
            System.out.println("Can make a triangle!");
        } else {
            System.out.println("Cannot make a traingle!"); // if it does not match any of the calculations it does not make a right traingle
        }
    }
}
