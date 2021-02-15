/*
 * Name: James Tang
 * Date: Oct 28, 2019
 * Version: v0.3
 * Description: Calculates the compund intrest from user inputted values
 */
package edu.hdsb.gwss.james.ics3u.u4.Assignment;

/**
 *
 * @author James Tang
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class CompoundInvesting {

	public static void main(String[] args) {

		//Object
		NumberFormat number = NumberFormat.getIntegerInstance();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);

		//Variables
		double yearlyInvestment, intrestRate, year, yearCounter = 1, total, amountInAccount, intrestAmount;

		//Constant
		String format = "%-15s %15s %15s %15s \n";

		//Splash Screen
		System.out.println("This program will print out a title table that will display the amount of a yearly investment over a period time.");

		//Input
		do {
			System.out.print("Enter the yearly investment: ");
			yearlyInvestment = input.nextDouble();
			if (yearlyInvestment < 0.05) {
				System.out.println("That is an invalid yearly investment. Yearly investment has to be larger that $0.05");
			}
		} while (yearlyInvestment < 0.05);

		do {
			System.out.print("Enter the interest rate (%): ");
			intrestRate = input.nextDouble();
			if (intrestRate < 0) {
				System.out.println("Invalid intrest rate. Intrest rate has to be larger than 0%");
			}
		} while (intrestRate < 0);

		do {
			System.out.print("Enter the number of year(s): ");
			year = input.nextDouble();
			if (year < 1) {
				System.out.println("Invalid number of year(s). Number of year(s) can not be smaller than 1");
			}
			if (year != Math.floor(year)) {
				System.out.println("Invalid number of year(s). Number of year(s) can not be a decimal");
			}
			if (year > 15) {
				System.out.println("Invalid number of year(s). Number of years has to be smaller than 15");
			}
		} while (year < 1 || year != Math.floor(year) || year > 15);

		//Processing
		System.out.format(format, "Year", "Amount in Account", "Intrest", "Total");
		amountInAccount = yearCounter * yearlyInvestment;
		do {
			intrestAmount = amountInAccount * (intrestRate / (100 + 1));
			total = amountInAccount + intrestAmount;
			System.out.format(format, number.format(yearCounter), money.format(amountInAccount), money.format(intrestAmount), money.format(total));
			yearCounter++;
			amountInAccount = total + yearlyInvestment;
		} while (yearCounter <= year);

	}
}
