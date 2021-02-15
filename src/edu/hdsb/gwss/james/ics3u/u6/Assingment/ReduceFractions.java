/*
 * Name: James Tang
 * Date: Dec 16, 2019
 * Version: v0.1
 * Description: Reduces fractions
 */
package edu.hdsb.gwss.james.ics3u.u6.Assingment;

/**
 *
 * @author james.tangjyt
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReduceFractions {

	public static void main(String[] args) throws FileNotFoundException {
		//Variables
		String fraction;
		int numerator, denominator;

		//Creates File
		File file = new File("ReduceInput.txt");
		Scanner input = new Scanner(file);
		File fileOut = new File("ReduceOutput.txt ");
		PrintWriter output = new PrintWriter(fileOut);

		//Reads each line of the file
		do {
			//Gets numerator and denominators
			fraction = input.nextLine();
			fraction = fraction.replaceAll(" ", "/");
			StringTokenizer str = new StringTokenizer(fraction, "/");
			numerator = Integer.parseInt(str.nextToken());
			denominator = Integer.parseInt(str.nextToken());

			//Prints fraction in lowest terms
			output.println(ReduceFractions(numerator, denominator));

		} while (input.hasNext());

		//Closes Input and Output
		output.close();
		input.close();
	}

	public static String ReduceFractions(int numerator, int denominator) {
		//Variables
		int gcd = 1, rNum, rDen;
		String Num = "", Den = "";

		//Special Cases
		if (denominator == 0) {
			return ("INVALID");
		} else if (numerator == 0) {
			return ("0");
		} else if (numerator == denominator) {
			return ("1");
		} else {

			//Case if it is negative
			if (numerator < 0 || denominator < 0) {

				numerator = Math.abs(numerator);
				denominator = Math.abs(denominator);
				return ("-" + ConvertToLowestTerms(numerator, denominator));

				//Returns fraction in lowest terms
			} else {
				return (ConvertToLowestTerms(numerator, denominator));
			}
		}
	}

	public static String ConvertToLowestTerms(int numerator, int denominator) {

		//Variables
		int gcd = 1, rNum, rDen;
		String Num = "", Den = "";

		//Finds GCD
		for (int i = Math.min(numerator, denominator); i > 0; i--) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
				break;
			}
		}
		//Reduces numerator and denominator to lowest terms
		rNum = numerator / gcd;
		rDen = denominator / gcd;

		//Converts into string
		Num = Num + rNum;
		Den = Den + rDen;

		//Returns Values
		if (rDen == 1) {
			return (Num);
		} else {
			return (Num + "/" + Den);
		}
	}
}
