/*
 * Name: James Tang
 * Date: Oc 2, 2019
 * Version: v0.1
 * Description: Calculates the discount amount and final cost of your purchases
 */
package edu.hdsb.gwss.james.ics3u.u3.l2;

/**
 * @author james.tangjyt
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Discount {

    public static void main(String[] args) {
    
    //Object
    NumberFormat money = NumberFormat.getCurrencyInstance();
    Scanner input = new Scanner(System.in);
    
    //Input
    System.out.print("Enter amount of purchases: ");
    Double x=input.nextDouble() ;
   
        
        //Processing
        if (x>=10){
            
        //Display
        System.out.println("The Discount Amount is "+money.format(x*0.1));
        System.out.println("The Final Cost is "+ money.format(x*1.1));
        }
        
        else{
        //Display
        System.out.println("There is no discount");
        }
        
    }
    }
    

