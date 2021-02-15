
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1tangjam
 */
public class day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES - you might use
        char[] sentence;
        String dirToShift;
        int numShift;
        int shifted;
        int numShiftSave;
        // OBJECTS - you might use
        Scanner input = new Scanner(System.in);

        // INPUT
        System.err.print("Please Enter String to ENCRYPT: ");
        sentence = input.nextLine().toCharArray();
        System.err.print("Shift Direction  : ");
        dirToShift = input.nextLine();
        System.err.print("Number Of Shifts : ");
        numShift = input.nextInt();
       
		numShiftSave = numShift;
        if (numShift < 0) {
            numShift = Math.abs(numShift);
            if (dirToShift.equals("RIGHT")) {
                dirToShift = "LEFT";
            } else {
                dirToShift = "RIGHT";
            }
        }
        for (int i = 0; i < sentence.length; i++) {
            numShift = numShiftSave;
            if (Character.isUpperCase(sentence[i])) {
                while (numShift > 26) {
                    numShift = numShift - 26;
                }
                if (dirToShift.equals("RIGHT")) {
                    shifted = (int) sentence[i] + numShift;
                    if (shifted > 90) {
                        shifted = shifted - 26;
                        sentence[i] = (char) shifted;
                    } else {
                        sentence[i] = (char) shifted;
                    }
                } else {
                    shifted = (int) sentence[i] - numShift;
                    if (shifted < 65) {
                        shifted = shifted + 26;
                        sentence[i] = (char) shifted;
                    } else {
                        sentence[i] = (char) shifted;
                    }
                }
            } else if (Character.isLowerCase(sentence[i])) {
                while (numShift > 26) {
                    numShift = numShift - 26;
                }
                if (dirToShift.equals("RIGHT")) {
                    shifted = (int) sentence[i] + numShift;
                    if (shifted > 122) {
                        shifted = shifted - 26;
                        sentence[i] = (char) shifted;
                    } else {
                        sentence[i] = (char) shifted;
                    }
                } else {
                    shifted = (int) sentence[i] - numShift;
                    if (shifted < 97) {

                        shifted = shifted + 26;
                        sentence[i] = (char) shifted;
                    } else {
                        sentence[i] = (char) shifted;
                    }
                } 
            }else if(Character.isDigit(sentence[i])){
                 while (numShift > 10) {
                    numShift = numShift - 10;
                }
                if (dirToShift.equals("RIGHT")) {
                    shifted = (int) sentence[i] + numShift;
                    if (shifted > 57) {
                        shifted = shifted - 10;
                        sentence[i] = (char) shifted;
                    } else {
                        sentence[i] = (char) shifted;
                    }
                } else {
                    shifted = (int) sentence[i] - numShift;
                    if (shifted < 48) {

                        shifted = shifted + 10;
                        sentence[i] = (char) shifted;
                    } else {
                        sentence[i] = (char) shifted;
                    }
                }
            }
        }
        System.out.print(sentence);
    }
}
