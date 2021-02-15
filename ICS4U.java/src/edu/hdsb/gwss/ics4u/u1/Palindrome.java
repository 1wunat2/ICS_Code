/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author nwu10
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reverse = "";
        
        System.out.println("Input a word: ");
        String word = input.nextLine().toLowerCase().replaceAll(" ", "");
        int length = word.length();
        char[] letters = new char[length];
        
        for(int i = 0; i < length; i++){
            letters[i] = word.charAt(i);
        }
        
        for(int i = length-1; i >= 0; i--){
            reverse = reverse + letters[i];
        }
        
        boolean equal = word.equals(reverse);

        if(equal){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println(word+" is not a palindrome");
        }
    }
    
}