 /*
 * Name: James Tang
 * Date: Nov 18, 2019
 * Version: v0.2
 * Description: Prints the words backwords and keeps numbers normal
 */
package edu.hdsb.gwss.james.ics3u.u5.Assignment;

/**
 * @author James Tang
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arablish {

	public static void main(String[] args) throws IOException {

		//Variables
		String line, word, reverse = "", number = "";
		boolean numberCheck;
		char character;
		int length, i = 0;

		//Files
		File file = new File("Data31.txt");
		File fileOut = new File("Data31Out.txt");
		Scanner input = new Scanner(file);
		PrintWriter output = new PrintWriter(fileOut);

		//Processing
		while (input.hasNextLine()) {
			line = input.nextLine();
			length = line.length() - 1;

			//Inverts Everything
			for (i = length; i >= 0; i--) {
				reverse = reverse + line.charAt(i);
			}
			i = 0;

			//Checks for numbers
			StringTokenizer st = new StringTokenizer(reverse);
			do {
				word = st.nextToken();

				do {
					character = word.charAt(i);
					//checks if character is integer
					if ((int) character <= 57 && (int) character >= 48) {
						numberCheck = true;
					} else {
						numberCheck = false;
					}
					i++;
				} while (numberCheck && i < word.length());
				                  
				if (numberCheck) {
					//Resets 'i'
					i = 0;
					//Flips numbers back
					for (i = word.length() - 1; i >= 0; i--) {
						number = number + word.charAt(i);
					}
					reverse = reverse.replace(word, number);
				}
				//Resets Variables
				i = 0;
				number = "";
			} while (st.hasMoreTokens());

			//Output
			output.println(reverse);

			//Resets Variables
			reverse = "";
			number = "";
		}
		output.close();
		input.close();
	}
}
