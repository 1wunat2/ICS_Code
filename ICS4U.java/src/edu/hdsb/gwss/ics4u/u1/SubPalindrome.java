/*
 * Name: Nathan Wu
 * Date: Sep. 19 2020
 * Version: v.1.0
 * Description:
            The program determines the largest palindrome in a word/scentence, ignoring capital letters and spaces.
 */
package edu.hdsb.gwss.ics4u.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nwu10
 */
public class SubPalindrome {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variables
        String word; //reverse;
        int length, index1, index2, n, ind1, ind2;
        boolean isPalindrome;
        ArrayList<String> pal = new ArrayList<>();

        //objects
        Scanner input = new Scanner(new File("DATA20.txt"));

        //splash page
        System.out.println("This program finds the largest palindrome in a word/scentence, ignoring spaces.");
        System.out.println("It will print out its length and all the palindromes of that length");

        //loops through every line in the file
        while (input.hasNextLine()) {
            //rest variables
            pal.clear();
            isPalindrome = false;
            word = input.nextLine().toLowerCase().replaceAll(" ", "");
            length = word.length();
            n = 1;

            if (length > 1) {
                while (!isPalindrome && length - n > 0) {
                    //reset/update variables
                    index1 = 0;
                    index2 = word.length() - n;
                    ind1 = index1;
                    ind2 = index2;

                    //check each sequence of length-n
                    for (int i = 0; i < n; i++) {
                        //compar characters
                        if (word.charAt(index1) == word.charAt(index2)) {
                            do {
                                index1++;
                                index2--;
                                isPalindrome = word.charAt(index1) == word.charAt(index2);
                            } while (isPalindrome && (index2 - index1) > 0);

                            //add new word
                            if (isPalindrome) {
                                pal.add(word.substring(ind1, ind2 + 1));
                            }
                        }
                        //update variables
                        index1 = ++ind1;
                        index2 = ++ind2;
                    }
                    n++;
                }
                //print results
                printResponse(pal);
            } else if (length == 1) {
                System.out.print("Palindrome length is 1: " + word);
            } else {
                System.out.print("No palindrome");
            }

            //moves to the next line for next word
            System.out.print("\n");
        }
    }

    //prints the SubPalindrome and the length
    public static void printResponse(ArrayList<String> pal) {
        if (pal.size() > 0) {
            System.out.print("Palindrome length is " + pal.get(0).length() + ":");
            for (int i = 0; i < pal.size(); i++) {
                System.out.print(" " + pal.get(i));
            }
        } else {
            System.out.print("Palindrome length is 1");
        }
    }

}
