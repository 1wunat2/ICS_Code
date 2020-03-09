/*
Name:Nathan Wu
Date:4/23/2019
Version:
Description:
 */
package edu.hdsb.gwss.nathan.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class RandomStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variable
        String str = "";

        //writing the file
        File strings = new File("output.txt");
        PrintWriter output = new PrintWriter(strings);

        //getting all the values
        for (int n = 0; n < 100; n++) {
            //getting the 6 characters for the string
            for (int x = 0; x < 6; x++) {
                //generating the letter
                char letter = (char) ((int) (Math.random() * 26) + 'A');
                str = str + letter;
            }
            output.println(str);
            str = "";
        }
        //file close
        output.close();
        
        //getting the string
        Scanner input = new Scanner(strings);
        
        //writing/displaying each string
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }
        //file close
        input.close();
    }

}
