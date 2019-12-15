/*
name: Nathan Wu
Date: 3/24/2019
version: 1.0
description:
    The program determines whether the given year is a leap year or not.
 */
package edu.hdsb.gwss.nathan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author nwu10
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constants
        final int fourthYear = 4, hundrethYear = 100, fourhundrethYear = 400;

        //variables
        int year;

        //objects
        Scanner input = new Scanner(System.in);

        //splash screen
        System.out.println("Leap year calendar");
        System.out.println("------------------");
        System.out.println("This program is a calendar that will "
                + "tell you if it is a leap year or not based on "
                + "the year that you chose.");

        //input
        System.out.println("Enter the year of your choice.");
        year = input.nextInt();

        //processing
        if (year < 0) {
            System.out.println("invalid year");
        } else if (year % fourthYear == 0) {
            if (year % hundrethYear != 0) {
                System.out.println(year + " is a leap year");
            } else if (year % fourhundrethYear == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
