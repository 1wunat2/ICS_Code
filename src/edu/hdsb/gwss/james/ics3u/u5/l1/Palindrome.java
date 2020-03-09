/*
 * Name: James Tang
 * Date: Nov 11, 2019
 * Version: v0.2
 * Description:Checks if word is a palindrome
 */
package edu.hdsb.gwss.james.ics3u.u5.l1;

import java.util.Scanner;

/**
 *
 * @author James Tang
 */
public class Palindrome {

	public static void main(String[] args) {
		//Object
		Scanner input = new Scanner(System.in);

		//Variables
		String txt;
		int i = 0, length;
		char a, b;
		//Splash Screen
		System.out.println("Palindrome\n"
				+ " \n"
				+ "Words that are the same forwards and backwards are called palindromes.  "
				+ "\n This program determine if a word is a palindrome.");
		//Input
		System.out.print("Enter a Word: ");
		txt = input.nextLine();

		//Processing
                txt = txt.replaceAll(" ","");
		length = txt.length();
		a = txt.charAt(i);
		b = txt.charAt(length - (i + 1));

		if (a != b) {
			System.out.println("It is not a palindrome.");
		}

		while (a == b && i < (length / 2)) {
			i++;
			a = txt.charAt(i);
			b = txt.charAt(length - (i + 1));
			if (a != b) {
				System.out.println("It is not a palindrome.");
			}
		}
		if (i==(length-length%2)/2)
			System.out.println("It is a palindrome");

	}
}
