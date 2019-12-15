/*
Name:Nathan Wu
Date:5/8/2019
Version:1.0
Description:
    This program calculates you speed in meters per second with you distance and
    time inputed.
 */
package edu.hdsb.gwss.nathan.ics3u.u6;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class Velocity {

    /**
     * @param args the command line arguments
     */
    
    //variables
    public static double distance, time, speed;
    
    public static void main(String[] args) {
        splashscreen();
        data();
        calculateSpeed();
        //output
        System.out.println("Your speed is " + speed + " meters/second");
    }
    
    public static void splashscreen(){
        System.out.println("SPEED");
        System.out.println("----------");
        System.out.println("This program will calculate you speed in m/s using"
                + "your inputed distance and time.");
    }
    
    public static void data(){
        //object
        Scanner input = new Scanner( System.in );
        
        //input
        System.out.println("\nWhat is your distance in meters?");
        distance = input.nextDouble();
        System.out.println("What is your time in seconds?");
        time = input.nextDouble();
    }
    
    public static void calculateSpeed(){
        //calculate speed
        NumberFormat decimal = NumberFormat.getNumberInstance(); 
        decimal.setMinimumFractionDigits( 2 );
        decimal.setMaximumFractionDigits( 2 );
        speed = distance / time;
    }
}
