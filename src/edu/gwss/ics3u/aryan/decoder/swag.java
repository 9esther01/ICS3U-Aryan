/*
 * Decoding Assignment
 */
package edu.gwss.ics3u.aryan.decoder;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 */
public class swag {

    static final int BASE_BINARY = 2;
    static final int BASE_OCTAL = 8;
    static final int BASE_HEX = 16;

    static Scanner message;
    static FileWriter responseFile;
    static int base = -1;

    /**
     * Decoding Template
     *
     * DO NOT TOUCH MAIN
     */
    public static void main(String[] args) throws Exception {
        
        // ---------------------------------------------
        // PART 1: decode message
        // Encoded Message
        message = new Scanner(new File("message.txt"));
        
        determineBase(message);
        message = new Scanner (new File("message.txt"));
        System.out.println( "File is base " + base );
        
        // Read Line( 1 Line == 1 Character )
        while (message.hasNext()) {

            System.out.print(
                    decodeCharacter(message.nextLine())
            );

        }
        System.out.println("");

        // ---------------------------------------------
        // PART 2: encode response
        String text = "I want perfect on this assignment.";

        // Endcode Response
        responseFile = new FileWriter(new File("response.txt"));
        randomBase();
        System.out.println("CONVERTING: ASCII to BASE " + base);

        // Encode EACH letter
        for (int i = 0; i < text.length(); i++) {

            // ENCODE LETTER
            responseFile.write(
                    encodeLetter(text.charAt(i)) + "\n"

            );
        }

        responseFile.close();
    }

    /**
     * randomBase
     */
    public static void randomBase() {
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                base = BASE_BINARY;
                break;
            case 1:
                base = BASE_OCTAL;
                break;
            case 2:
                base = BASE_HEX;
                break;
        }
    }

    /**
     * Part 1A
     *
     * TODO: Determine Base
     */
    public static int determineBase(Scanner message) {
        base = BASE_BINARY;
        boolean baseFound = false;

        while (message.hasNext() && !baseFound) {
            String text = message.nextLine();

            for (int i = 0; i < text.length(); i++) {
                switch (text.charAt(i) ) {
                    case 'F':
                    case 'f':
                    case 'E':
                    case 'e':
                    case 'D':
                    case 'd':
                    case 'C':
                    case 'c':
                    case 'B':
                    case 'b':
                    case 'A':
                    case 'a':
                    case '9':
                    case '8':
                        base = BASE_HEX;
                        i = text.length();
                        baseFound = true;
                        break;
                    case '7':
                    case '6':
                    case '5':
                    case '4':
                    case '3':
                    case '2':
                        base = BASE_OCTAL;
                        break;

                }
            }
        }

        return base;
    }

    /**
     * Part 1B
     *
     * Decode Character - BINARY, OCTAL or HEX
     */
    public static String decodeCharacter(String codedLetter) {

        
        // Determine Base
        char placeValue;
        int decimalValue;

        int sum = 0;
        for (int i = 0; i < codedLetter.length(); i++) {
            //System.out.println( "CHAR: " + codedLetter.charAt(codedLetter.length() - 1 - i) );
            placeValue = (char) codedLetter.charAt(codedLetter.length() - 1 - i);
           //System.out.println( "PV: " + placeValue );
            
            if ((int) placeValue >= 97 && (int) placeValue <= 102) {
                decimalValue = (int) placeValue - 87;
            } else {
                decimalValue = Integer.parseInt(Character.toString(placeValue));
            }
            //System.out.println( "DV: " + decimalValue );
            sum = sum + (int) Math.pow((double) base, (double) i) * decimalValue;
        }

        // TODO: 
        //  1.  convert BIN/HEX/OCT to Decimal (ASCII)
        //  2.  convert ASCII to String; 
        //      use - Character.toString ( (char) asciiCode );        
        return Character.toString((char) sum);
    }

    /**
     * Encode Message; TO BINARY!
     */
    public static String encodeLetter(char letter) {

       
        int value = 1;
        String encodedLetter = "" + (int) letter;

        // ENCODE LETTER;
        //   - letter is a CHAR (ASCII)
        //   - convert (cast) to int
        //   - convert int to the desired base
        System.out.println(letter + " --> " + encodedLetter);
        int remainder = -1;

        String text = "";

        value = (int) letter;
        do {
            remainder = value % base;
            value = value / base;

            if (base == 16) {
                switch (remainder) {
                    case 10:
                        text = "a" + text;
                        break;
                    case 11:
                        text = "b" + text;
                        break;
                    case 12:
                        text = "c" + text;
                        break;
                    case 13:
                        text = "d" + text;
                        break;
                    case 14:
                        text = "e" + text;
                        break;
                    case 15:
                        text = "f" + text;
                        break;
                    default: {
                        text = remainder + text;
                    }
                }
            } else {
                text = text + remainder;
            }
        } while (value > 0);
        System.out.println(text);

        return text;

    }
}


