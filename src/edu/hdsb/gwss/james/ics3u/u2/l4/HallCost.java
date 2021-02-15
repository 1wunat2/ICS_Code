/*
 * Name: James Tang
 * Date: Sept 25, 2019
 * Version: v0.1
 * Description: Calculates and displays the hall cost
 */
package edu.hdsb.gwss.james.ics3u.u2.l4;

/**
 * @author James Tang
 */
import java.util.Scanner;

public class HallCost {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is your name: ");
    String Name=input.nextLine() ;
   
    System.out.print("How many guests: ");
    int Guests=input.nextInt() ;
   
    System.out.print("What is the cost per person: ");
    double Cost=input.nextInt() ;

    double total= 350-Guests*Cost;
        System.out.println("The cost to the host "+Name+ " is: "+total);
    
    
    
    }
    
}
