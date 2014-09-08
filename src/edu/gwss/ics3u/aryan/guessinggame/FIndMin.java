/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.guessinggame;

/**
 *
 * @author 1GHAHREMANZA
 */
public class FIndMin {

    public static int findMax(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}
