package edu.gwss.ics3u.aryan.unit1loopingstructure;

import java.text.NumberFormat;

/**
 * Name: Aryan Ghahremanzadeh
 * Date: October 4th 2013
 * Version: v0.1
 * Description: This program calculates how many years it takes for the soil in Canada to erode to a level which crops can't grow. 
 */
public class Erosion {

    public static void main(String[] args) {
        
        // variable list
        final double NEW_SOIL_AMOUNT = 0.005;
        double soilDepth = 30;
        int years = 0;
        //object list
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(3);
        
        // Title and Description of program
        System.out.println("Top Soll Erosion");
        System.out.println("Careless land management causes approximately 1% of the topsoil to erode each year.");
        System.out.println("It is then lost forever, since it takes nature approximately 500 years to produce 2.5cm of topsoil.");
        System.out.println("At 9cm, the topsoil is so shallow the crops cannot grow on a large scale.");
        System.out.println("");
        // Formats the table
        System.out.format("%6s %20s \n", "Years ", "Soild Depth");
        // loop that calculates soil length till depth is 9cm. 
        while (soilDepth >= 9) {
            System.out.format("%6s %20s \n", years, decimal.format(soilDepth)); //formats output into table
            soilDepth = soilDepth - (soilDepth / 100) + NEW_SOIL_AMOUNT;
            years++;
        }
        // To show it is past 9cm and is formatted into the table
        System.out.format("%6s %20s \n", years, decimal.format(soilDepth));
        // Final concluding sentance
        System.out.println("Therefore the topsoil will decrease to 9cm during the " + (years - 1) + " year.");
        System.out.println("Which is the level that crops wiil not be able to grow at.");
    }
}
    





