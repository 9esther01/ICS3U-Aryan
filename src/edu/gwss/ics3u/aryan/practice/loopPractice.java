/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.practice;

/**
 *
 * @author Aryan
 */
public class loopPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
//   initialize;     test;     change
//
        for (int count = 0; count < 10; count++) {
            System.out.print(count + " ");
        }
//
        for (int count = 0; count < 25;) {
            System.out.println("count is: " + count);
            count = count + 1;
        }

        //while loop
        int count, sum;
        sum = 0;
        count = 0;

        while (count <= 5) {
            sum = sum + count;
            System.out.print(count + " ");
            count++;
        }

        System.out.println("sum is: " + sum);


//do {
//  <statement>;
//} while( <boolean expression> );
    }
}
