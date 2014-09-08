package edu.gwss.icsu.aryan.methods;
/* Name: Aryan Ghahremanzadeh
 * Date: October 28th, 2013
 * Version: 0.1v
 * Descrrption: This program determines if the check digit for a SIN is correct using the proper steps. 
 */
import java.util.Scanner;

public class SINCheck {

    public static void main(String[] args) {
        // Variable list
        String sin;
        int doubledValueSum = 0;
        int otherDigitSum = 0;
        int total = 0;
        int lastDigit;
        int doubledValue;
        int checkDigit;
        int tens;
        // Object list
        Scanner input = new Scanner(System.in);
        
        //Description of SIN number and what program does
        System.out.print("In Canada, each person is uniquely identified by the Government with a Social Insurance Number \n"
                + "A Social Insurance Number consists of nine digits. The first eight numbers are assigned digits and the \n"
                + "last number is a digit check. This program determines if the check digit for a SIN is correct. \n");
        
        System.out.print("Enter a SIN number (no spaces before, after or in between): ");
        // gets sin input 
        sin = input.next(); // gets input (test using 130692544)
        lastDigit = Integer.parseInt("" + sin.charAt(sin.length() - 1)); // finds the last digit on sin
        
        //gets doubled value sum of even numbers
        for (int i = 1; i < sin.length(); i = i + 2) {
            doubledValue = 2 * Integer.parseInt("" + sin.charAt(i)); // doubles values
            doubledValueSum = doubledValueSum + ((doubledValue / 10) % 10) + (doubledValue % 10); // adds doubled values up together
        }
        // gets sum of odd numbers
        for (int i = 0; i < sin.length() - 1; i = i + 2) { 
            otherDigitSum = otherDigitSum + Integer.parseInt("" + sin.charAt(i)); // adds sum of other digits
        }
        total = doubledValueSum + otherDigitSum; // Calculates total
        tens = (total / 10) % 10; // Calculates remainder for tens in number
        checkDigit = ((tens + 1) * 10) - total; // adds one to tens and finds check digit
        
        //final statement of whether sin is corrct or not
        if (checkDigit == lastDigit) {
            System.out.println("SIN number is correct");
        } else {
            System.out.println("SIN number is NOT correct.");
        }
    }
}
