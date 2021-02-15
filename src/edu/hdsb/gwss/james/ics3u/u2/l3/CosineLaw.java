/*
 * Name: James Tang
 * Date: Sept 24, 2019
 * Version: v0.1
 * Description: Uses cosine law
 */
package edu.hdsb.gwss.james.ics3u.u2.l3;

/**
 * @author James Tang
 */

import java.util.Scanner;
import java.lang.Math;
public class CosineLaw {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Input length of side a");
        double a=input.nextInt() ;
        //let a represent side length a
        System.out.println("Inpute length of side b");
        double b=input.nextInt() ;
        //let b represent side length b
        System.out.println("Input angle of C");
        double C=input.nextInt() ;
        //let C represent angle C
    
    double c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*(Math.cos(C)*180/Math.PI));
    //let c represent side length c
        System.out.println("The side lenth of c is"+c);
    
    
  
      
          
    }
    
}
