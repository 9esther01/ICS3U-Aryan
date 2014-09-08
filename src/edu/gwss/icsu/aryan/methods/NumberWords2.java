package edu.gwss.icsu.aryan.methods;
/* Name: Aryan Ghahremanzadeh
 * Date: October 28th, 2013
 * Version: 0.1v
 * Descrrption: This program gets a number from the user and converts it into words. 
 */
import java.util.Scanner;


public class NumberWords2 {
    //global variable list
    public static int userInput;
    public static int ones;
    public static int tens;
    public static int hundreds;

    
    public static void main(String[] args) {
        // Description of program
        System.out.println("This program converts a number into the word");
        getUserInput(); //gets user input
        ones = (userInput % 10); //calculates for case of ones
        tens = (userInput / 10) % 10; // calcuates for case of tens
        hundreds = (userInput / 100) % 10; // calculates for case of 20's
        if (userInput >= 11 && userInput <= 19) { // puts different name for teens
            teens();
        } else {
            hundreds();
            if (tens == 1) { // if tens is in the teens it puts teens name
                teens();
            } else { // put tens and one name
                tens();
                ones();
            }
        }
    }
    public static void getUserInput() {
        //object list
        Scanner input = new Scanner(System.in);

        do { //loops till it gets proper user input

        System.out.println("Input a number: "); //gets input
        userInput = input.nextInt();

        if (userInput > 999 || userInput < 0) { //error message if invalid amount
            System.out.println("Invalid amount!");
        }
       } while (userInput > 999 || userInput < 0); // exits when input is valid amount
    }
    public static void ones() {
        switch (ones) { // determines what each number in the ones column is
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }
    public static void tens() {
        switch (tens) { // determines what each number in the tens column is
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("fourty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
    }
    public static void teens() {
        switch (ones) { // determines what each number in the teens column is
            case 0:
                System.out.println("ten");
                break;
            case 1:
                System.out.println("eleven");
                break;
            case 2:
                System.out.println("twelve");
                break;
            case 3:
                System.out.println("thirteen");
                break;
            case 4:
                System.out.println("fourteen");
                break;
            case 5:
                System.out.println("fifteen");
                break;
            case 6:
                System.out.println("sixteen");
                break;
            case 7:
                System.out.println("seventeen");
                break;
            case 8:
                System.out.println("eighteen");
                break;
            case 9:
                System.out.println("nineteen");
                break;
        }
    }
    public static void hundreds() {
        switch (hundreds) { // determines what each number in the hundreds column is
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;
        }
    }
}