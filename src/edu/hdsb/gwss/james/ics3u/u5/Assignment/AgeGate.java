/*
 * Name: James Tang
 * Date: Nov 15, 2019
 * Version: v0.1
 * Description: Detects if they are old enough or not
 */
package edu.hdsb.gwss.james.ics3u.u5.Assignment;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author James Tang
 */
public class AgeGate {


    public static void main(String[] args) throws IOException {
        //Variables
        String person;
        int year, month, day;

        //Creates File
        File file = new File("DATA11.txt");
        File fileOut = new File("Data11Out.txt");
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(fileOut);

        do {
            person = input.nextLine();
            StringTokenizer st = new StringTokenizer(person);
            month = Integer.parseInt(st.nextToken());
            day = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());
		
        if ((year + 14) > 2019) {
				output.println("Too Young");
            } 
			else if ((year + 14) == 2019) {
                if (month > 11) {
                    output.println("Too Young");
                } 
				else if (month == 11) {
                    if (day > 14) {
                        output.println("Too Young");
                    } 
				    else {
                        output.println("Old Enough");
                    }
                }
				else {
					output.println("Old Enough");
				}
            } 
			else {
                output.println("Old Enough");
            }
        } while (input.hasNext());
        output.close();
		input.close();
    }
}
