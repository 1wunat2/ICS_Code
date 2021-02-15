/*
 * Name: James Tang
 * Date: Sept 24, 2019
 * Version: v0.1
 * Description: Converts celsius to farenheit
 */
package edu.hdsb.gwss.james.ics3u.u2.l3;

/**
 * @author james.tangjyt
 */
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Input subtotal");
    double x=input.nextInt() ;
    //let x represent the subtotal
    System.out.println("Input gratuity");
     double y=input.nextInt() ;
    //let y represent the gratuity rate
    double a=x*y/100;
    //let a represent gratuity needed to pay
    double b=x+a;
    //let b represent total
    
    System.out.println("The gratuity needed to be paid is "+a+" ,and the total due is "+b);   
    }
    
} 
