/*
Name:Nathan Wu
Date:4/23/2019
Version:1.0
Description:
    the program will creat and write 100 numbers, from 1 to 100, 1 per line and 
    it will display the numbers.
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
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //writing the file
        File numbers = new File ("output.txt");
        PrintWriter output = new PrintWriter(numbers);
        
        //getting all the values
        for(int x = 0; x < 100; x++){
            //generating the number
            int number = (int)( Math.random() * 100 ) + 1;
            //writing the number in the file
            output.println(number);
        }
        //file close
        output.close();
        
        //getting the number
        Scanner input = new Scanner(numbers);
        
        //writing/displaying each number
        while(input.hasNextLine()){
            System.out.println(input.nextInt()+input.nextLine());
        }
        //file close
        input.close();
    }
    
}
