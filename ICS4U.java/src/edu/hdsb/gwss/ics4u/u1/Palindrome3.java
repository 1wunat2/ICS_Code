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
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reverse = "";

        System.out.println("Input a word or scentence: ");
        String scentence = input.nextLine().toLowerCase();
        StringTokenizer str = new StringTokenizer(scentence);
        int num = str.countTokens();
        String[] words = new String[num];

        for (int i = 0; i < num; i++) {
            words[i] = str.nextToken();
            int length = words[i].length();
            char[] letters = new char[length];

            for (int j = 0; j < length; j++) {
                letters[j] = words[i].charAt(j);
            }

            for (int j = length - 1; j >= 0; j--) {
                reverse = reverse + letters[j];
            }

            boolean equal = words[i].equals(reverse);

            if (equal) {
                System.out.println(words[i] + " is a palindrome");
            } else {
                System.out.println(words[i] + " is not a palindrome");
            }
        }
    }

}
