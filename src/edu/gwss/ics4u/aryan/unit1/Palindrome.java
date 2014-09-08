/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gwss.ics4u.aryan.unit1;

/**
 *
 * @author 1GHAHREMANZA
 */
public class Palindrome {
    public static void main(String[] args) {
    String sentance ="Hello There Racecar";
    int s = 0; 
    int e = sentance.indexOf(" ");
     
    sentance.substring( s, e);
        s= e +1;
        e = sentance.indexOf(" ") + 1;
    }
}
