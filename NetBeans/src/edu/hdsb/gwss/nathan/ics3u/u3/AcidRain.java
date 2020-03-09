/*
name:Nathan Wu
date:3/24/2019
version: 1.0
description:
    This program will determine if fish will survive if 
    there is acid rain based off of it's ph.
 */
package edu.hdsb.gwss.nathan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author nwu10
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        double ph;

        //objects
        Scanner input = new Scanner(System.in);

        //splash screen
        System.out.println("Acid Rain");
        System.out.println("----------");
        System.out.println("Ph is a scale from 0 to 14 used to "
                + "determine the acidity of a substance whether it is acidic,"
                + "  basic, or neutral. This program will determine if fish"
                + " will survive if there is acid rain based off of it's ph\n");

        //input
        System.out.println("What is the ph level of the acid rain?");
        ph = input.nextDouble();

        //processing
        if (ph < 0 || ph > 14) {
            System.out.println("Invalid ph value, Ph must be a number from 0-14");
        } else if (ph < 6.5) {
            System.out.println("It is too acidic, the fishes will not survive.");
        } else if (ph > 7.5) {
            System.out.println("It is too alkaline, the fishes will not survive.");
        } else {
            System.out.println("It is neutral, the fishes will survive.");
        }

    }

}
