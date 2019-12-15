/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nathan.ics3u.u2;

/**
 *
 * @author 1wunat2
 */
public class Identifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Primative data types
        int age = 33;                                //number with no decimals
        double winningPercent = 0.5;                 //number with decimal
        char middleInitial = 'A';                    //single character
        boolean doYouLikeThisClass = false;          //true or false
        long reallyBigNumber = 12341234;

        //other data type (not primative)
        String yourFirstName = "Nathan";

        //display output
        System.out.println("Hello " + yourFirstName + "!");
        System.out.println("Wow " + age + " is so old");
        System.out.println("What does " + middleInitial + " stand for?");
        System.out.println("Do you like this class? " + doYouLikeThisClass);

        //constants
        final double PI = 3.14;
        final double GST_RATE = 0.13;

    }

}
