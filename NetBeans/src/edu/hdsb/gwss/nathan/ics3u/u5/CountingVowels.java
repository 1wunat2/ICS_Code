/*
Name:Nathan Wu
Date:4/17/2019
Version:0.01
Description:
 */
package edu.hdsb.gwss.nathan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constants
        final char A = 'a', E = 'e', I = 'i', O = 'o', U = 'u';
        
        //variables
        String sentence, s;
        char letter;
        int length, n, vowelCounter = 0;

        //objects
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Enter a sentence:");
        sentence = input.nextLine();
        s = sentence.toLowerCase();
        length = s.length();

        //checking each letter
        for (n = 0; n < length; n++) {
            letter = s.charAt(n);
            if (letter == A || letter == E || letter == I || letter == O || letter == U) {
                vowelCounter++;
            }
        }
        //output
        System.out.println("There are "+vowelCounter+" in your scentence");

    }

}
