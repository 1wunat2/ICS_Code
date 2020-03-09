/*
Name:Nathan Wu
Date:4/24/2019
Version:0.01
Description:
    
 */
package edu.hdsb.gwss.nathan.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variable
        String hour, time;
        int h;
        //object
        File Flight = new File("TAVEL11.txt");
        Scanner input = new Scanner(Flight);

        while (input.hasNextLine()) {
            time = input.nextLine();
            hour = time.substring(0, 2);
            time = time.substring(3, 8);
            h = Integer.parseInt(time);    
        }
    }

}
