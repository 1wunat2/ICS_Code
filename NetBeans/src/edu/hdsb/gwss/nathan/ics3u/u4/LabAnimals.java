/*
Name:Nathan
Date:4/3/2019
Version:1.0
Description:
    This program calculates how long it will take for the animals to outgrow the
    food supply in hours.
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SPLASH SCREEN
        System.out.println("Lab Animals\n");
        System.out.println("At present there are X animals in the lab and enough"
                + " food for Y animals.  At the end of every hour the population"
                + " doubles, and enough food is added to support Z more animals."
                + " During any hour the animals will eat enough food for only "
                + "themselves. The program will determine when the population "
                + "will outgrow the food supply.\n");
        
        //variables
        int hour = 0, population, supply, add, endPopulation, endSupply;

        //objects
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the intial population (x).");
            population = input.nextInt();
        } while (population < 1);

        do {
            System.out.println("Enter the initial food supply (y).");
            supply = input.nextInt();
        } while (supply <= 0);

        do {
            System.out.println("Enter the amount of food to add each hour.");
            add = input.nextInt();
        } while (add <= 0);

        System.out.format("%-5s | %-17s | %-15s | %-15s | %-15s\n",
                "Hour", "Animals at start", "Food at start", "Food at end", "Animals at end");
        do {
            hour++;
            endPopulation = population * 2;
            endSupply = supply + add - population;
            System.out.format("%-5d | %-17d | %-15d | %-15d | %-15d\n",
                    hour, population, supply, endSupply, endPopulation);
            supply = endSupply;
            population = endPopulation;
        } while (supply > population);

        System.out.println("\nThe population will outgrow the food supply after"
                + " " + hour + " hours with " + population + " animals");
    }

}
