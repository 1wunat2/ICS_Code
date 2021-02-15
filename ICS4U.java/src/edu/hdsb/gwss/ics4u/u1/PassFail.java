/*
 * Name: Nathan Wu
 * Date: Sep. 17 2020
 * Version: v.1.0
 * Description:
            The program determines how many students in a class pass based on their marks, additionally it tell what
            the highest and lowest mark in the class were.
 */
package edu.hdsb.gwss.ics4u.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class PassFail {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variables
        int passes, students, tScore, aScore, pScore, qScore;
        double low, high, mark, wt, wa, wp, wq;
        StringTokenizer weights;

        //objects
        Scanner input = new Scanner(new File("DATA10.txt"));
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(1);
        decimal.setMaximumFractionDigits(1);

        //splash page
        System.out.println("This program calculates a students average, using the weight and their score on Tests, Assignments, Projects and Quizzes");
        System.out.println("It will print the number of students that passed the class, the lowest grade and the highest grade");

        while (input.hasNextLine()) {
            //variables
            passes = 0;
            low = 100;
            high = 0;

            //storing the data from the file
            weights = new StringTokenizer(input.nextLine());
            wt = Double.parseDouble(weights.nextToken()) / 100;
            wa = Double.parseDouble(weights.nextToken()) / 100;
            wp = Double.parseDouble(weights.nextToken()) / 100;
            wq = Double.parseDouble(weights.nextToken()) / 100;

            students = Integer.parseInt(input.nextLine());

            //calculating each students average
            for (int i = 0; i < students; i++) {
                //store data from file
                StringTokenizer scores = new StringTokenizer(input.nextLine());
                tScore = Integer.parseInt(scores.nextToken());
                aScore = Integer.parseInt(scores.nextToken());
                pScore = Integer.parseInt(scores.nextToken());
                qScore = Integer.parseInt(scores.nextToken());

                //calculate mark
                mark = wt * tScore + wa * aScore + wp * pScore + wq * qScore;

                //check if highest/lowest
                if (mark < low) {
                    low = mark;
                }
                if (mark > high) {
                    high = mark;
                }

                if (mark >= 50) {
                    passes++;
                }
            }
            //call methode to round numbers
            low = rounder(low);
            high = rounder(high);

            //print results
            System.out.println(passes + " " + decimal.format(low) + " " + decimal.format(high));
        }
    }

    //rounds number, for 1 decimal
    public static double rounder(double num) {
        double scale = Math.pow(10, 1);
        return Math.round(num * scale) / scale;
    }
}