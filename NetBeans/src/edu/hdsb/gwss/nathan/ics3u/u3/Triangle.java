
import java.util.Scanner;

/*
Name:Nathan Wu
Date:3/25/2019
Version:1.0
Description:
    The program determines if the shape is a traingle using the 3 sides and also
    tells if it is a right angle triangle if applicable.
 */
/**
 *
 * @author 1wunat2
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        double side1, side2, side3, min1, min2, max1, max2;

        //objects
        Scanner input = new Scanner(System.in);

        //Splash Screen
        System.out.println("Triangle");
        System.out.println("----------");
        System.out.println("This program whether the figure is a triangle or"
                + " not based on the length of three sides.\n*Make sure that "
                + "all the side lengths are in the same unit.\n");

        //input
        System.out.println("What is the length of your first side?");
        side1 = input.nextDouble();
        System.out.println("What is the length of your second side?");
        side2 = input.nextDouble();
        System.out.println("What is the length of your third side?");
        side3 = input.nextDouble();

        //processing
        //determining the 2 biggest and smallest side lengths
        min1 = Math.min(side1, side2);
        max1 = Math.max(side1, side2);
        min2 = Math.min(max1, side3);
        max2 = Math.max(max1, side3);

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid side lengths");
        } else if (min1 + min2 > max2) {
            if (min1 * min1 + min2 * min2 == max2 * max2) {
                System.out.println("The shape is a right angle triangle");
            }
            System.out.println("The shape is a triangle");
        } else {
            System.out.println("The shape is not a triangle");
        }
    }

}
