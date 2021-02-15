/*
 * Name: James Tang
 * Date: Jan 06, 2020
 * Version: v0.1
 * Description: Stores golf scores than displays them
 */
package edu.hdsb.gwss.james.ics3u.u7.l1;

import java.util.Scanner;

/*
 * @author James Tang
 */
public class Golf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Creats Golf Score Array
		int[] golfScore = new int[18];
		
		//Variables
		int i;
		int hole = 1;

		//Stores Golf Scores
		for (int j = 0; j < golfScore.length; j++) {
			System.out.print("Enter Score For Hole #" + hole + ": ");
			golfScore[j] = input.nextInt();
			hole++;
		}

	

		//Resets Variables
		i = 0;
		hole = 1;
		int total = 0;

		//Displays Golf Scores
		while (i < golfScore.length) {
			System.out.println("Hole #" + hole + ": " + golfScore[i]);
			i++;
			hole++;
		}
		for (int j = 0; j < golfScore.length; j++) {
			total = total + golfScore[j];
		}
		System.out.println(total/golfScore.length);
	}

}
