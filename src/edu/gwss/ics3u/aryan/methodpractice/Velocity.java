/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.methodpractice;

import edu.gwss.ics3u.aryan.input;
import java.util.Scanner;

public class Velocity {

    public static double time;
    public static double distance;
    public static double velocity;
    public static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {
       getData();
       displayData();

    }

    public static void getData() {
        System.out.println ("What is the distance?");
        distance = input.nextInt();
        System.out.println ("What is the time?");
        time = input.nextInt();
    }

    public static void displayData() {
        velocity = distance / time;
        System.out.println ("The velocity is " + velocity);
    }
}
