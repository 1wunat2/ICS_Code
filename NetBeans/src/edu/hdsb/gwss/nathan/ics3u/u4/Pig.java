/*
Name:Nathan
Date:4/9/2019
Version:0.01
Description:
    This program is a game versus the computer. You roll a dix as many times as 
    you would like per turn, your points add up. The first one to 100 win, but be 
    carefull if you roll a one the you lose all your points of that turn and your 
    turn ends.
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class Pig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DO NOT FORGET SPLASH SCREEN 
        System.out.println("Pig\n");
        System.out.println("It is you versus the computer. You roll a die as "
                + "many times as you would like per turn, your points add up.\n "
                + "The first one to 100 win, but be carefull if you roll a one "
                + "the you lose all your points of that turn and your turn ends.\n");

        Scanner input = new Scanner(System.in);
        //variable
        int turn, total1 = 0, total2 = 0, roll, point, add = 0, attempt = 0, again, display;

        do {
            for (turn = 1, total1 = 0, total2 = 0; total1 < 100 && total2 < 100; turn++) {
                //persons turn
                add = 0;
                System.out.println("\nYour turn");

                do {
                    System.out.println("press 0 to roll");
                    roll = input.nextInt();
                } while (roll != 0);

                do {
                    point = (int) (Math.random() * 6) + 1;
                    System.out.println("you rolled " + point);

                    display = total1 + add;
                    if (point != 1 && display < 100) {
                        do {
                            add = add + point;
                            display = total1 + add;
                            System.out.println("You are at " + display + " points");
                            System.out.println("Press 0 if you would like to go again. "
                                    + "Press 2 if you would like to end your turn");
                            roll = input.nextInt();
                        } while (roll != 0 && roll != 2);
                    } else {
                        System.out.println("your turn is over");
                        add = 0;
                    }

                } while (roll == 0 && point != 1);
                total1 = total1 + add;
                System.out.println("You have " + total1 + " points");

                //computers turn
                add = 0;
                attempt = 0;
                System.out.println("\nComputers turn");

                roll = (int) (Math.random() * 8) + 3;
                do {
                    point = (int) (Math.random() * 6) + 1;
                    System.out.println("the computer rolled " + point);
                    attempt++;
                    if (point != 1) {
                        add = point + add;
                    } else {
                        add = 0;
                    }
                } while (point != 1 && attempt <= roll);
                total2 = total2 + add;
                System.out.println("The computer has " + total2 + " points");

            }
            if (total1 >= 100) {
                System.out.println("\nYOU WIN");
            } else {
                System.out.println("\nYOU LOSE");
            }

            do{
            System.out.println("Press 0 if you would again. Press any other number"
                    + " if not.");
            again = input.nextInt();
            }while(again < 0);
        } while (again == 0);
    }
}
