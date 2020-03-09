/*
Name:Nathan
Date:4/29/2019
Version:0.01
Description:
    
 */
package edu.hdsb.gwss.nathan.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1wunat2
 */
public class ArablishOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variable
        String line, word, number, line3, word2;
        char letter, character;
        int length, i = 0, end, x = 0;
        boolean repeat = false;

        //object
        File arab = new File("DATA31.txt");
        Scanner input = new Scanner(arab);

        //variable
        while (input.hasNextLine()) {
            line = input.nextLine();
            StringTokenizer line2 = new StringTokenizer(line);
            do {
                word2 = line2.nextToken();
                do {
                    //dettermining if it is number or not
                    character = word2.charAt(i);
                    repeat = Character.isDigit(character);
                    i++;
                } while (repeat && i < word2.length());
                i = 0;
                //if (line2.countTokens() > 1) {
                 //   line = line + " ";
                //}
                //if it is a number
                if (repeat) {
                    length = word2.length();
                    number = line.substring(0, length);
                    word = line.substring(length);
                    line = word + number;
                    //if it is a string, word
                } else {
                    do {
                        letter = word2.charAt(0);
                        end = word2.length();
                        word = line.substring(1);
                        line = word + letter;
                        i++;
                    } while (i <= word.length());
                }
                x++;
            } while (x < line2.countTokens());
            System.out.println(line);
            i = 0;
        }
    }

}
