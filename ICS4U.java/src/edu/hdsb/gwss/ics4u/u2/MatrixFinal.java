/*
 * Name: Nathan Wu
 * Date: 9/29/2020
 * Version: v1.0
 * Description:
 *      This program creates a matrix and does the operation of the users choosing, print generated matrix, transpose
 *      matrix, multiply matrix by constant, multiply matrix by matrix.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Scanner;

/**
 *
 * @author nwu10
 */
public class MatrixFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int choice, r, c, constant, r2, c2;
        int[][] data, data2, result;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //SPLASH SCREEN
        System.out.println("The Matrix");
        System.out.println("This program creates a matrix of random values from 0-9 of your specified size. "
                + "It then prints the tranposed matrix. Then multiplies the matrix by a constant of you choice and displays.\n");

        //INPUT
        //Gets users menu choice
        System.out.println("Please select one of the options");
        System.out.println("1: The Random Matrix\n"
                + "2: The Transpose Matrix\n"
                + "3: Multiplying a Matrix by a Constant\n"
                + "4: Multiplying Two Matrices");
        System.out.println("Your choice: ");
        choice = decision(input);

        //Gets dimension of Matrix 1
        System.out.println("How many rows: ");
        r = Integer.parseInt(input.nextLine());
        System.out.println("How many columns: ");
        c = Integer.parseInt(input.nextLine());

        //PROCESSING
        //Creates random matrix
        data = generateMatrix(r, c);

        switch (choice) {
            //Tranposes matrix
            case 2:
                result = generateTranspose(data);
                break;
            //Multiplies matrix by constant
            case 3:
                //Get constant from user
                System.out.println("What do you want to multiply the matrix by: ");
                constant = Integer.parseInt(input.nextLine());

                result = multiplyMatrixByConstant(data, constant);
                break;
            //Multiplies matrix by matrix
            case 4:
                //Creates the second matrix
                System.out.println("How many rows in the second matrix: ");
                r2 = Integer.parseInt(input.nextLine());
                System.out.println("How many columns in the second matrix: ");
                c2 = Integer.parseInt(input.nextLine());
                data2 = generateMatrix(r2, c2);

                result = multiplyMatrices(data, data2);
                break;
            //Prints random matrix
            default:
                printArray(data, largestLength(data));
                break;
        }
    }

    //INPUT W/ ERROR CHECKING FOR INITIAL CHOICE
    public static int decision(Scanner input) {
        //Variables
        int n = 0;
        boolean valid;

        //Loops while invalid input
        do {
            //Gets input and check if it's within valid range
            try {
                n = Integer.parseInt(input.nextLine());
                if ((n < 1 || n > 4)) {
                    System.out.println("Invalid input");
                    valid = false;
                } else {
                    valid = true;
                }
                //Catch if input is wrong data type
            } catch (NumberFormatException e) {
                valid = false;
                System.out.println("Invalid input");
            }
        } while (!valid);
        return n;
    }

    //DISPLAYS THE MATRIX
    public static void printArray(int[][] data, int length) {
        //Displays each value of the matrix
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                System.out.format("%" + length + "s", data1[j]);
            }
            System.out.println("");
        }
    }

    //FINDS THE LARGEST LENGTH
    public static int largestLength(int[][] data) {
        //Variables
        int longest = 0;

        //Compares all the numbers of the matrix and stores the longest string length
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                if (Integer.toString(data1[j]).length() > longest) {
                    longest = Integer.toString(data1[j]).length();
                }
            }
        }
        return longest + 1;
    }

    //GENERATES A MATRIX WITH RANDOM VALUES
    public static int[][] generateMatrix(int r, int c) {
        //Checks if valid input
        if (r < 1 || c < 1) {
            System.out.println("ERROR_1");
            return null;
        } //Generates random value 0-9 and stores it in the array
        else {
            int[][] data = new int[r][c];
            for (int[] data1 : data) {
                for (int j = 0; j < data1.length; j++) {
                    data1[j] = (int) (Math.random() * 10);
                }
            }
            return data;
        }
    }

    //TRANPOSES THE MATRIX
    public static int[][] generateTranspose(int[][] data) {
        //Checks if valid input
        if (data == null) {
            System.out.println("ERROR_2");
            return null;
        } else {
            //Creates the size of tranpose matrix
            int[][] transpose = new int[data[0].length][data.length];

            //Tranposes the Matrix
            for (int i = 0; i < transpose.length; i++) {
                for (int j = 0; j < transpose[i].length; j++) {
                    transpose[i][j] = data[j][i];
                }
            }
            //Print and return matrix
            printArray(transpose, largestLength(transpose));
            return transpose;
        }
    }

    //MULTIPLIES MATRIX BY CONSTANT
    public static int[][] multiplyMatrixByConstant(int[][] data, int n) {
        //Checks if valid input
        if (data == null) {
            System.out.println("ERROR_3");
            return null;
        } else {
            //Variables
            int[][] multiply = new int[data.length][data[0].length];

            //<ultiplies values by constant
            for (int[] multiply1 : multiply) {
                for (int j = 0; j < multiply1.length; j++) {
                    multiply1[j] = multiply1[j] * n;
                }
            }
            //Print and return matrix
            printArray(multiply, largestLength(multiply));
            return multiply;
        }
    }

    //MULTIPLIES MATRIX BY MATRIX
    public static int[][] multiplyMatrices(int[][] data, int[][] data2) {
        //Checks id valid input
        // add data.length != data2[0].length &&  to second bracket if (AxB)(CxA) is valid
        if ((data == null || data2 == null) || (data[0].length != data2.length)) {
            System.out.println("ERROR_4");
            return null;
        } else {
            //Variables
            //add temp if (AxB)(CxA) is valid
            int[][] product; //temp;

            //Creates size of prouct matrix
            // uncomment if else, if (AxB)(CxA) is valid
//            if (data[0].length == data2.length) {
            product = new int[data.length][data2[0].length];
//            } else {
//                product = new int[data2.length][data[0].length];
//                temp = data;
//                data = data2;
//                data2 = temp;
//            }

            //Multiplies matrix by matrix
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data2[0].length; j++) {
                    for (int k = 0; k < data[i].length; k++) {
                        product[i][j] += data[i][k] * data2[k][j];
                    }
                }
            }
            //Print and return matrix
            printArray(product, largestLength(product));
            return product;
        }
    }
}
