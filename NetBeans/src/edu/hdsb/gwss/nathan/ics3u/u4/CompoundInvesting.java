/*
name:Nathan
date:4/4/2019
version:1.0
description:
    This program calculates your investing for as many years as you want, with 
    your intrest.
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SPLASH SCREEN
        System.out.println("Compound Investing\n");
        System.out.println("This program will print out a title table that will "
                + "display the amount of a yearly investment over a period of "
                + "up to 15 years.\n");
        
        //variables
        int year, time;
        double intrest, investment, total, starttotal, startintrest, startinvestment;

        //objects
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("How many years would you like to invest for? "
                    + "Cannot be for more than 15 years.");
            year = input.nextInt();
            } while (year < 1 || year > 15);

            do {
                System.out.println("How much do you want to invest yearly? "
                        + "You must invest at least $50.");
                startinvestment = input.nextDouble();
            } while (startinvestment < 50);

            do {
                System.out.println("What is your intrest rate (%)?");
                startintrest = input.nextDouble();
            } while (startintrest <= 0 || startintrest > 100);
        
        investment = startinvestment;
        intrest = startintrest / 100 * investment;
        total = intrest + investment;
        starttotal = intrest + investment;
        System.out.format("%-5s | %-1s %-20s | %-1s %-10s | %-1s %-10s\n",
                "Year", "", "Amount in account", "", "Intrest", "", "Total");

        for (time = 1; time <= year; time++) {
            System.out.format("%-5d | %-1s %-20.2f | %-1s %-10.2f | %-1s %-10.2f\n",
                    time, "$", investment, "$", intrest, "$", total);
            investment = total + startinvestment;
            intrest = startintrest / 100 * investment;
            total = investment + intrest;
        }
    }

}
