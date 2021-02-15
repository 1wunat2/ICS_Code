/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import javax.swing.*;

/**
 * Great Distance Calculator
 *
 * To calculate an accurate distance between two places on the planet Earth,
 * given their latitude and longitude, you would require the use of spherical
 * geometry and trigonometric math functions. This is accomplished with the
 * Great Circle Distance Formula.
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D1_DistanceCalculator {

    public static void main( String[] args ) {

        final double DEG_TO_RAD = 180.0 / Math.PI;

        String place1, place2;
        double lat1, lat2, lon1, lon2;
        String myInput;

        // print a warning message to the user about degrees
        System.out.println( "When entering latitude and longitude, please use degrees.\n"
                + "For example: 43 degrees 40 minutes would be entered as 43.67.\nUse "
                + "positive values for North latitudes\n"
                + "and West longitudes.  Use negative values for South latitudes and East "
                + "longitudes,\n" );

        //Ask the user for the name of place 1
        place1 = JOptionPane.showInputDialog( "Name of Place 1" );

        //get latitude
        myInput = JOptionPane.showInputDialog( "What is the latitude of " + place1 + " in degrees?" );
        lat1 = Double.parseDouble( myInput );

        //get longitude
        myInput = JOptionPane.showInputDialog( "What is the longitude of " + place1 + " in degrees?" );
        lon1 = Double.parseDouble( myInput );

        //Ask the user for the name of place 2
        place2 = JOptionPane.showInputDialog( "Name of Place 2" );

        //get latitude
        myInput = JOptionPane.showInputDialog( "What is the latitude of " + place2 + " in degrees?" );
        lat2 = Double.parseDouble( myInput );

        //get longitude
        myInput = JOptionPane.showInputDialog( "What is the longitude of " + place2 + " in degrees?" );
        lon2 = Double.parseDouble( myInput );

        double distance;

        distance = 6378.8 * Math.acos( Math.sin( lat1 / DEG_TO_RAD ) * Math.sin( lat2 / DEG_TO_RAD )
                + Math.cos( lat1 / DEG_TO_RAD ) * Math.cos( lat2 / DEG_TO_RAD ) * Math.cos( lon2 / DEG_TO_RAD - lon1 / DEG_TO_RAD ) );

        //Display output
        System.out.println( "Place 1: " + place1 );
        System.out.println( "Latitude of " + place1 + ": " + lat1 );
        System.out.println( "Longitude of " + place1 + ": " + lon1 );
        System.out.println( "----------------------------------------" );
        System.out.println( "Place 2: " + place2 );
        System.out.println( "Latitude of " + place2 + ": " + lat2 );
        System.out.println( "Longitude of " + place2 + ": " + lon2 );
        System.out.println( "----------------------------------------" );
        System.out.println( "The distance = " + distance + " km as the crow flies." );

    }

}
