/*
 * Name: James Tang
 * Date: Sept 24, 2019
 * Version: v0.1
 * Description: Solves area of triangle using heron's formula
 */
package edu.hdsb.gwss.james.ics3u.u2.l3;

/**
 * @author James Tang
 */
import java.util.Scanner;
public class HeronFormula {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Input length of side a");
        double a=input.nextInt() ;
        //let a represent side length a
        System.out.println("Input length of side b");
        double b=input.nextInt() ;
        //let b represent side length b
        System.out.println("Input length of side c");
        double c=input.nextInt() ;
        
    double S=(a+b+c)/2;
    double A=Math.sqrt(S*(S-a)*(S-b)*(S-c));
    //let A represent the area
        System.out.println("The area of the triangle is "+A+"cm");
    
    }
    
}