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
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String normal, word;
        char changed;
        String newWord = "";
        int num;

        System.out.println("Press 1 to encrypt\nPress 2 to decrypt");
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("Enter amount of rotations (1-25): ");
        int rotations = Integer.parseInt(input.nextLine());
        System.out.println("What is the message?");
        normal = input.nextLine();
        StringTokenizer str = new StringTokenizer(normal);
        
        for (int i = 0; i < str.countTokens(); i++) {
            word = str.nextToken();
            for (int j = 0; j < word.length(); j++) {
                num = (int) word.charAt(j) + rotations;
                
                if(num > 122 || (num > 90 && word.charAt(j) < 91)){
                    num -= 26;
                }
                changed = (char) num;
                newWord += changed;
            }
            newWord += " ";
        }
        System.out.println(newWord.trim());
    }

}
