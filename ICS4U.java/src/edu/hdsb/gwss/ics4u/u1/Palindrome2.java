/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a word or scentence: ");
        String scentence = input.nextLine().toLowerCase();
        StringTokenizer str = new StringTokenizer(scentence);

        if (str.countTokens() > 1) {
            checkWords(str);
        }
        checkScentence(scentence);
        
    }

    public static void checkScentence(String scentence) {
        //setting up all the variables to reverse the scentence
        String reverse = "";
        String noSpace = scentence.replaceAll(" ", "");
        int length = noSpace.length();
        char[] letters = new char[length];

        //reverse the scentence
        for (int i = 0; i < length; i++) {
            letters[i] = noSpace.charAt(i);
        }
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + letters[i];
        }

        //check if is palindrome
        boolean equal = noSpace.equals(reverse);

        //print results
        if (equal) {
            System.out.println(scentence + " is a palindrome");
        } else {
            System.out.println(scentence + " is not a palindrome");
        }
    }

    public static void checkWords(StringTokenizer str) {
        //Variables for the scentence
        String reverse = "";

        int num = str.countTokens();
        String[] words = new String[num];

        for (int i = 0; i < num; i++) {
            //Variables for the word 
            words[i] = str.nextToken();
            int length = words[i].length();
            char[] letters = new char[length];

            //Reverse word
            for (int j = 0; j < length; j++) {
                letters[j] = words[i].charAt(j);
            }
            for (int j = length - 1; j >= 0; j--) {
                reverse = reverse + letters[j];
            }

            //check if is palindrome
            boolean equal = words[i].equals(reverse);

            //print results
            if (equal) {
                System.out.println(words[i] + " is a palindrome");
            }
        }
    }
}
