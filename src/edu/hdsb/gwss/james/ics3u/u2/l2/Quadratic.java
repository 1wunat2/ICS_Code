/*
 * Name: James Tang
 * Date: Sept 23, 2019
 * Version: v0.1
 * Description: Solves quadratic equation
 */
package edu.hdsb.gwss.james.ics3u.u2.l2;

/**
 *
 * @author James tang
 */
import java.util.Scanner;
//imports scanner 

public class Quadratic {
    
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in); 
    //creates scanner
    
    int x=input.nextInt() ;
    //prompts users to imput number for 'x'
    
    Double a= 3*Math.pow(x,2);
    int b=8*x;
    int c=4;
    
    System.out.println("The value of y when x=" +x+ " is " +(a+b+c));
   
   }
}
    
