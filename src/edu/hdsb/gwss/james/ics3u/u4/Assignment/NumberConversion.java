/*
 * Name: James Tang
 * Date: Nov 3, 2019
 * Version: v0.1
 * Description: Converts numbers to different forms
 */
package edu.hdsb.gwss.james.ics3u.u4.Assignment;

/**
 *
 * @author James Tang
 */
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.*;

public class NumberConversion {

	static void Binary_Decimal() {

		//Object
		Scanner input = new Scanner(System.in);
		NumberFormat number = NumberFormat.getIntegerInstance();
		Stack<Integer> stack = new Stack<Integer>();
		//Variables
		String binary;

		//Splash Screen
		System.out.println("Choice 1:");

		//Input
		System.out.print("Enter a Binary Number: ");
		binary = input.nextLine();

		//Processing
		long decimal = 0;
		for (int i = 0; i < binary.length(); i++) {
			decimal = (long) (decimal + (binary.charAt(i) - '0') * Math.pow(2, binary.length() - i - 1));
		}
		System.out.println(decimal);

	}

	static void Octal_Decimal() {
		//Object
		Scanner input = new Scanner(System.in);

		//Variables
		String octal;

		//Splash Screen
		System.out.println("Choice 2:");

		//Input
		System.out.print("Enter an octal Number: ");
		octal = input.nextLine();

		//Processing
		long decimal = 0;
		for (int i = 0; i < octal.length(); i++) {
			decimal = (long) (decimal + (octal.charAt(i) - '0') * Math.pow(8, octal.length() - i - 1));
		}
		System.out.println(decimal);

	}

	static void Decimal_Binary() {

		//Object
		Scanner input = new Scanner(System.in);
		

		//Variables
		int decimal, y;
		String binary = "";

		//Splash Screen
		System.out.println("Choice 3:");

		//Input
		System.out.print("Enter a Decimal Number: ");
		decimal = input.nextInt();

		//Processing
		while (decimal != 0) {
			y = decimal % 2;
			binary = y + "" + binary;
			decimal = (decimal - (decimal % 2)) / 2;;

		}
		System.out.println(binary);
	}

	static void Decimal_Octal() {

		//Object
		Scanner input = new Scanner(System.in);
		NumberFormat number = NumberFormat.getIntegerInstance();
		//Variables
		int y, decimal;
		String octal = "";

		//Splash Screen
		System.out.println("Choice 4:");

		//Input
		System.out.print("Enter an decimal Number: ");
		decimal = input.nextInt();

		//Processing
		while (decimal != 0) {
			y = decimal % 8;
			octal = y + "" + octal;
			decimal = (decimal - (decimal % 8)) / 8;

		}
		System.out.println(octal);
	}

	static void Exit() {
		//Splash Screen
		System.out.println("Option 5: ");
		System.out.println("Good Bye");
	}

	public static void main(String[] args) {
		//Object
		Scanner input = new Scanner(System.in);

		//Variables
		double x;
		//Splash Screen
		System.out.println("Number Conversion \n");
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Octal to Decimal");
		System.out.println("3. Decimal to Binary");
		System.out.println("4. Decimal to Octal");
		System.out.println("5. Exit");
		//Input
		do {
			System.out.print("\n Choose a option (1-5) to start conversion process: ");
			x = input.nextDouble();
			if (x > 5) {
				System.out.println("Choice cannot be larger than 5");
			}
			if (x < 1) {
				System.out.println("Choice cannot be smaller than 1");
			}
			if (x != Math.floor(x)) {
				System.out.println("Choice cannot be a decimal");
			}
			//Processing
			if (x == 1) {
				Binary_Decimal();
			}
			if (x == 2) {
				Octal_Decimal();
			}
			if (x == 3) {
				Decimal_Binary();
			}
			if (x == 4) {
				Decimal_Octal();
			}
		} while (x != 5);
		Exit();
	}
}
