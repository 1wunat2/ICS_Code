/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

/**
 *
 * @author nwu10
 */
public class ArrayUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    public static void display(int[][] data) {
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                System.out.format("%10s" + data1[j]);
            }
        }
    }

    public static int max(int[][] data) {
        int high = Integer.MIN_VALUE;

        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                if (data1[j] > high) {
                    high = data1[j];
                }
            }
        }
        return high;
    }

    public static int min(int[][] data) {
        int low = Integer.MAX_VALUE;

        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                if (data1[j] < low) {
                    low = data1[j];
                }
            }
        }
        return low;
    }

    public static int average(int[][] data) {
        int total = 0, average, n = 0;
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                total += data1[j];
                n++;
            }
        }
        average = total / n;
        return average;
    }

    public static int sum(int[][] data) {
        int total = 0;
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                total += data1[j];
            }
        }
        return total;
    }
}
