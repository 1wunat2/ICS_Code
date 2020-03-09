/*
Name:Nathan Wu
Date:4/8/2019
Version:1.0
Description:
    this program always adds half of the previous number and continously gets 
    closer to 2 but not becoming 2.
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

/**
 *
 * @author nwu10
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SPLASH SCREEN
        System.out.println("Closer to two\n");
        System.out.println("This program demonstrates that the result of adding "
                + "the numbers 1, 1/2, 1/4, 1/16, ... and so on gets closer to "
                + "2 without becoming 2.");
        
        //variable
        double sum = 0;
        long den = 1;

        //object
        do {
            System.out.print(sum + " + 1/" + den);
            sum = sum + 1.0 / den;
            System.out.println(" = " + sum);
            den = den * 2;
        } while (sum != 2);
    }

}
