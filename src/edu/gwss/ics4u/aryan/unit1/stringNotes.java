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
public class stringNotes {
    public static void main(String[] args) {
        String str = "Java rocks my world!";
        System.out.println(str.charAt(0));
        
        
        
        String s1 = "Hello World";
        String s2 = new String ("Hello World");
        
        System.out.println(s1.charAt(3));
        System.out.println(s1.substring(3, 5));
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        
        System.out.println(s1.concat(s2).concat(s3).substring(5,10).toLowerCase());
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.indexOf("0"));
        System.out.println(s1.indexOf("l", 2));
        
        
        //compare 2 strings, if they equal each other
        System.out.println(s1.equals(args));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
                
    
    
}
