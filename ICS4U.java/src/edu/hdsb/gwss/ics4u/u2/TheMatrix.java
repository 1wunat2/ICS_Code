/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Scanner;

/**
 *
 * @author 4U-Nathan
 */
public class TheMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLE
        int r, c, choice, n, length;
        int[][] data, data2, result;
        boolean range = true;

        //SPLASH SCREEN
        System.out.println("The Matrix");
        System.out.println("This program creates a matrix of random values from 0-9 of your specified size. "
                + "It then prints the tranposed matrix. Then multiplies the matrix by a constant of you choice and displays.\n");

        System.out.println("Please select one of the options");
        System.out.println("1: The Random Matrix\n"
                + "2: The Transpose Matrix\n"
                + "3: Multiplying a Matrix by a Constant\n"
                + "4: Multiplying Two Matrices");
        System.out.println("Your choice: ");
        choice = integerInput(range);
        range = false;

        //INPUT
        System.out.println("Enter how many rows you want the matrix to have: ");
        r = integerInput(range);
        System.out.println("Enter how many columns you want the matrix to have: ");
        c = integerInput(range);
        data = new int[r][c];

        //PROCESSING
        generateMatrix(data);

        switch (choice) {
            //TRANSPOSE MATRIX
            case 2:
                result = new int[c][r];
                generateTranspose(data, result);
                break;
            //MULTIPLY MATRIX BY CONSTANT
            case 3:
                result = new int[r][c];
                copyMatrix(data, result);
                System.out.println("What do you want to multiply the matrix by: ");
                multiplyMatrixByConstant(result, integerInput(range));
                break;
            //MULTIPLY MATRIX BY MATRIX
            case 4:
                System.out.println("How many columns do you want the second matrix to have: ");
                n = integerInput(range);
                data2 = new int[c][n];
                generateMatrix(data2);
                result = new int[r][n];
                multiplyMatrix(data, data2, result);
                break;
            //GENERATE RANDOM MATRIX
            default:
                result = data;
                break;
        }
        //PRINTS OUT THE RESULTS
        length = largestLength(result);
        printArray(result, length);
    }

    //GETS INT INPUT WITH ERROR CHECKING
    public static int integerInput(boolean range) {
        int n = 0;
        boolean valid;
        Scanner input = new Scanner(System.in);
        do {
            try {
                n = Integer.parseInt(input.nextLine());
                if ((n < 1 && !range) || ((n < 1 || n > 4) && range)) {
                    System.out.println("Invalid input");
                    valid = false;
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                valid = false;
                System.out.println("Invalid input");
            }
        } while (!valid);
        return n;
    }

    //COPIES MATRIX INTO NEW MATRIX
    public static void copyMatrix(int[][] data, int[][] dataCopy) {
        for (int i = 0; i < data.length; i++) {
            System.arraycopy(data[i], 0, dataCopy[i], 0, data[i].length);
        }
    }

    //PRINTS OUT THE MATRIX
    public static void printArray(int[][] data, int length) {
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                System.out.format("%" + length + "s", data1[j]);
            }
            System.out.println("");
        }
    }

    //GENERATES RANDOM MATRIX NxA WITH VALUES FROM 0-9
    public static void generateMatrix(int[][] data) {
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                data1[j] = (int) (Math.random() * 10);
            }
        }
    }

    //TRANSPOSES THE GENERATED MATRIX
    public static void generateTranspose(int[][] data, int[][] transpose) {
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = data[j][i];
            }
        }
    }

    //MULTIPLIES GENERATED MATRIX BY A CONSTANT
    public static void multiplyMatrixByConstant(int[][] multiply, int n) {
        for (int[] multiply1 : multiply) {
            for (int j = 0; j < multiply1.length; j++) {
                multiply1[j] = multiply1[j] * n;
            }
        }
    }

    //MULTIPLIES GENERATED MATRIX BY ANOTHER GENERATED MATRIX
    public static void multiplyMatrix(int[][] data, int[][] data2, int[][] product) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                for (int k = 0; k < data[i].length; k++) {
                    product[i][j] += data[i][k] * data2[k][j];
                }
            }
        }
    }

    //FINDS THE LARGEST LENGTH
    public static int largestLength(int[][] data) {
        int longest = 0, length;

        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                if (Integer.toString(data1[j]).length() > longest) {
                    longest = Integer.toString(data1[j]).length();
                }
            }
        }
        return longest + 1;
    }
}
