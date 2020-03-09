/*
Name:Nathan Wu
Date:5/27/2019
Version:1.0
Description:
    This program uses bubble sort to sort 10 numbers in a file.
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    //variables
    public static int n2 = 0, swaps = 0, comparison = 0;

    public static void main(String[] args) throws FileNotFoundException {
        //objects
        File sorting = new File("NumberList");
        Scanner input = new Scanner(sorting);

        //variables
        int[] numbers = new int[10];
        int i = 0, n = 1;

        System.out.println("Unsorted list:");
        
        while (input.hasNextLine()) {
            numbers[i] = Integer.parseInt(input.nextLine());

            //printing list befor sorting
            System.out.println(numbers[i]);

            i++;
        }
        //sorting
        for (i = 0; i < numbers.length - 1; i++) {
            numbers[numbers.length - n] = bubbleSort(numbers);
            n++;
        }

        //print the sorted list
        print(numbers);

    }

    public static int bubbleSort(int[] data) {
        //variables
        int temporaryStorage, i = 0;
        n2++;

        //swap or not
        for (i = 0; i < data.length - n2; i++) {
            comparison++;
            if (data[i] > data[i + 1]) {
                temporaryStorage = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temporaryStorage;
                swaps++;
            }
        }
        return data[data.length - n2];
    }

    public static void print(int[] data) {
        //printing final results
        System.out.println("Sorted list:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("It did " + swaps + " swaps");
        System.out.println("It did " + comparison + " comparisons");
    }

}
