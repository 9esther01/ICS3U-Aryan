/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.guessinggame;

/**
 *
 * @author 1GHAHREMANZA
 */
public class FindMax {

    public static int findMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
}
