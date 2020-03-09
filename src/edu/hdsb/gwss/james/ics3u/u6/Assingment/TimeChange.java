/*
 * Name: James Tang
 * Date: Dec 16, 2019
 * Version: v0.1
 * Description: Converts to satandard time
 */
package edu.hdsb.gwss.james.ics3u.u6.Assingment;

/**
 *
 * @author James Tang
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TimeChange {

	public static void main(String[] args) throws FileNotFoundException {
		//Variables
		String time, timeStr, hoursStr, minutesStr, type = "";
		int hours, minutes, length;
		//Creates File
		File file = new File("TimeInput.txt");
		Scanner input = new Scanner(file);
		File fileOut = new File("TimeOutput.txt ");
		PrintWriter output = new PrintWriter(fileOut);

		do {
			//Takes in Time Variable and tokenizes
			time = input.nextLine();
			time = time.replaceAll(" ", ":");
			StringTokenizer str = new StringTokenizer(time, ":");

			//Initializes variables for each case
			if (str.countTokens() > 2) {
				hoursStr = str.nextToken();
				minutesStr = str.nextToken();
				type = str.nextToken();

			} else {
				hoursStr = str.nextToken();
				minutesStr = str.nextToken();
			}

			//Makes Time as a string and counts length
			timeStr = hoursStr + minutesStr + type;
			length = timeStr.length();
	
			//Converts to integer
			hours = Integer.parseInt(hoursStr);
			minutes = Integer.parseInt(minutesStr);

			//Detects if it is in standard or traditional
			if (length > 4) {
				output.println(convertToStandard(hours, minutes, minutesStr, type));
			} else {
				output.println(convertToTraditional(hours, minutes, minutesStr));
			}
		} while (input.hasNext());

		//Closes Input And Output
		output.close();
		input.close();
	}

	public static String convertToTraditional(int hour, int minutes, String minutesStr) {

		//Invalid Cases
		if (hour > 24 || hour < 0) {
			return ("INVALID");
		} else if (minutes > 60 || minutes < 0) {
			return ("INVALID");

			//Regular Case
		} else {
			if (hour < 12) {
				return (hour + ":" + minutesStr + " AM");
			} else {
				hour = hour - 12;
				return (hour + ":" + minutesStr + " PM");
			}
		}
	}

	public static String convertToStandard(int hour, int minutes, String minutesStr, String type) {

		//Converts to Upper Case
		type = type.toUpperCase();

		//Invalid Cases
		if (hour > 12 || hour < 0) {
			return ("INVALID");
		} else if (minutes > 60 || minutes < 0) {
			return ("INVALID");
		}
		if (type.equals("AM") || type.equals("PM")) {
			if (type.equals("AM")) {
				return (hour + ":" + minutesStr);
			} else {
				hour = hour + 12;
				return (hour + ":" + minutesStr);
			}
		}else{
			return("INVALID");
								}

		}

	}

