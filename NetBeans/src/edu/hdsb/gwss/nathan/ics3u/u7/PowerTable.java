/*
Name:Nathan Wu
Date:5/31/2019
Version:1.0
Description:
    This program creates the power table for numbers from 0 to 15.
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

/**
 *
 * @author 1wunat2
 */
public class PowerTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int[][] table = new int [16][15];
        
        table(table);
    }
    
    public static void table(int data[][]){
        for(int r = 0; r < data.length; r++){
            for(int c = 0; c < data[r].length; c++){
                data[r][c] = (int)Math.pow(r, c);
                System.out.print(data[r][c] + " ");
            }
            System.out.println("");
        }
    }
    
}
