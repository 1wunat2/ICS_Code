/*
 * Name: James Tang
 * Date: Nov 11, 2019
 * Version: v0.1
 * Description: Checks your check digit
 */
package edu.hdsb.gwss.james.ics3u.u5.l1;

/**
 *
 * @author James Tang
 */
import java.util.Scanner;

public class SINCheck {

	public static void main(String[] args) {
		//Object
		Scanner input = new Scanner(System.in);

		//Variables
		String txt;
		int evenSum = 0, even = 0, i = -1;

		//Splash Screen
		System.out.println("Social Insurance Number \n"
				+ "\n In Canada, each person is uniquely identified by the Government with a Social Insurance Number (SIN). "
				+ "\n A Social Insurance Number consists of nine digits. The first eight numbers are assigned digits and the"
				+ "\n the last number is a digit check. This program determines if the check digit for a SIN is correct. \n");
		//Input 
		System.out.print("Enter your SIN number: ");
		txt = input.nextLine();
		//Processing
		while (i <= 8) {
			i += 2;
			char a = txt.charAt(i);
			String s = Character.toString(a);
			even = Integer.parseInt(s);
			even *= 2;

			if (even > 9) {
				String evenString = Integer.toString(even);
				char a1 = evenString.charAt(0);
				char a2 = evenString.charAt(1);
				String s1 = Character.toString(a1);
				String s2 = Character.toString(a2);
				int even1 = Integer.parseInt(s1);
				int even2 = Integer.parseInt(s2);
				evenSum = even1 + even2 + evenSum;
				System.out.println("even = " + even);
				System.out.println("EvenSum = " + evenSum);
			} else {
				even = Integer.parseInt(s);
				evenSum = even + evenSum;
				System.out.println("even = " + even);
				System.out.println("EvenSum = " + evenSum);
			}
		}

		System.out.println(evenSum);
	}

}
