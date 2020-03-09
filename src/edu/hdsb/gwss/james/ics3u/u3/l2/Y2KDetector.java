/*
 * Name: James Tang
 * Date: Oc 2, 2019
 * Version: v0.1
 * Description: Calculates the discount amount and final cost of your purchases
 */
package edu.hdsb.gwss.james.ics3u.u3.l2;

/**
 *
 * @author James Tang
 */
import java.util.Scanner;

public class Y2KDetector {

    public static void main(String[] args) {
        
        //Object
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("What is your year of birth?: ");
        int YearOfBirth = input.nextInt();

        System.out.print("What is the current year?: ");
        int CurrentYear = input.nextInt();
        
        int y=CurrentYear+2000;
        //Processing
        if(YearOfBirth>20){
            int x=1900+YearOfBirth;
            int Age=y-x;
            System.out.println("Year Born: "+x);
            System.out.println("Current Year: "+y);
            System.out.println("Age: "+Age);
        }
        
        else{
            int z=2000+YearOfBirth;
            int A=y-z;
            System.out.println("Year Born: "+z);
            System.out.println("Current Year: "+y);
            System.out.println("Age: "+A);  
        }
        }}
