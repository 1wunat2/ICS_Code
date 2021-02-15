/*
 * Name: James Tang
 * Date: Nov 15, 2019
 * Version: v0.1
 * Description: Outputs random numbers
 */
package edu.hdsb.gwss.james.ics3u.u5.l2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author James Tang
 */
public class RandomNumbers {

	public static void main(String[] args) throws IOException {

		// Create File and Create a File Writer
		File file = new File("output.txt");
		PrintWriter output = new PrintWriter(file);

		// Write Data
		for (int i = 1; i <= 100; i++) {
		int number = (int) ( Math.random() * 100 ) + 1;
		output.println(number);
		}
		// Close File
		output.close();

	}
}
