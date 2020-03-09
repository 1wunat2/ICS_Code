/*
Name:Nathan Wu
Date: 5/23/28
Version: 0.01
Description:
    This program takes your inputed golf scores and calculates the total, max 
    and min score.
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] hole = new int[18];
        splashScreen();
        StringTokenizer str = new StringTokenizer(data(hole));
        System.out.println("Total: " + str.nextToken());
        System.out.println("Max: " + str.nextToken());
        System.out.println("Min: " + str.nextToken());
    }

    public static void splashScreen(){
        System.out.println("Golf");
        System.out.println("---------");
        System.out.println("This program takes your inputed golf scores and "
                + "calculates the total, max and min score.");
    }
    public static String data(int data[]) {
        //objects
        Scanner input = new Scanner(System.in);

        int max = 0, min = 0, total = 0;
        for (int i = 0; i < data.length; i++) {
            //user input
            System.out.println("Hole " + (i + 1) + ": ");
            data[i] = input.nextInt();

            //user input
            max = Math.max(data[i], max);
            if (i == 0) {
                min = Math.min(data[i], max);
            } else {
                min = Math.min(data[i], min);
            }
            total = total + data[i];
        }
        return total + " " + max + " " + min;
    }

}
