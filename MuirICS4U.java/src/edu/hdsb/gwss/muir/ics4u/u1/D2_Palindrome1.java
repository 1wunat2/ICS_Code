/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import javax.swing.*;

/**
 * Palindrome Part 1
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D2_Palindrome1 {

    public static void main( String[] args ) {

        // GET WORD TO TEST
        String word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a word:" );

        // CALL YOUR METHOD
        if( isaPalidrome( word ) ) {
            JOptionPane.showMessageDialog( null, word + " IS a palindrome." );
        } else {
            JOptionPane.showMessageDialog( null, word + " IS NOT a palindrome." );
        }
    }
    
    public static boolean isaPalidrome( String word ) {
        
        word = word.toUpperCase();
        
        boolean palidrome = true;
        for( int i = 0; i < word.length() / 2; i++ ) {
            if( word.charAt(i) != word.charAt( word.length() - 1 - i ) ) {
                palidrome = false;
                i = word.length();
            }
        }
        return palidrome;
    }
    
}
