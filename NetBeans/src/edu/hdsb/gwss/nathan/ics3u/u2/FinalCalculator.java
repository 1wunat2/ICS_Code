/*
Name:Nathan Wu
Date:3/8/2019
Version:1.0
Description:
    The program is a calculator that caculates either the discriminant,
    vertex or x-intercepts of the users choice for a quadratic.
 */
package edu.hdsb.gwss.nathan.ics3u.u2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class FinalCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //constants
        //objects
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);

        //variable
        double a, b, c, x1_int, x2_int, x_int, x, y, d;
        int firstChoice;

        //splash screen
        System.out.println("Calculator");
        System.out.println("------------------");
        System.out.println("It will calculate the thing "
                + "of your choice for a quadratic using "
                + "your a, b and c value.\n");

        System.out.println("Press 1 if you want to find the x-intercept.\n"
                + "Press 2 if you want to find the vertex.\n"
                + "Press 3 if you want to find the discriminant.");
        firstChoice = input.nextInt();

        if (firstChoice == 1) {
            //input
            System.out.println("What is your \"a\" value?");
            a = input.nextDouble();
            System.out.println("What is your \"b\" value?");
            b = input.nextDouble();
            System.out.println("What is your \"c\" value?");
            c = input.nextDouble();

            //processing
            x_int = b * b - 4 * a * c;

            if (x_int == 0) {
                x1_int = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);

                //output
                System.out.println("Your x-intercept's "
                        + "coordinates is ("
                        + decimal.format(x1_int) + ",0)");
            }
            if (x_int < 0) {

                //output
                System.out.println("There are no x-intercepts.");
            }
            if (x_int > 0) {
                //processing
                x1_int = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
                x2_int = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);

                //output
                System.out.println("Your x-intercepts coordinates are "
                        + "(" + decimal.format(x1_int) + ",0) "
                        + "and (" + decimal.format(x2_int) + ",0)");
            }

        }
        if (firstChoice == 2) {
            //input
            System.out.println("What is your \"a\" value?");
            a = input.nextDouble();
            System.out.println("What is your \"b\" value?");
            b = input.nextDouble();
            System.out.println("What is your \"c\" value?");
            c = input.nextDouble();

            //processing
            x = -b / (2 * a);
            y = a * (x * x) + b * x + c;

            //output
            System.out.println("The vertex is "
                    + "(" + decimal.format(x) + "," + decimal.format(y) + ")");

        }
        if (firstChoice == 3) {
            //input
            System.out.println("What is your \"a\" value?");
            a = input.nextDouble();
            System.out.println("What is your \"b\" value?");
            b = input.nextDouble();
            System.out.println("What is your \"c\" value?");
            c = input.nextDouble();

            //processing
            d = b * b - 4 * a * c;

            //output
            if (d == 0) {
                System.out.println("Your discriminant is 0, "
                        + "you have 1 x-intercepts.");
            }
            if (d > 0) {
                System.out.println("Your discriminant is " + d
                        + ", you have 2 x-intercepts.");
            }
            if (d < 0) {
                System.out.println("Your discriminant is " + d
                        + ", you have no x-intercepts.");
            }
        }
    }
}
