/*
 * Name: James Tang
 * Date: Oct 15, 2019
 * Version: v0.2
 * Description:Deterimes whether or not the pH of the lake is safe for fish.
 */
package edu.hdsb.gwss.james.ics3u.u3.Assignment;

/**
 *
 * @author James Tang
 */
import java.util.Scanner;

public class AcidRain {

    public static void main(String[] args) {

        //Object
        Scanner input = new Scanner(System.in);

        //Variables   
        double pH;

        //Splash Screen
        System.out.println("Acid Rain is an environmental problem. This program determines if the pH level in water is safe for fish.");

        //Input
        System.out.print("Please Enter a pH level: ");
        pH = input.nextDouble();

        //Processing
        if (pH <= 2) {
            System.out.println("INVALID");
        }

        if (pH >= 12) {
            System.out.println("INVALID");
        }

        if ((pH >= 6.45) && (pH <= 7.45)) {
            System.out.println("NEUTRAL - The fish will survive.");
        } else if ((pH < 6.45) && (pH > 2)) {
            System.out.println("ACIDIC - The fish shall die.");
        } else if ((pH > 7.45) && (pH <= 9)) {
            System.out.println("ALKALINE - The fish shall die.");
        }

    }
}



