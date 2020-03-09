/*
Name:Nathan Wu
Date:4/18/2019
Version:1.0
Description:
 */
package edu.hdsb.gwss.nathan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable
        String word, s;
        int length;

        //object
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Enter a word:");
        word = input.nextLine();
        length = word.length();

        //moving the first letter
        for (int n = 1; n < length; n++) {
            s = word.substring(0, 1);
            word = word.substring(1);
            word = word + s;
            
            //output
            System.out.println(word);
        }
    }

}
