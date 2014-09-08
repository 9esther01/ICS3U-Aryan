package edu.gwss.ics3u.aryan.unit1loopingstructure;

/**
 * Name: Aryan Ghahremanzadeh 
 * Date: October 4th 2013 
 * Version: v0.1 
 * Description: This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... and so on gets closer to 2 without becoming 2.
 */
public class CloserToTwo {

    public static void main(String[] args) {
        //var list
        double result = 0;
        long denominator = 1;

        System.out.println("This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... and so on gets closer to 2 without becoming 2.");
        // repeats till result is 2
        while (result < 2.0) {
            System.out.print(result + " +  1/" + denominator + " = "); //shows calculation being made
            result = result + (1.0 / denominator);
            System.out.println(result); // shows result
            denominator = denominator * 2; // denominator doubles everytime
        }
    }
}
