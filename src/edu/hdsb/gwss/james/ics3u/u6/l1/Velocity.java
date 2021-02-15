 /* Name: James Tang
 * Date: Dec 10, 2019
 * Version: v0.1
 * Description: Calculates Velocity
*/
package edu.hdsb.gwss.james.ics3u.u6.l1;

import java.util.Scanner;

/**
 *
 * @author James Tang
 */
public class Velocity {
	
	//Variables
	public static double distance, time, velocity;

	public static void displaySplashScreen(){
		System.out.println("This programs calculates your velocity.\n");
		
	}
	public static void getVariables(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your distance: ");
		distance = input.nextDouble();
		
		System.out.print("What is your time: ");
		time = input.nextDouble();
	}
	
	public static void calculateVelocity(){
		velocity = distance/time;
		System.out.println("Your velocity is: "+velocity);
	}
    public static void main(String[] args) {
		displaySplashScreen();
		getVariables();
		calculateVelocity();
    }
    
}
