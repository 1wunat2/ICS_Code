/*
 * Name: James Tang
 * Date: Oct 8, 2019
 * Version: v0.3
 * Description: Finds out whether or not the inputted values can be a triangle or not
 */
package edu.hdsb.gwss.james.ics3u.u3.Assignment;

/**
 *
 * @author James Tang
 */
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        //Object
        Scanner input = new Scanner(System.in);

        //Variables
        double a, b, c, max, min, mid;

        //Splash Screen
        System.out.println("Three numbers represent the side lengths of a triangle when the sum of any two sides is greater than the third side.");
        System.out.println("A right-angled triangle has the property that when the values of the lengths of the sides are squared, the sum of two smaller values is equal to the larger value.");
        System.out.println("This program has the user enter three lengths of sides and determines whether the figure is a triangle or not.  If a triangle can be formed, it will determine if it is a right-triangle.");

        //Input
        System.out.print("Enter Length of Side 1: ");
        a = input.nextDouble();
        System.out.print("Enter Length of Side 2: ");
        b = input.nextDouble();
        System.out.print("Enter Length of Side 3: ");
        c = input.nextDouble();

        //Processing
        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);
        mid = a + b + c - max - min;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("INVALID");
        } else if ((min + mid) <= max) {
            System.out.print("Not a triangle, Not a right triangle");

        } else if (Math.pow(min, 2) + Math.pow(mid, 2) != Math.pow(max, 2)) {
            System.out.print("Yes a triangle, Not a right tirangle");

        } else {
            System.out.print("Yes a triangle, Yes a right triangle");
        }
    }}
