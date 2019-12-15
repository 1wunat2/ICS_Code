/*
 * Name:Nathan Wu
 * Date:2/28/2019
 * Version:0.01
 * Description:
        Converting temperature from celcius to fahreinheit
 */
package edu.hdsb.gwss.nathan.ics3u.u2;

/**
 *
 * @author 1wunat2
 */
public class CelciusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double celsius = -40;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " degrees celsius in fahrenheit is " + fahrenheit);

    }

}
