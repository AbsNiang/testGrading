package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks is the test out of");
        final int totalMarks = input.nextInt();
        System.out.println("How many marks did the student get?");
        int marksAchieved = input.nextInt();
        System.out.println("How many students have you got");
        int studentTotal = input.nextInt(); //still need to add loop for the number of students to grade several tests
        while ((marksAchieved < 0) || (marksAchieved > totalMarks)) {
            System.out.println("There has been an error, please retype the marks");
            int newMarksAchieved = input.nextInt();
            marksAchieved = newMarksAchieved;
        }
        double percentageIncomplete = (double) marksAchieved / totalMarks;
        double percentageMarks = percentageIncomplete * 100;
        if (percentageMarks >= 80) {
            System.out.println("The student got an A");
        } else {
            if ((percentageMarks >= 70) && (percentageMarks <= 79)) {
                System.out.println("The student got a B");
            } else {
                if ((percentageMarks >= 60) && (percentageMarks <= 69)) {
                    System.out.println("The student got a C");
                } else {
                    if ((percentageMarks >= 50) && (percentageMarks <= 59)) {
                        System.out.println("The student got a D");
                    } else {
                        if ((percentageMarks >= 40) && (percentageMarks <= 49)) {
                            System.out.println("The student got an E");
                        } else {
                            if (percentageMarks < 40) {
                                System.out.println("The student got a U");
                            }

                        }
                    }
                }
            }
        }
    }
}
