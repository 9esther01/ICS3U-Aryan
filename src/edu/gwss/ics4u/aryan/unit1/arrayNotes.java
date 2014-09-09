/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gwss.ics4u.aryan.unit1;

import java.util.ArrayList;

/**
 *
 * @author 1GHAHREMANZA
 */
public class arrayNotes {
    public static void main(String[] args) {
        //arrays have fixed size
        
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        
        ArrayList firstArrayList = new ArrayList();
        firstArrayList.add("Muir");
        firstArrayList.add(false);
        firstArrayList.add(x);
        firstArrayList.add(y);
        firstArrayList.add(1.0);
        
        ArrayList d1 = new ArrayList();
        ArrayList a1 = new ArrayList();
        a1.add("Array 1, Item 1");
        a1.add("Array 1, Item 2");
        ArrayList a2 = new ArrayList();
        a2.add("Array 2, Item 1");
        a2.add("Array 2, Item 2");
        a2.add("Print me!");
        
        System.out.println(a1.toString( ));
        d1.add(a1);
        d1.add(a2);
        System.out.println( ((ArrayList) d1.get(1)).get(2));
        
        ArrayList<String> D1 = new ArrayList <String>();
        D1.add( new String("Hello"));
        D1.add( "Fred");
        
        D1.get(1);
        D1.remove()
        
        
    }
}
