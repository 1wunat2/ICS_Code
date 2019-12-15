/*
Name: Nathan Wu
Date: 3/25/2019
Version: 1.0
Description:
        The program dettermines the cost of mailling a letter in first or second
        class based on the weight of the letter.
 */
package edu.hdsb.gwss.nathan.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class CanadaPost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constants

        //variables
        double weight, additional1, cost1, additional2, cost2;
        int classChosen;

        //objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //splash screen
        System.out.println("Canada Post");
        System.out.println("-------------");
        System.out.println("This program determines the cost of mailing your "
                + "letter in first or second class based on the weight of your "
                + "letter in grams.\n");

        //input
        System.out.println("Would you like to mail your letter in First or "
                + "second class?\nPress 1 for first class. Press 2 for "
                + "second class");
        classChosen = input.nextInt();
        System.out.println("What is the weight of your letter in grams");
        weight = input.nextDouble();

        //processing
        if (weight < 0) {
            System.out.println("Invalid weight. The weight of your letter must"
                    + " be greater than 0");
        }
        switch (classChosen) {
            //first class letter
            case 1:
                if (weight <= 30) {
                    System.out.println("The cost to mail your letter is $0.41");
                } else if (weight > 30 && weight <= 50) {
                    System.out.println("The cost to mail your letter is $0.61");
                } else if (weight > 50 && weight <= 100) {
                    System.out.println("The cost to mail your letter is $0.81");
                } else {
                    additional1 = Math.floor((weight - 100) / 50.0 + 1) * 0.26;
                    cost1 = 0.81 + additional1;
                    System.out.println("The cost to mail your letter "
                            + "is " + money.format(cost1));
                }
                break;
            //second class letter
            case 2:
                if (weight <= 30) {
                    System.out.println("The cost to mail your letter is $0.31");
                } else if (weight > 30 && weight <= 50) {
                    System.out.println("The cost to mail your letter is $0.51");
                } else if (weight > 50 && weight <= 100) {
                    System.out.println("The cost to mail your letter is $0.61");
                } else {
                    additional2 = Math.floor((weight - 100) / 50.0 + 1) * 0.21;
                    cost2 = 0.61 + additional2;
                    System.out.println("The cost to mail your letter "
                            + "is " + money.format(cost2));
                }
        }
    }

}
