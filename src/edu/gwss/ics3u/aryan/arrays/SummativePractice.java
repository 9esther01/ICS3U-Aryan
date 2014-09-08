/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.arrays;

import edu.gwss.ics3u.aryan.lib.AryanArrayUtil;

/**
 *
 * @author 1GHAHREMANZA
 */
public class SummativePractice {

    public static void main(String[] args) {
        copyArray();
       
    }

    public static void differeRows() {
    
        AryanArrayUtil aau = new AryanArrayUtil();
        String[][] data = new String[20][30];

        for (int row = 0; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = "*";
            }
        }
        for (int row = 1; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = "+";
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println("");
        }
    }

    public static void sameArray() {

        String[][] data = new String[20][30];
        for (int row = 0; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = "*";
                System.out.print(data[row][col]);
            }
            System.out.println("");
        }

    }
    
    public static void eightAtEnd() {
        AryanArrayUtil aau = new AryanArrayUtil();
        String[][] data = new String[20][40];

        for (int row = 0; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                   data[row][col] = "*"; 
            }
        }
        for (int row = 1; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = "+";
            }
        }
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (row==0 || col == 0 || row == data.length-1 || col == data[row].length-1) {
                      data[row][col] = "8";
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void putX() {
        AryanArrayUtil aau = new AryanArrayUtil();
        String[][] data = new String[30][30];

        for (int row = 0; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                   data[row][col] = "*"; 
            }
        }
        for (int row = 1; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = "+";
            }
        }
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (row==0 || col == 0 || row == data.length-1 || col == data[row].length-1) {
                      data[row][col] = "8";
                }
            }
        }
        
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (col == row || col == data[row].length - row - 1) {
                      data[row][col] = "X";
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println("");
        }
    }
    public static void copyArray() {
        AryanArrayUtil aau = new AryanArrayUtil();
        String[][] data = new String[41][30];

        for (int row = 0; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                   data[row][col] = "*"; 
            }
        }
        for (int row = 1; row < data.length; row = row + 2) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = "+";
            }
        }
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (row==0 || col == 0 || row == data.length-1 || col == data[row].length-1) {
                      data[row][col] = "8";
                }
            }
        }
        
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (col == row || col == data[row].length - row - 1) {
                      data[row][col] = "X";
                }
            }
        }

        
        String[][] copyData = new String[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                copyData[i][j] = data[i][j];
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        for (int i = 0; i < copyData.length; i++) {
            for (int j = 0; j < copyData[i].length; j++) {
                System.out.print(copyData[i][j]);
            }
            System.out.println("");
        }
        
        
        System.out.println("\n\n\n\n" );
        
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (copyData[row][col].equals( "X" ) ) {
                      aau.swap(data, row, col, data.length - 1 - row, col);
                }
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
