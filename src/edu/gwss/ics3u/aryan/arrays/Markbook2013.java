package edu.gwss.ics3u.aryan.arrays;

import edu.gwss.ics3u.aryan.lib.AryanArrayUtil;
import java.io.File;
import java.util.Scanner;

/**
 * Author Aryan Ghahremanzadeh
 * Date: November 24 2013
 * Description: A markbook replica which includes student information and marks.
 * It has a Student list which displays the name and student# of the students. A
 * class report which displays the students who got the highest and lowest marks
 * and the class average for the class selected. It also has a school report
 * which gives the averages of the different classes. Prints a list of the
 * honour roll students as well as the valedictorian and his average.
 * @version 1.0v
 * 
 * 
 */
public class Markbook2013 {

    static final int INDEX_FIRST_NAME = 0;
    static final int INDEX_LAST_NAME = 1;
    static final int INDEX_STUDENT_NUMBER = 2;
    static final int INDEX_MATH = 0;
    static final int INDEX_PHYSICS = 1;
    static final int INDEX_CS = 2;
    static final int INDEX_ENGLISH = 3;
    static AryanArrayUtil aau = new AryanArrayUtil();
    static Scanner input = new Scanner(System.in);

    /**
     * This is the main method where the user chooses to access different parts
     * of the MarkBook program.
     *
     * @param args
     */
    public static void main(String[] args) throws Exception{
        //var list
        int userChoice;
        int subject;
        String[][] studentInfo = new String[18][3];
        int[][] studentMarks = new int[18][4];

       // String[][] studentInfo = createStudentData();
       // createRandomMarks(studentMarks);
        readData(studentInfo, studentMarks);

        do { // do loop that repeats until a valid option is chosen
            System.out.println("Press 1 for Student List, press 2 for Class report, press 3 for school report");
            userChoice = input.nextInt();
            switch (userChoice) { // goes to different parts of the program depending on what the user chooses.
                case 1:
                    displayStudentList(studentInfo);
                    break;
                case 2:
                    do { // do loop that repeats until a valid option is chosen
                        System.out.println("Press 1 for Math, press 2 for Physics, press 3 for CS, press 4 for English");
                        subject = input.nextInt();
                        if (subject >= 1 && subject <= 4) { // makes sure it enters the class report only when there is a valid value. 
                            displayAndCreateClassReport(studentMarks, studentInfo, subject);
                            break;
                        } else {
                            System.out.println("Invalid value try again.");
                        }
                    } while (subject <= 1 || subject >= 4);
                    break;
                case 3:
                    schoolReport(studentMarks, studentInfo);
                    break;
                default:
                    System.out.println("Invalid value try again.");
                    break;
            }
        } while (userChoice < 1 || userChoice > 3);
    }

        /**
         * Method to create an array with all the student data.
         *
         * @return returns an array with the first name, last name and student
         * card number of the students.
         */
    public static void readData(String[][] studentInfo, int[][] studentMarks) throws Exception {
         File file = new File("markbook.txt");
        Scanner input = new Scanner(file);

        int row = 0;
        String student;

        while (input.hasNext()) {
            student = input.nextLine();
            for (int i = 0; i <= 2; i++) {
                studentInfo[row][i] = student.substring(0, student.indexOf(","));
            student = student.substring(student.indexOf(",") + 1);
            }


            for (int subject = 0; subject < 3; subject++) {
                studentMarks[row][subject] = Integer.parseInt(student.substring(0, student.indexOf(",")));
                student = student.substring(student.indexOf(",") + 1);
            }
            studentMarks[row][3] = Integer.parseInt(student);

            row++;
        }
        input.close();
    }
    

//    public static String[][] createStudentData() throws Exception {
//
//         Manually inputed student data
//        String[][] data = {
//            {"Aryan", "GM", "288"},
//            {"Swag", "Deep", "546"},
//            {"Tran", "Zhou", "632"},
//            {"Alex", "Lie", "745"},
//            {"Farjaad", "Rawasia", "432"},
//            {"Steven", "Xu", "286"},
//            {"Fred", "Flinny", "123"},
//            {"Louis", "Praveen", "532"},
//            {"Ryan", "Donald", "888"},
//            {"Wayne ", "Rooney", "123"},};
//        return data;
//    }
    
    
    /**
     * This method just displays the students in the school. This displays there
     * first name, last name and student# in an ordered fashion.
     *
     * @param studentInfo Requires the student information to display.
     */
    public static void displayStudentList(String[][] studentInfo) {
        System.out.format("%-10s %-10s %-7s \n", "First Name", "Last Name", "Student#");
        for (int student = 0; student < studentInfo.length; student++) { // for loop that goes through every student

            System.out.format(
                    "%-10s %-10s %-5s \n",
                    studentInfo[student][INDEX_FIRST_NAME],
                    studentInfo[student][INDEX_LAST_NAME],
                    studentInfo[student][INDEX_STUDENT_NUMBER]);
        }
    }

