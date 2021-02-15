/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import javax.swing.JOptionPane;

/**
 * Great Distance Calculator
 *
 * The date of Easter Sunday can vary widely from year to year. The Council of
 * Nicaea in A.D. 325 decreed that Easter Sunday was to be held on the first
 * Sunday following the full moon that occurred on or after the first day of
 * spring. Because the date depends on solar, lunar, and calendar cycles, it is
 * not easy to find an arithmetic procedure that will determine the correct date
 * for any given year.
 *
 * The first such procedure was determined in 1876; an adaptation of that
 * procedure is given below. It involves a sequence of divisions that start with
 * the year, and eventually produce a month number (3 for March, 4 for April)
 * and the day of the month.
 *
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D1_EasterBunny {

    public static void main( String[] args ) {

        //a - m - the quotients and remainders needed
        int a, b, c, d, e, f, g, h, i, j, k, m, p;
        int month;  //Easter month
        int day;    //Easter day
        int year;   //Easter's year
        String monthStr;

        //Ask user for year
        String yearStr = JOptionPane.showInputDialog( "Easter "
                + "Date Calculator\nPlease enter a year" );

        //Convert the year from a String to an int
        year = Integer.parseInt( yearStr );

        //Calculations
        a = year % 19;
        b = year / 100;
        c = year % 100;
        d = b / 4;
        e = b % 4;
        f = ( 8 + b ) / 25;
        g = ( b - f + 1 ) / 3;
        h = ( 19 * a + b - d - g + 15 ) % 30;
        i = c / 4;
        k = c % 4;
        j = ( 32 + 2 * e + 2 * i - h - k ) % 7;
        m = ( a + 11 * h + 22 * j ) / 451;
        month = ( h + j - 7 * m + 114 ) / 31;
        p = ( h + j - 7 * m + 114 ) % 31;
        day = p + 1;

        //determine the month in String format
        if ( month == 3 ) {
            monthStr = "March";
        } else {
            monthStr = "April";
        }

        //Display the results
        JOptionPane.showMessageDialog( null, "Easter will fall"
                + " on Sunday, " + monthStr + " " + day + ", " + year );
    }

}
