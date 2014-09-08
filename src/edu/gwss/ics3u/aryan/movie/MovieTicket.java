/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.movie;

import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh
 * Date: September 26 2013
 * Version: v0.1
 * Description: program that determines the price of a movie ticket based on time and age
 */
public class MovieTicket {

    public static void main(String[] args) {

        int movieTime = 2300;
        int age = 25;
        int martinee = 0;
        int ticketPrice = 0;
        
        // checks to see if movie is at martinee time or not
        if (movieTime < 1630) { //sets martinee price
            martinee = 1;
        } else if (movieTime > 2200 || movieTime < 900) { // gives error if before 9am or after 10pm because I assumed the movie theatre would be closed
            System.out.println("There are no movies at that time. ");
        } else {
            martinee = 2; // sets so it is not martinee price
        }

        switch (martinee) {
            case 1: // shows martinee price
                if (age < 14) {
                    ticketPrice = 4;
                } else {
                ticketPrice = 7;
                }
                break;
            case 2: // shows regular price
                if (age < 14) {
                    ticketPrice = 6;
                } else {
                    ticketPrice = 10;
                }
                break;
            default: //nothing if they enter invalid times

        }
        if (ticketPrice > 0) { //only shows the ticketPrice if it has been initialized
            System.out.println("The ticket cost is $" + ticketPrice);
        }
    }
}
