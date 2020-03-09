/* 
* Name: James Tang
 * Date: Nov 15, 2019
 * Version: v0.1
 * Description: Outputs random strings
 */
package edu.hdsb.gwss.james.ics3u.u5.l2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author James Tang
 */
public class RandomStrings {

	public static void main(String[] args) throws IOException {
		String str = "";
		// Create File and Create a File Writer
		File file = new File("output.txt");
		PrintWriter output = new PrintWriter(file);

		// Write Data 
		for (int i = 1; i <= 100; i++) {
			for (int x = 0; x < 6; x++) {
				char letter = (char) ((int) (Math.random() * 26 + 'A'));
				str = str + letter;
			}
			output.println(str);
			str = "";
		}
		// Close File
		output.close();

	}

}
