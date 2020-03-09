/*
Name:Nathan Wu
Date:4/26/2019
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
public class PatternMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variable
        String first, second;
        char letter1, letter2;
        boolean repeat = false;
        int i = 0, length;

        //file scanner
        File pattern = new File("DATA21.txt");
        Scanner input = new Scanner(pattern);
        
        //splash scree
        System.out.println("Pattern Matching");
        System.out.println("--------------------");
        System.out.println("This program ");

        while (input.hasNextLine()) {
            //tokenizing the line
            StringTokenizer word = new StringTokenizer(input.nextLine());
            first = word.nextToken();
            second = word.nextToken();
            length = first.length() - 1;

            do {
                //checking if they are the same length
                if (first.length() == second.length()) {
                    letter1 = first.charAt(i);
                    letter2 = second.charAt(i);

                    //checking if the character the same(constant or vowel)
                    if ((letter1 == 'a' || letter1 == 'e' || letter1 == 'i'
                            || letter1 == 'o' || letter1 == 'u') && (letter2 == 'a'
                            || letter2 == 'e' || letter2 == 'i' || letter2 == 'o'
                            || letter2 == 'u')) {
                        repeat = true;
                    } else if ((letter1 != 'a' && letter1 != 'e' && letter1 != 'i'
                            && letter1 != 'o' && letter1 != 'u') && (letter2 != 'a'
                            && letter2 != 'e' && letter2 != 'i' && letter2 != 'o'
                            && letter2 != 'u')) {
                        repeat = true;
                    } else {
                        repeat = false;
                    }
                } else {
                    repeat = false;
                }
                i++;
                //repeating if there is more characters and it is the same
            } while (repeat && i <= length);
            if (repeat) {
                System.out.println("same");
            } else {
                System.out.println("different");
            }
            //reseating i
            i = 0;
        }
    }
}
