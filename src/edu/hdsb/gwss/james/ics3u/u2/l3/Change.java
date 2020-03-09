/*
 * Name: James Tang
 * Date: Sept 24, 2019
 * Version: v0.1
 * Description: Displays the change needed for any amount
 */
package edu.hdsb.gwss.james.ics3u.u2.l3;

/**
 * @author James Tang
 */

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Input Change in Cents:");
    double x=input.nextInt() ;
    //let x represent the total amount of money
    
    
    double q=25;
    //let q represent quarters
    double d=10;
    //let d represent dimes
    double n=5;
    //let n represent nickels
    double p=1;
    //let p represent pennies
    
    double Q=(x-(x%q))/q;
    //let Q represent the number of quarters
    double D=((x%q)-(x%q%d))/d;
    //let D represent the number of dimes
    double N=((x%d)-(x%n))/n;
    //let N represent the number of nickels
    double P=((x%n)-(x%p))/p;
    //let P represent the number of pennies
    
        System.out.println("Number of quarters: "+Q);
        System.out.println("Number of dimes: "+D);
        System.out.println("Number of nickels: "+N);
        System.out.println("Number of pennies: "+P);
            
    }
    
}
