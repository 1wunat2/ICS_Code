/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import java.util.StringTokenizer;
import javax.swing.*;

/**
 * Palindrome Part 2
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D2_Palindrome2 {

    public static void main( String[] args ) {
        
        int palidromeCount = 0;
        String sentence, word;
        String palidromeList = "";
        

        // GET SENTENCE TO TEST
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if the words are palindromes.\n\n"
                + "Enter a sentence(do not include a punctuation mark):" );
        sentence += " ";

        // SPLIT SENTENCE into WORDS
        StringTokenizer st  = new StringTokenizer( sentence );
        while( st.hasMoreTokens() ) {
        
            word = st.nextToken();
            
            if( D2_Palindrome1.isaPalidrome( word ) ) {
                palidromeCount++;
                palidromeList = palidromeList + word + ", ";
            }
            
        }

        JOptionPane.showMessageDialog( null, "There are " + palidromeCount + " palindromes in the sentence." );

        // REMOVE THE last comma-space
        if( palidromeCount > 0 ) {
            //take off the last 2 characters because there is an extra ", "
            JOptionPane.showMessageDialog( null, "The palindromes are:\n"
                    + palidromeList.substring( 0, palidromeList.length() - 2 ) );
        }
    }
}
