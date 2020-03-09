/*
 * Name: James Tang
 * Date: Nov 15, 2019
 * Version: v0.1
 * Description: Detects if the pattern is the same
 */
package edu.hdsb.gwss.james.ics3u.u5.Assignment;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author James Tang
 */
public class PatternMatching {

    public static void main(String[] args) throws IOException {

        //Variables
        String str, word1, word2;
        int length1, length2, i = 0, length;
        boolean check = false;
        char letter1, letter2;

        //File
        File file = new File("DATA21.txt");
        File fileOut = new File("Data21Out.txt");
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(fileOut);

        //Processing
        while (input.hasNextLine()) {
            str = input.nextLine();
            str = str.toLowerCase();

            //Tokenizes 'Str'
            StringTokenizer st = new StringTokenizer(str);
            word1 = st.nextToken();
            word2 = st.nextToken();

            length1 = word1.length();
            length2 = word2.length();
            length = word1.length() - 1;

            do {

                //Check for Same length
                if (length1 == length2) {
                    letter1 = word1.charAt(i);
                    letter2 = word2.charAt(i);

                    //Checking if they are both vowels
                    if ((letter1 == 'a' || letter1 == 'e' || letter1 == 'i' || letter1 == 'o' || letter1 == 'u')
                            && (letter2 == 'a' || letter2 == 'e' || letter2 == 'i' || letter2 == 'o' || letter2 == 'u')) {
                        check = true;

                        //Checking if they are both consonants	
                    } else if ((letter1 != 'a' && letter1 != 'e' && letter1 != 'i' && letter1 != 'o' && letter1 != 'u')
                            && (letter2 != 'a' && letter2 != 'e' && letter2 != 'i' && letter2 != 'o' && letter2 != 'u')) {
                        check = true;
                    } else {
                        check = false;
                    }
                } else {
                    check = false;
                }
                i++;
            } while (check && i <= length);
			
			//Output
            if (check) {
                output.println("Same");
            } else {
               output.println("Different");
            }

            //reset 'i'
            i = 0;
        }
        output.close();
		input.close();
    }
}
