package week5lecture;
/* ************************************************************
    Student.java

    Define a student class that stores name, score on test 1, and
    score on test 2. Methods prompt for and read in grades,
    compute the average, and return a string containing student's info.
 *************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    //declare instance data
    private String studentName;
    private int test1, test2;
    private ArrayList<Integer> testScores = new ArrayList<>();


    // ---------------------------------------------
//constructor
// ---------------------------------------------
    public Student(String studentName) {
        this.studentName = studentName;
        test1 = 0;
        test2 = 0;
    }

    // ---------------------------------------------
//inputGrades: prompt for and read in student's grades for test1 and test2.
//Use name in prompts, e.g., "Enter's Joe's score for test1".
// ---------------------------------------------
    public void inputGrades() {
        //add body of inputGrades
        Scanner scan = new Scanner(System.in);
        // loop to accommodate numerous scores.
        System.out.print("Enter " + studentName + "'s score for test 1: ");
        test1 = scan.nextInt();

        System.out.print("Enter " + studentName + "'s score for test 2: ");
        test2 = scan.nextInt();

    }

    // ---------------------------------------------
//getAverage: compute and return the student's test average
// ---------------------------------------------
    public double getAverage() {
        // process the list to add all the values.
        return (test1 + test2) / 2.0;
    }
//add header for getAverage {
//add body of getAverage
//    }

    //----------------------------------------------------
    //toString: returns a String representing the Student object
    //----------------------------------------------------
    public String toString() {
        return "Name: " + studentName + "\tTest 1: " + test1 +
                "\tTest 2: " + test2 + "\tAverage: " + getAverage();
    }
}
