/*
Name:Nathan Wu
Date:4/25/2019
Version:1.0
Description:
    
 */
package edu.hdsb.gwss.nathan.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1wunat2
 */
public class AgeGate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variable
        int year, day, month, endDay = 25, endYear = 2019, endMonth = 4;
        String y, m, d, time;

        //getting the file data
        File age = new File("DATA11.txt");
        Scanner input = new Scanner(age);
        
        //splash screen 
        System.out.println("Age Gate");
        System.out.println("------------");
        System.out.println("This progrm determines if you the person if older or"
                + " younger than 14 years old based of their birth date.");

        //checking each line
        while (input.hasNextLine()) {
            StringTokenizer date = new StringTokenizer(input.nextLine());

            //turning it into an int
            month = Integer.parseInt(date.nextToken());
            day = Integer.parseInt(date.nextToken());
            year = Integer.parseInt(date.nextToken());

            //checking all possibilities of age
            if ((endYear - year) == 14) {
                if ((endMonth - month) == 0) {
                    if ((endDay - day) >= 0) {
                        System.out.println("old enough");
                    }
                    else {
                        System.out.println("too young");
                    }
                }
                else if ((endMonth - month) > 0){
                    System.out.println("old enough");
                }
                else {
                    System.out.println("too young");
                }
            }
            else if((endYear - year) > 14){
                    System.out.println("old enough");
                    }
            else {
                System.out.println("too young");
            }
        }

    }

}