    /**
     * Method that generates random marks between 25-100 for the length of the
     * data used to test the code.
     *
     * @param studentMarks this is the array which is filled with the random
     * marks
     */
//    public static void createRandomMarks(int[][] studentMarks) throws Exception {
////        for (int row = 0; row < studentMarks.length; row++) { // loop to go through all rows
////            for (int col = 0; col < studentMarks[row].length; col++) { // loop to go through all columns of that row
////                studentMarks[row][col] = (int) ((Math.random() * 75) + 25);
////            }
////        }
//        
//    }

    /**
     * This method is to display and create the class report.
     *
     * @param studentMarks The array containing the marks for each student (10
     * student) in each class (4 classes)
     * @param studentInfo The array containing the students information
     * (consists of first name, last name, student#
     * @param subject The subject which is chosen to create a class report for.
     */
    public static void displayAndCreateClassReport(int[][] studentMarks, String[][] studentInfo, int subject) {
        String subjectSting = "";
        subject--;

        switch (subject) { // switch case that determines what subject was chosen so it can display the name in the menu. 
            case 0:
                subjectSting = "Math";
                break;
            case 1:
                subjectSting = "Physics";
                break;
            case 2:
                subjectSting = "CS";
                break;
            case 3:
                subjectSting = "English";
                break;
        }

        System.out.println("Subject: " + subjectSting + "\n");
        System.out.format("%-10s %-12s %-7s %-5s", "First Name", "Last Name", "Student#", subjectSting + "\n");// output title

        for (int student = 0; student < studentMarks.length; student++) { //formats output so it is readable tot he user
            System.out.format(
                    "%-10s %-12s %-8s %-5d \n",
                    studentInfo[student][INDEX_FIRST_NAME],
                    studentInfo[student][INDEX_LAST_NAME],
                    studentInfo[student][INDEX_STUDENT_NUMBER],
                    studentMarks[student][subject]);

        }

        double average = aau.findAverage(studentMarks, subject); // calculates class average
        int highestMark = aau.findMaximumValue(studentMarks, subject); //finds highest mark
        int lowestMark = aau.findMinimumValue(studentMarks, subject); //finds lowest mark
        System.out.println("Class average: " + average);
        System.out.println("Highest mark: " + studentMarks[highestMark][subject]);
        System.out.println("Recieved by: " + studentInfo[highestMark][INDEX_FIRST_NAME] + " " + studentInfo[highestMark][INDEX_LAST_NAME]);
        System.out.println("Lowest mark: " + studentMarks[lowestMark][subject]);
        System.out.println("Recieved by: " + studentInfo[lowestMark][INDEX_FIRST_NAME] + " " + studentInfo[lowestMark][INDEX_LAST_NAME]);
    }



    /**
     * This method is for the school report. It shows the averages of each
     * class. Then shows a list of people who made honour roll. Aswell as the
     * validictorian.
     *
     * @param studentMarks Requires the students marks.
     * @param studentInfo Requires the students information.
     */
    public static void schoolReport(int[][] studentMarks, String[][] studentInfo) {

        double mathAverage = aau.findAverage(studentMarks, INDEX_MATH);
        double physicsAverage = aau.findAverage(studentMarks, INDEX_PHYSICS);
        double csAverage = aau.findAverage(studentMarks, INDEX_CS);
        double englishAverage = aau.findAverage(studentMarks, INDEX_ENGLISH);

        System.out.println("Class Averages: " //displays averages for each class. 
                + "\nMath: " + mathAverage
                + "\nPhysics: " + physicsAverage
                + "\nCS: " + csAverage
                + "\nEnglish: " + englishAverage);

        System.out.println("\nHonour Roll: ");
        System.out.format("%-10s %-10s %-7s \n", "First Name", "Last Name", "Average");

        
        double maxAverage = 0;
        int maxStudent = -1;
        
        for (int student = 0; student < studentMarks.length; student++) { // goes through and calculates every students average and also finds the maximum average and honour roll students. 
            double average = aau.findAverage(studentMarks[student]);

            if (average > maxAverage) { // finds highest average for Valedictorian
                maxAverage = average;
                maxStudent = student;
            }
            if (average >= 80) { // displays name and average of honour roll students
                System.out.format(
                        "%-10s %-10s %-5s \n",
                        studentInfo[student][INDEX_FIRST_NAME],
                        studentInfo[student][INDEX_LAST_NAME],
                        average);
            }


        }

        //displays Valedictorian and his average
        System.out.print("\nValidictorian: ");
        System.out.print(studentInfo[maxStudent][INDEX_FIRST_NAME] + " ");
        System.out.println(studentInfo[maxStudent][INDEX_LAST_NAME]);
        System.out.println("Valedictorian average: " + maxAverage);

    }
}
