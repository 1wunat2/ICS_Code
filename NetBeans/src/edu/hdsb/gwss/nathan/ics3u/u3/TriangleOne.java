/*
Name: Nathan Wu
Date: 3/25/2019
Version: 0.01
Description:
 */
package edu.hdsb.gwss.nathan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class TriangleOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constants
        
        //variables
        double side1, side2, side3, sum1, sum2, sum3;
        
        //objects
        Scanner input = new Scanner(System.in);
        
        //splash screen
        System.out.println("Triangle");
        System.out.println("----------");
        System.out.println("This program whether the figure is a triangle or"
                + " not based on the length of three sides.\n*Make sure that "
                + "all the side lengths are in the same unit.\n");
        
        //input
        System.out.println("What is the length of your first side?");
        side1 = input.nextDouble();
        System.out.println("What is the length of your second side?");
        side2 = input.nextDouble();
        System.out.println("What is the length of your third side?");
        side3 = input.nextDouble();
        
        //processing
        sum1 = side1 + side2;
        sum2 = side2 + side3;
        sum3 = side1 + side3;
        
        if (side1 <= 0 || side2 <= 0 || side3 <=0){
            System.out.println("Invalid side lengths");
        }
        else if(sum1 > side3){
            if(sum2 > side1){
                if (sum3 > side2){
                    System.out.println("The shape is a triangle.");
                }
            }
            else 
                System.out.println("The shape is not a triangle.");
        }
        else
            System.out.println("The shape is not a triangle.");
        
    }
    
    
}
