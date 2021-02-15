/*
 * Name: James Tang
 * Date: Nov 8, 2019
 * Version: v0.2
 * Description: Creates a word square
 */
package edu.hdsb.gwss.james.ics3u.u5.l1;

/**
 * @author James Tang
 */
import java.util.Scanner;

public class WordSquare {

	public static void main(String[] args) {
		//Object
		Scanner input = new Scanner(System.in);

		//Variables
		String txt, constant;
		int length, i = 0;

		//Splash Screen
		System.out.println("Word Square\n"
				+ "\n"
				+ "This program prints a square out of the letters of a word entered by the user.");

		//Input
		System.out.print("Enter a Word: ");
		txt = input.nextLine();

		//Processing
		length = txt.length();
		txt = txt.toUpperCase();
		System.out.println(txt);
		while (i < (length - 1)) {
			txt = txt.charAt(1) + txt.substring(2, (length)) + txt.charAt(0);

			System.out.println(txt);
			i++;
		}
	}

}
