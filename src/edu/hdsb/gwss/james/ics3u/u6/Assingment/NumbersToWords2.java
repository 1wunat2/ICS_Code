/*
 * Name: James Tang
 * Date: Dec 12, 2019
 * Version: v0.1
 * Description: Converts Numbers to words
 */
package edu.hdsb.gwss.james.ics3u.u6.Assingment;

import java.util.Scanner;

/**
 *
 * @author James Tang
 */
public class NumbersToWords2 {


	public static void main(String[] args) {
		
		//Variables
		Scanner input = new Scanner(System.in);
		String n = "";
		String one = "";
		String ten = "";
		String hundred = "";
		int number, length, i = 0;
		
		//Input error check
		do {
			System.out.print("Enter a number (1-999): ");
			number = input.nextInt();

			if (number > 999 || number < 1) {
				System.out.println("INVALID");
			}
		} while (number > 999 || number < 1);

		//The number that user chose in strings
		n = n + number;
		length = n.length() - 1;
		
		//Different cases (determines how many digits are in the number
		if (length == 0) {
			one = one + n.charAt(length);
			print1DigitNumberInWords(one);
		} else if (length == 1) {
			//The number at each place value
			one = one + n.charAt(length);
			ten = ten + n.charAt(length - 1);
			print2DigitNumberInWords(ten, one);
		} else {
			one = one + n.charAt(length);
			ten = ten + n.charAt(length - 1);
			hundred = hundred + n.charAt(length - 2);
			print3DigitNumberToWords(hundred, ten, one);
		}

	}
	
	public static void print1DigitNumberInWords(String x) {
		//If the number has 1 digit
		
		//Converts to int
		int value = Integer.parseInt(x);
		System.out.println(onesDigitToWords(value));

	}

	public static void print2DigitNumberInWords(String ten, String one) {
		//If number has 2 digits
		
		//Converts to int
		int tenAsInt = Integer.parseInt(ten);
		int oneAsInt = Integer.parseInt(one);
		
		//Case one, teens (10-19)
		if (tenAsInt == 1) {
			System.out.println(teens(oneAsInt));
		
		//Case two, everything else(20-99)
		} else {
			System.out.print(tensDigitToWords(tenAsInt) + " ");
			System.out.println(onesDigitToWords(oneAsInt));
		}
	}

	public static void print3DigitNumberToWords(String hundred, String ten, String one) {
		//If number has 3 digits
		
		//Converts to int
		int hundredAsInt = Integer.parseInt(hundred);
		int tenAsInt = Integer.parseInt(ten);
		int oneAsInt = Integer.parseInt(one);
		
		//Case one, whole hundreds (100, 200, 300 etc.)
		if (tenAsInt == 0 && oneAsInt == 0) {
			System.out.println(hundreds(hundredAsInt));
		
		} else {
			System.out.print(hundreds(hundredAsInt));
			
			//Case 2, hundred with a teen (110,111,212 etc.)
			if (tenAsInt == 1) {
				System.out.println(" "+teens(oneAsInt));
				
			} else {
				//Case 3 everything else (121,456, etc.)
				System.out.print(tensDigitToWords(tenAsInt)+" ");
				System.out.println(onesDigitToWords(oneAsInt));
			}
		}
	}

	public static String tensDigitToWords(int tens) {
		//Case 1, (10)
		if(tens==0){
			return ("");
			
		//Case 2, (20)
		}else if (tens == 2) {
			return ("TWENTY");
		
		//Case 3 (30)
		} else if (tens == 3) {
			return ("THIRTY");
			
		//Case 4 (40,50,60 etc.)
		} else {
			return (onesDigitToWords(tens) + "TY");
		}
	}

	public static String onesDigitToWords(int ones) {
		
		//Numbers in word form
		if (ones == 0) {
			return ("");
		} else if (ones == 1) {
			return ("ONE");

		} else if (ones == 2) {
			return ("TWO");

		} else if (ones == 3) {
			return ("THREE");

		} else if (ones == 4) {
			return ("FOUR");

		} else if (ones == 5) {
			return ("FIVE");

		} else if (ones == 6) {
			return ("SIX");

		} else if (ones == 7) {
			return ("SEVEN");

		} else if (ones == 8) {
			return ("EIGHT");

		} else {
			return ("NINE");
		}
	}

	public static String teens(int ones) {
		
		//Case 1 (10)
		if (ones == 0) {
			return ("TEN");
			
		//Case 2 (11)
		} else if (ones == 1) {
			return ("ELEVEN");
		
		//Case 3 (12)
		} else if (ones == 2) {
			return ("TWELVE");
			
		//Case 4 (13)
		} else if (ones == 3) {
			return ("THIRTEEN");
		
		//Case 5 (14,15,16, etc.)
		} else {
			return (onesDigitToWords(ones) + "TEEN");
		}
	}

	public static String hundreds(int ones) {
		
		//Adds 'hundred' to the number
		return (onesDigitToWords(ones) + " HUNDRED");
	}
}
