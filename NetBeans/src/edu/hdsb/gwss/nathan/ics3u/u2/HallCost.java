
import java.text.NumberFormat;
import java.util.Scanner;



/*
Name:Nathan
Date:3/4/019
Version:0.01
Description:
        it will calculate the final cost of a banquet hall based of how many 
        people you have with you.
package edu.hdsb.gwss.nathan.ics3u.u2;

/**
 *
 * @author 1wunat2
 */
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //splash screen
        System.out.println("Hall Cost");
        System.out.println("");
        System.out.println("The program will calculate the cost for the host"
                + " for a banquet hall that cost $350 to rent.\n");
        
        //constant
        NumberFormat money = NumberFormat.getCurrencyInstance();
        final double RENTAL = 350;
        
        //variable
        String name;
        int numGuest;
        double cost;
        
        //objects
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("What is your name? ");
        name = input.nextLine();
        System.out.println("How many guest do you have?");
        numGuest = input.nextInt(); 
        System.out.println("How much does it cost per person?");
        cost = input.nextDouble();
        
        //output
        double totalCost = ((numGuest + 1) * cost + RENTAL);
        System.out.print(name+ " your total cost for the rental of banquet hall,"
                + " your guests and you will be ");
        System.out.println(  money.format( totalCost ) );
        
        
    }
    
}
