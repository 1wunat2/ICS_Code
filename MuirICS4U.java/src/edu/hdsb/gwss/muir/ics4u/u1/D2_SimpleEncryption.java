/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import javax.swing.*;

/**
 * Simple Encryption / Decryption
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D2_SimpleEncryption {

    public static void main(String[] args) {
        String phrase;              //phrase entered by user
        String encryptedPhrase;     //the encrypted phrase
        String rotAmountStr;
        String encOrDecStr;
        int rotationAmount;         //rotation amount
        int pos;                    //loop counter
        int charValue;              //unicode value of character

        phrase = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the\n"
                + "simple encryption method of rotating the letters.\n\n"
                + "Please enter a phrase");

        rotAmountStr = JOptionPane.showInputDialog("Enter the rotation amount (1 - 25)");
        //Convert rotAmountStr to an integer
        rotationAmount = Integer.parseInt(rotAmountStr);

        encOrDecStr = JOptionPane.showInputDialog("1 - Encryption\n2 - Decryption");

        //Convert phrase to uppercase
        phrase = phrase.toUpperCase();

        if (encOrDecStr.equals("1")) {
            //Encryption
            if (rotationAmount >= 1 && rotationAmount <= 25) {
                encryptedPhrase = "";
                for (pos = 0; pos < phrase.length(); pos++) {
                    charValue = (int) phrase.charAt(pos);
                    if (charValue >= 65 && charValue <= 90) {
                        charValue += rotationAmount;
                        if (charValue > 90) {
                            charValue -= 26;
                        }
                    }
                    encryptedPhrase += (char) charValue;
                }
                System.out.println("The original phrase is: " + phrase);
                System.out.println("The encrypted phrase is: " + encryptedPhrase);
            } else {
                //Invalid
                System.out.println("Invalid rotation amount");
            }
        } else if (encOrDecStr.equals("2")) {
            //Decryption
            if (rotationAmount >= 1 && rotationAmount <= 25) {
                encryptedPhrase = "";
                for (pos = 0; pos < phrase.length(); pos++) {
                    charValue = (int) phrase.charAt(pos);
                    if (charValue >= 65 && charValue <= 90) {
                        charValue -= rotationAmount;
                        if (charValue < 65) {
                            charValue += 26;
                        }
                    }
                    encryptedPhrase += (char) charValue;
                }
                System.out.println("The original phrase is: " + phrase);
                System.out.println("The decrypted phrase is: " + encryptedPhrase);
            } else {
                //Invalid
                System.out.println("Invalid rotation amount");
            }
        } else {
            //Invalid selection
            System.out.println("Invalid selection");
        }
    }
}
