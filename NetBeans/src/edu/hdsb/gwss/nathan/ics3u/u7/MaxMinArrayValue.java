/*
Name:Nathan Wu
Date:5/31/2019
Version:1.0
Description:
    This program finds the min and max values in a 2 dimensional array.
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

import java.util.StringTokenizer;

/**
 *
 * @author 1wunat2
 */
public class MaxMinArrayValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] data = {
            {2, 3, 9, 5},
            {7, -3, 5},
            {-1, 5, 12, 13, 14},
            {1, 0, 0, 15}
        };
        
        StringTokenizer max_min = new StringTokenizer(maxAndMin(data));
        System.out.println("Max: " + max_min.nextToken());
        System.out.println("Min: " + max_min.nextToken());
    }

    public static String maxAndMin(int data[][]) {
        //variables
        int max = 0, min = 0;

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] > max) {
                    max = data[r][c];
                } else {
                    min = data[r][c];
                }
            }
        }
        return max + " " + min;
    }

}
