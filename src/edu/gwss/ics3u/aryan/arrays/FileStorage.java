/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan.arrays;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author 1GHAHREMANZA
 */
public class FileStorage {

    public static void main(String[] args) throws Exception {
        String[][] studentInfo = new String[18][3];
        int[][] studentMarks = new int[18][4];

        File file = new File("markbook.txt");
        Scanner input = new Scanner(file);

        int row = 0;
        String student;

        while (input.hasNext()) {
            student = input.nextLine();
            for (int i = 0; i <= 2; i++) {
                studentInfo[row][i] = student.substring(0, student.indexOf(","));
            student = student.substring(student.indexOf(",") + 1);
                System.out.println(studentInfo[row][i]);
            }


            for (int subject = 0; subject < 3; subject++) {
                studentMarks[row][subject] = Integer.parseInt(student.substring(0, student.indexOf(",")));
                student = student.substring(student.indexOf(",") + 1);
                System.out.println(studentMarks[row][subject]);
            }
            studentMarks[row][3] = Integer.parseInt(student);

            row++;
        }
        input.close();
    }
}
