/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import javax.swing.*;

/**
 * Palindrome Part 3
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D2_Palindrome3 {

    public static void main( String[] args ) {

        //get the word from the user
        String word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase(do not include a punctuation mark):" );

        // GET RID OF SPACES
        word = word.replaceAll( " ", "" );
        
        // CALL YOUR METHOD
        if( D2_Palindrome1.isaPalidrome( word ) ) {
            JOptionPane.showMessageDialog( null, word + " IS a palindrome." );
        } else {
            JOptionPane.showMessageDialog( null, word + " IS NOT a palindrome." );
        }
    }
}