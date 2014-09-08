package edu.gwss.ics3u.aryan.practicearrays;

import java.util.Scanner;

public class Golf {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] golfScore = new int [5];
        double sum = 0;
        int max = 0;
        int min = 10000000;

        for (int i = 0; i < golfScore.length; i++) {
            System.out.print("Enter your golf score for hole #" + (i + 1) + ": ");
            golfScore[i] = input.nextInt();
            sum = sum + golfScore[i];
            if (max < golfScore[i]) {
                max = golfScore[i];
        }
            if (min > golfScore[i]) {
                min = golfScore[i];
        }
    }
         for (int i = 0; i < golfScore.length; i++) {
        System.out.println("Score " + (i + 1) + " is " + golfScore[i]);
    }
        System.out.println("Max score is " + max);
        System.out.println("Min score is " + min);
        System.out.println("Average score is " + (sum/5) );
}
}
