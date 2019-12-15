/*
Name:Nathan Wu
Date:6/6/2019
Version: 0.01
Description:
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

/**
 *
 * @author nwu10
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000) + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");

        selectionSort(numbers);
    }

    public static void selectionSort(int[] data) {
        //variables
        int max = data[0], sort, j = 0, i, n = 0;

        while (j < data.length) {
            max = data[0];
            n = 0;
            for (i = 0; i < data.length - j; i++) {
                if (data[i] > max) {
                    max = data[i];
                    n = i;
                }
            }
            i--;
            sort = data[i];
            data[i] = max;
            data[n] = sort;
            j++;
        }
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
    }
}
