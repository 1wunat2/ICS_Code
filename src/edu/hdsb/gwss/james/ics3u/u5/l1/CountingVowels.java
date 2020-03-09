/*
 * Name: James Tang
 * Date: Nov 8, 2019
 * Version: v0.1
 * Description: Counts the number of vowels
 */
package edu.hdsb.gwss.james.ics3u.u5.l1;

/**
 * @author James Tang
 */
import java.util.Scanner;

public class CountingVowels {

    public static void main(String[] args) {
        //Object
        Scanner input = new Scanner(System.in);

        //Variables
        String txt;
        int numberOfVowels = 0;

        //Splash Screen
        System.out.println("Count Vowels\n"
                + "\n"
                + "The Program counts the number of vowels in a sentence.");

        //Input
        System.out.print("Enter a Sentence: ");
        txt = input.nextLine();

        //Processing
        txt = txt.toLowerCase();

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {

                numberOfVowels++;
            }
        }

        //Output
        System.out.println("There are " + numberOfVowels + " vowels in the sentence");

    }

}
