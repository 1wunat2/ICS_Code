/*
Name:Nathan Wu
Date:5/31/2019
Version:0.01
Description:
    This program takes a 2 dimensional array and reverses each row.
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

/**
 *
 * @author 1wunat2
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int[][] data = {
            {2, 3, 9, 5},
            {7, -3, 5},
            {-1, 5, 12, 13, 14},
            {1, 0, 0, 15}
        };
        int max = data[0].length;

        max = findMax(max, data);
        reverse(data, max);
    }

    public static int findMax(int max, int data[][]) {
        for (int r = 0; r < data.length; r++) {
            if (data[r].length > max) {
                max = data[r].length;
            }
        }
        return max;
    }

    public static void reverse(int data[][], int max) {
        //variables
        int[][] reverse = new int[data.length][max];
        int i = 0;

        for (int r = 0; r < data.length; r++) {
            i = 0;
            for (int c = data[r].length - 1; c > -1; c--) {
                reverse[r][i] = data[r][c];
                i++;
            }
        }
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(reverse[r][c] + " ");
            }
            System.out.println("");
        }
    }

}
