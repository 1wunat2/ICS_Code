/*
Name:Nathan
Date:4/3/2019
Version:0.01
Description:
    This program writes out from your start value to your end value with all 
    the integers inbetween in chronological order.
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class StartEndFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start, end, number, min, max;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your start value?");
        start = input.nextInt();
        System.out.println("What is your end value?");
        end = input.nextInt();
        
        min = Math.min(start, end);
        max = Math.max(start, end);
        
        for(number=min;number<=max; number++){
            System.out.println("\n"+number);
        }
        
    }
    
}
