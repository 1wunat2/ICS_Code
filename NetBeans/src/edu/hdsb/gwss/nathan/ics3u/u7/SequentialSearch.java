/*
Name: Nathan Wu
Date: 5/30/2019
Version: 1.0
Description:
    
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

/**
 *
 * @author 1wunat2
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int[] numbers = new int[10];
        int i = 0, random;

        splashScreen();

        //getting random values
        do {
            numbers[i] = data(i, numbers);
            System.out.println("Index " + i + ": " + numbers[i]);
            i++;
        } while (i < numbers.length);

        //searching for a random number
        random = (int) (Math.random() * 1000) + 1;
        System.out.println("This number is at index " + sequentialSearch(numbers, random));
    }

    public static void splashScreen() {
        System.out.println("Sequential Search");
        System.out.println("---------------------");
        System.out.println("This program creats a list of 10 random number from "
                + "1 to 1000 and searches for a random from 1 to 1000 that could"
                + "be amongst them.");
    }

    public static int data(int i, int[] data) {
        return (int) (Math.random() * 1000) + 1;
    }

    public static int sequentialSearch(int[] data, int random) {
        //variables
        int index = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == random){
                index = i;
                i = data.length;
            }
        }

        return index;
    }

}
