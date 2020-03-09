/*
 * Name: James Tang
 * Date: Sept 24, 2019
 * Version: v0.1
 * Description: Displays the digits of a 3 digit number
 */
package edu.hdsb.gwss.james.ics3u.u2.l3;

/**
 * @author James Tang
 */

import java.util.Scanner;
   
public class Digit {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input any 3 digit nuber: ");
    int x=input.nextInt() ;
    //let x represent any 3 digit number
    
    int a=x/100;
    int b=x%100/10;
    int c=(x%100)%10;
    
        System.out.println("The hundreds digit is: "+a);
        System.out.println("The tens digit is: "+b);
        System.out.println("The ones digit is: "+c);
    }
    
}