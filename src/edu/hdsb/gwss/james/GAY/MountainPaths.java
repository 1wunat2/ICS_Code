/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.U2;

/**
 *
 * @author james.tangjyt
 */
import java.util.Scanner;
import java.io.File;

public class MountainPaths {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int[][] gay = readData( "Colorado.844x480.dat");
		for (int row = 0; row < gay.length; row++) {
				for (int col = 0; col < gay[row].length; col++) {
				 System.out.println(gay[row][col] );
				}
			}
		
	}

	public static int[][] readData(String fileName) {
		Scanner s;
		int[][] data;

		File file = new File(fileName);
		s = new Scanner(System.in);

		try {
			data = new int[480][844];
			for (int row = 0; row < data.length; row++) {
				for (int col = 0; col < data[row].length; col++) {
					data[row][col] = s.nextInt();
				}
			}
		} catch (Exception e) {
			System.out.println("STEP 01 - Exception");
			e.printStackTrace();
			data = null;
		}
		return data;
	}
	
}
