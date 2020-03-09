/*
 * Name: James Tang
 * Date: Nov 3, 2019
 * Version: v0.3
 * Description: Calculates when population out grows food supply
 */
package edu.hdsb.gwss.james.ics3u.u4.Assignment;

/**
 *
 * @author James Tang
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class LabAnimals {

	public static void main(String[] args) {
		//Object 
		NumberFormat number = NumberFormat.getIntegerInstance();
		Scanner input = new Scanner(System.in);

		//Variables
		double hour = 0, animalStart, animalEnd, foodStart, foodAdd, foodEnd;

		//Constant
		String format = "%-20s %-20s %-20s %-20s %-20s \n";

		//Splash Screen
		System.out.println("Lab Animals\n"
				+ " \n"
				+ "At present there are X animals in the lab and enough food for Y animals.  At the end of every hour \n"
				+ "the population doubles, and enough food is added to support Z more animals. During any hour the \n"
				+ "animals will eat enough food for only themselves. The program will determine when the population \n"
				+ "will outgrow the food supply.\n"
				+ " ");
		//Input
		do {
			System.out.print("Enter the initial population: ");
			animalStart = input.nextDouble();
			if (animalStart < 1) {
				System.out.println("Invalid initial population. Initial population can not be smaller than 1");
			}
			if (animalStart != Math.floor(animalStart)) {
				System.out.println("Invalid initial population. Initial population can not be a decimal");
			}
		} while (animalStart < 1 || animalStart != Math.floor(animalStart));

		do {
			System.out.print("Enter the initial food supply: ");
			foodStart = input.nextDouble();
			if (foodStart < 1) {
				System.out.println("Invalid initial food supply. Inital food supply can not be smaller than 1");
			}
			if (foodStart != Math.floor(foodStart)) {
				System.out.println("Invalid inital food supply. Initial Food supply can not be a decimal");
			}
		} while (foodStart < 1 || foodStart != Math.floor(foodStart));

		do {
			System.out.print("Enter the amount of food to add each hour: ");
			foodAdd = input.nextDouble();
			if (foodAdd < 0) {
				System.out.println("Invalid amount of food added. Food added each hour can not be smaller than 0");
			}
			if (foodAdd != Math.floor(foodAdd)) {
				System.out.println("Invalid amount of food added. Food added can not be a decimal.");
			}
		} while (foodAdd < 0 || foodAdd != Math.floor(foodAdd));

		//Processing
		do {
			hour++;
			animalEnd = animalStart * 2;
			foodEnd = (foodStart - animalStart) + foodAdd;
			//Output
			System.out.format(format, "Hour","Animals at Start","Food at Start","Food at End","Animals at End");
			System.out.format(format, number.format(hour), number.format(animalStart), number.format(foodStart), 
			number.format(foodEnd), number.format(animalEnd));
			//Processing
			animalStart = animalEnd;
			foodStart = foodEnd;
		} while (animalEnd < foodEnd);
		
		//Output
		System.out.println("It takes " + number.format(hour) + " hour(s) for the animals to outgrow the food supply.");

	}
}
