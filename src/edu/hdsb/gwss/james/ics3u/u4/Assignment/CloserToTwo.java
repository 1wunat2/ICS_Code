/*
 * Name: James Tang
 * Date: Nov 3, 2019
 * Version: v0.2
 * Description: Displays numbers as they get closer to 2
 */
package edu.hdsb.gwss.james.ics3u.u4.Assignment;

/**
 *
 * @author James Tang
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class CloserToTwo {

	public static void main(String[] args) {

		//Object
		NumberFormat number = NumberFormat.getIntegerInstance();
		Scanner input = new Scanner(System.in);

		//Splash Screen
		System.out.println("Closer to Two");
		System.out.println("This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... and so on gets closer to 2 without becoming 2.");

		//Variables
		double i = 1, x = 0, y = 0, run;

		//Input
		do {
			System.out.print("How many time(s) do you want this program to run: ");
			run = input.nextDouble();
			if (run < 1) {
				System.out.println("Invalid number of time(s). Number of time(s) can not be smaller than 1");
			}
			if (run != Math.floor(run)) {
				System.out.println("Invalid number of times(s). Number of times(s) can not be a decimal");
			}
			if (run >= 52) {
				System.out.println("Invalid number of time(s). Number of times has to be smaller than 52");
			}
		} while (run < 1 || run != Math.floor(run) || run >= 52);

		//Processing
		System.out.println("0.0 + 1/1 = 1");
		while (y <= run) {
			y++;
			x += (1 / i);
			i *= 2;
			System.out.println(x + " + " + "1/" + number.format(i) + " = " + (x + 1 / i));
		}

	}

}
