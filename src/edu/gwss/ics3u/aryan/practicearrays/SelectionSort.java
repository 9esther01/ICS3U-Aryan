/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.practicearrays;

/**
 *
 * @author 1GHAHREMANZA
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] randNum = new int[10];
        fillArrayWithRandomNumbers(randNum, 1, 10);

        // Display
        System.out.println("BEFORE: ");
        displayValues(randNum);

        // Sort
        selectionSort(randNum);

        // Display
        System.out.println("AFTER: ");
        displayValues(randNum);
    }

    public static void fillArrayWithRandomNumbers(int[] data, int startValue, int numOfValues) {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * numOfValues) + startValue;
        }
    }

    public static void displayValues(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void selectionSort(int[] intArray) {

        int n = intArray.length;
        int temp = 0;

        for (int pass = 0; pass < n; pass++) {
            for (int j = 1; j < (n - pass); j++) {

            }
        }


    }
}
