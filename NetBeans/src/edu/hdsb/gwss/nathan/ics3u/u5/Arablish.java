package edu.hdsb.gwss.nathan.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nwu10
 */
public class Arablish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variable
        String line, word, reverse = "", rest, reverse1, number = "";
        boolean repeat;
        char character;
        int i = 0, length, x = 0, y = 0;

        File arab = new File("DATA31.txt");
        Scanner input = new Scanner(arab);

        while (input.hasNextLine()) {
            line = input.nextLine();

            for (i = line.length() - 1; i >= 0; i--) {
                reverse = reverse + line.charAt(i);
            }
            i = 0;

            StringTokenizer line2 = new StringTokenizer(reverse);
            do {
                word = line2.nextToken();
                y++;
                do {
                    character = word.charAt(i);
                    repeat = Character.isDigit(character);
                    i++;
                } while (repeat && i < word.length());
                if (repeat) {
                    i = 0;
                    for (i = word.length() - 1; i >= 0; i--) {
                        number = number + word.charAt(i);
                    }
                    reverse = reverse.replace(word, number);
                }

                //reseating the variables
                i = 0;
                y = 0;
                x = 0;
                number = "";
            } while (line2.hasMoreTokens());
            System.out.println(reverse);
            reverse = "";
            number = ""; 
        }
    }

}
