/*
Name: Nathan Wu
Date: 5/20/2019
Version: 1.0
Description:
    This program takes your inputed fraction and it into a the whole number or 
    to the reduced fraction
 */
package edu.hdsb.gwss.nathan.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String str = "";
        double numerator = 0, denominator = 0;
        splashScreen();
        input(str, numerator, denominator);
    }

    public static void splashScreen() {
        System.out.println("Reduce Fraction");
        System.out.println("-------------------");
        System.out.println("This program takes your inputed fraction and it into"
                + " a the whole number or to the reduced fraction.");
    }

    public static void input(String str, double numerator, double denominator) throws FileNotFoundException {
        boolean invalid, neg = false;
        File arab = new File("DATA31.txt");
        Scanner input = new Scanner(arab);

        while (input.hasNextLine()) {

            str = input.nextLine();
            str = str.replaceAll(" ", "/");
            StringTokenizer str2 = new StringTokenizer(str, "/");

            try {
                numerator = Integer.parseInt(str2.nextToken());
                denominator = Integer.parseInt(str2.nextToken());
                if (numerator < 0 && denominator < 0) {
                    neg = false;
                } else if (numerator < 0 || denominator < 0) {
                    neg = true;
                } else {
                    neg = false;
                }
                if (numerator < 0) {
                    numerator = numerator - numerator - numerator;
                }
                if (denominator < 0) {
                    denominator = denominator - denominator - denominator;
                }
                invalid = false;
            } catch (Exception e) {
                invalid = true;
                System.out.println("Invalid");
            }
            if (!invalid) {

                gcd(numerator, denominator, neg);
            }
        }
    }

    public static void gcd(double numerator, double denominator, boolean neg) {
        boolean isWhole, gcd = false;
        int reduced = 0, x = 2, smaller = (int) Math.min(numerator, denominator), gcdNumber = 1;

        if ((numerator / denominator) % 1 == 0) {
            reduced = (int) (numerator / denominator);
            isWhole = true;
        } else {
            isWhole = false;
        }
        if (!isWhole) {
            do {
                if (numerator % x == 0) {
                    if (denominator % x == 0) {
                        gcdNumber = x;
                    }
                }
                x++;
            } while (x <= smaller);
        }
        reduce(reduced, isWhole, numerator, denominator, gcdNumber, neg);
    }

    public static void reduce(int reduced, boolean isWhole, double numerator, double denominator, int gcdNumber, boolean neg) {
        //variables
        int n, d;
        String fraction;

        if (denominator == 0) {
            System.out.println("Invalid");
        } else if (isWhole) {
            if (!neg) {
                System.out.println("The reduced form is: " + reduced);
            } else {
                System.out.println("The reduced form is: " + "-" + reduced);
            }
        } else {
            numerator = (int) (numerator / gcdNumber);
            n = (int) numerator;
            denominator = (int) (denominator / gcdNumber);
            d = (int) denominator;
            fraction = n + "/" + d;
            if (!neg) {
                System.out.println("The reduced form is: " + fraction);
            } else if (neg) {
                fraction = "-" + fraction;
                System.out.println("The reduced form is: " + fraction);
            }
        }
    }

}
