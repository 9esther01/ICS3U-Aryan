package edu.gwss.ics3u.aryan.unit1loopingstructure;

/**
 * Name: Aryan Ghahremanzadeh
 * Date: October 4th 2013
 * Version: v0.1
 * Description: This program will print the first twenty terms of the Fibonnacci Series.
 */
public class FibonacciSeries {


    public static void main(String[] args) {
        //var list
        int a = 1;
        int b = 1;
        int c = a + b;
        
        // Title and description
        System.out.println("Fibonacci Series");
        System.out.println("This program will print the first twenty terms of the Fibonnacci Series");
        // puts a and b for first 2 terms
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        // repeats calculation for c 18 times to get the first 20 terms of the fibbonacci Series (2 calculations were made before)
        for (int times = 1; times <= 18; times++) {
            System.out.print(c + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
