/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

/**
 * Floating Point (in)accuracy.
 *
 * @author Wm.Muir
 * @version 2020-21.Q1
 */
public class D1_Accuracy {

    public static void main( String[] args ) {

        double x1 = 0.3;
        double x2 = 0.1 + 0.1 + 0.1;
        System.out.println( x1 == x2 );

        double z1 = 0.5;
        double z2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println( z1 == z2 );

    }

}
