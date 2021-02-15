/*
 * Name: James Tang
 * Date: Oct 8, 2019
 * Version: v0.2
 * Description: Detects if the year inputed is a leap year or not
 */
package edu.hdsb.gwss.james.ics3u.u3.Assignment;

/**
 *
 * @author James Tang
 */
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		//Object
		Scanner input = new Scanner(System.in);

		//Variables
		int year;

		//Splash Screen 
		System.out.println("This program can detect whether or not the year that you input is a leap year");

		//Input
		System.out.print("Please Enter a Year: ");
		year = input.nextInt();

		//Processing
		if (year < 1752) {
			System.out.println("It is not a leap year ");
		} else if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0)) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}

}
