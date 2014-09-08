/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.methodpractice;

/**
 *
 * @author 1GHAHREMANZA
 */
public class NumberWords2 {

    public static String tenss;
    public static String teenss;
    public static String oness;
    public static int num1 = 17;
    public static int tens;
    public static int tensCopy;
    public static int ones;

    public static void main(String[] args) {
        if (num1 < 10 || num1 > 19) {
            ones = ((num1 % 10));
            tens = (num1 - ones) / 10;
        } else if (num1 >= 10 && num1 < 20) {
            switch (num1) {
                case 10:
                    teenss = "Ten ";
                    break;
                case 11:
                    teenss = "Eleven ";
                    break;
                case 12:
                    teenss = "Twelve";
                    break;
                case 13:
                    teenss = "Thirteen";
                    break;
                case 14:
                    teenss = "Fourteen";
                    break;
                case 15:
                    teenss = "Fifteen";
                    break;
                case 16:
                    teenss = "Sixteen";
                    break;
                case 17:
                    teenss = "Seventeen";
                    break;
                case 18:
                    teenss = "Eighteen";
                    break;
                case 19:
                    teenss = "Nineteen";
                    break;
            }
        }
        switch (tens) {
            case 2:
                tenss = "Twenty ";
                break;
            case 3:
                tenss = "Thirty ";
                break;
            case 4:
                tenss = "Fourty";
                break;
            case 5:
                tenss = "Fifty";
                break;
            case 6:
                tenss = "Sixty";
                break;
            case 7:
                tenss = "Seventy";
                break;
            case 8:
                tenss = "Eighty";
                break;
            case 9:
                tenss = "Ninety";
                break;
        }



        switch (ones) {
            case 1:
                oness = "One";
                break;
            case 2:
                oness = "Two ";
                break;
            case 3:
                oness = "Three";
                break;
            case 4:
                oness = "Four";
                break;
            case 5:
                oness = "Five";
                break;
            case 6:
                oness = "Six";
                break;
            case 7:
                oness = "Seven";
                break;
            case 8:
                oness = "Eight";
                break;
            case 9:
                oness = "Nine";
                break;

        }
        if (num1 > 10 && num1 < 20) {
            System.out.println(teenss);
        } else if (num1 % 10 == 0) {
            System.out.println(tenss);
        } else if (num1 < 10) {
            System.out.println(oness);
        } else {
            System.out.println(tenss + " " + oness);

        }
    }
}
