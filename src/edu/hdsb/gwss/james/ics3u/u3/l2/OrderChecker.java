/*
 * Name: James Tang
 * Date: Oct 2, 2019
 * Version: v0.1
 * Description: Calculates the discount amount and final cost of your purchases
 */
package edu.hdsb.gwss.james.ics3u.u3.l2;

/**
 * @author James Tang
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class OrderChecker {

    public static void main(String[] args) {

        //Object
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        //Input
        System.out.print("Enter the number of bolts in your purchase: ");
        int b = input.nextInt();

        System.out.print("Enter the number of nuts in your purchase: ");
        int n = input.nextInt();

        System.out.print("Enter the number of washers in your purchase: ");
        int w = input.nextInt();

        //Processing
        if (b > n) {
            int Nuts = b - n;

            //Display
            System.out.println("You don't have enough nuts. You need " + Nuts + " more nuts.");
        }

        //Processing
        if (b < n) {
            int Bolts = n - b;

            //Display
            System.out.println("You don't have enough bolts. You need " + Bolts + " more bolts.");
        }

        //Processing
        if (w < 2*b) {
            int Washers = 2*b - w;

            //Display
            System.out.println("You don't have enough washers. You need " + Washers + " more washers.");
        }

        //Processing
        if (w > 2*b) {
            int Washers = w - 2*b;

            //Display
            System.out.println("You have too many washers. You have " + Washers + " extra washers.");
        }

        //Processing
        double $b = 0.05 * b;
        double $n = 0.03 * n;
        double $w = 0.01 * w;

        double total = $b + $n + $w;

        //Display
        System.out.println("Your total is " + money.format(total));

    }
}
