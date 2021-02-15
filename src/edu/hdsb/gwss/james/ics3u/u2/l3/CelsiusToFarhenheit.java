/*
 * Name: James Tang
 * Date: Sept 24, 2019
 * Version: v0.1
 * Description: Converts celsius to farenheit
 */
package edu.hdsb.gwss.james.ics3u.u2.l3;

/**
 * @author James Tang
 */

import java.util.Scanner;

public class CelsiusToFarhenheit {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
      int x=input.nextInt() ;
      //let x represent celsius
      
      double y=x*1.8+32; 
      //ley y represent farenheit
     
        System.out.println(x+" degrees celsius is "+y+" degrees farenheit");
    }
    
}
