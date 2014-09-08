package edu.gwss.ics3u.aryan.unit1loopingstructure;

import java.util.Scanner;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: October 4th 2013 
 * Version: v0.1 
 * Description: The program will determine when the population will outgrow the food supply in a lab of animals.
 */
public class LabAnimals {

    public static void main(String[] args) {

        //variable list
        int initialFood;
        int endFood;
        int initialAnimal;
        int endAnimal;
        int foodAdded;
        int hour = 1;

        //object list
        Scanner input = new Scanner(System.in);
        
        //Title
        System.out.println("Lab Animals");
        //Description of how program works and what it does
        System.out.println("At present there are X animals in the lab and enough food for Y animals.\n"
                + "At the end of every hour the population doubles, and enough food is added to support Z more animals.\n"
                + "During any hour the animals will eat enough food for only themselves.\n"
                + "The program will determine when the population will outgrow the food supply.\n");


        System.out.print("Enter the Initial Population: ");
        initialAnimal = input.nextInt();
        // Makes sure it is not a negative amount
        while (initialAnimal < 0) {
            System.out.println("Invalid amount!");
            System.out.print("Enter the Initial Population: ");
            initialAnimal = input.nextInt();
        }
        System.out.print("Enter the Initial Food Supply: ");
        initialFood = input.nextInt();
        // Makes sure it is not a negative amount
        while (initialFood < 0) {
            System.out.println("Invalid amount!");
            System.out.print("Enter the Initial Population: ");
            initialFood = input.nextInt();
        }
        System.out.print("Enter the Amount of Food to Add Each Hour: ");
        foodAdded = input.nextInt();
        // Makes sure it is not a negative amount
        while (foodAdded < 0) {
            System.out.println("Invalid amount!");
            System.out.print("Enter the Initial Population: ");
            foodAdded = input.nextInt();
        }
        
        // Formats the headers of the tables
        System.out.format("%6s %15s %15s %12s %15s,\n", "Hour |", "Animal At Start |", "Food At Start |", "Food At End |", "Animals At End |");
        // loop that continues until food runs out
        while (initialFood > initialAnimal) {
            endAnimal = initialAnimal * 2; // calculation for animal at end
            endFood = initialFood + foodAdded - initialAnimal; // Calculation for food at end
            System.out.format("%6s %15s %12s %15s %15s \n", hour, initialAnimal, initialFood, endFood, endAnimal); // Formats the output of the table
            initialAnimal = endAnimal; // initial animals is set to animals at end of last hour
            initialFood = endFood; // initial food is set to the food at end of the last hour
            hour++; // adds one to the hour
        }
    }
}
