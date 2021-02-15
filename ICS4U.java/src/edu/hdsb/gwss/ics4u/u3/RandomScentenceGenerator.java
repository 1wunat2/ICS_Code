/*
 * Name: Nathan Wu
 * Date: 10/6/2020
 * Version: v1.0
 * Description:
        This project generates a sentence from sentence segments gotten from a file stored in a hashmap
 */
package edu.hdsb.gwss.ics4u.u3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class RandomScentenceGenerator {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // FILE LIST
        ArrayList<String> fileList = listFilesInFolder(FILE_PATH);

        // GRAMMAR FILE - 6th - Extension Request
        File grammarFile = new File(FILE_PATH + fileList.get(6));

        // DATA TYPE FOR ASSIGNMENT, VARIABLES
        HashMap<String, ArrayList<String>> grammar = new HashMap<>();
        StringTokenizer word = null;
        String sentence;

        // SCANNER for the GRAMMAR FILE
        Scanner input = new Scanner(grammarFile);

        //PROCESSING
        //GET AND STORE DATA
        grammar = getData(input, null, "", false);
        //CREATE THE SENTENCE
        sentence = createSentence(grammar, "", true, word).trim();
        //REMOVE THE EXTRA SPACE BETWEEN CERTAIN CHARACTERS
        sentence = removeExtraSpace(sentence);
        //MAKE SENTENCE TO BE ON MULTIPLE LINES IF NEEDED
        sentence = formatSentence(sentence, 79);

        //PRINT FINAL SENTENCE
        System.out.println(sentence);
    }

    //STORES INPUT DATA IN HASHMAP
    public static HashMap getData(Scanner input, HashMap<String, ArrayList<String>> data, String code, boolean valid) {
        //VARIABLES
        String key, line = nextLine(input), segment;
        ArrayList<String> list;
        StringTokenizer str;

        //CREATE HASHMAP
        if (data == null) {
            data = new HashMap<>();
        }

        //CREATE NEW KEY AND LIST FOR HASHMAP
        if (line != null && line.equals("{")) {
            valid = true;
            key = nextLine(input).replaceAll("\t", " ").trim();

            //REMOVES SEMICOLON AND ALL AFTER IF THERE IS ONE FROM THE KEY
            if (key.contains(";")) {
                key = key.substring(0, key.indexOf(";")).trim();
            }

            //CREATE NEW LIST AND STORE IT IN THE HASHMAP
            list = new ArrayList<>();
            data.put(key, list);
            data = getData(input, data, key, valid);
        }

        //END LIST FOR HASHMAP KEY
        if (line != null && line.equals("}") && input.hasNextLine()) {
            valid = false;
            data = getData(input, data, "", valid);
        }

        //STORE LINE IN ARRAYLISTAND PROCEED TO NEXT LINE
        if (line != null && input.hasNextLine() && valid) {

            //GET THE SEGMENT UP TO THE THE SEMICOLON
            segment = line.replaceAll("\t", " ").trim();
            while (!segment.contains(";")) {
                line = nextLine(input).replaceAll("\t", " ");
                segment = segment + " " + line;
            }
            //CLEAN UP ALL THE EXTRA SPACES
            str = new StringTokenizer(segment);
            segment = "";
            while (str.hasMoreTokens()) {
                segment = segment + str.nextToken() + " ";
            }

            //ADD SEGMENT TO HASHMAP
            data.get(code).add(segment.substring(0, segment.indexOf(";")).trim());

            //PROCEED TO NEXT LINE
            data = getData(input, data, code, valid);
        }

        //PROCEED TO NEXT LINE, DO NOT STORE CURRENT LINE IN ARRAYLIST
        if (line != null && input.hasNextLine() && !valid) {
            data = getData(input, data, code, valid);
        }

        //RETURN THE HASHMAP
        return data;
    }

    //CREATES SCENTENCE USING RECURSION, DFS
    public static String createSentence(HashMap<String, ArrayList<String>> data, String sentence, boolean valid, StringTokenizer str) {
        //VARIABLE
        String word, complete, possible, before = "", after = "";

        //STARTS THE SCENTENCE
        if (sentence.equals("")) {
            sentence = data.get("<start>").get(randomNum(data.get("<start>").size()));
        }

        //CREATES NEW STRINGTOKENIZER
        if (valid) {
            str = new StringTokenizer(sentence);
        }

        //STOPS IF THERE ARE NO MORE TOKENS
        if (!str.hasMoreTokens()) {
            return "";
        }
        //ASSIGN TOKEN TO STR
        word = str.nextToken();

        //FIND IF TOKEN IS CONNECTED TO OTHER CHRACTERS
        if (word.contains("<") && word.contains(">")) {
            possible = word.substring(word.indexOf("<"), word.indexOf(">") + 1);
            before = word.substring(0, word.indexOf("<"));
            after = word.substring(word.indexOf(">") + 1);
        } else {
            possible = word;
        }

        //RECURSION BASSED ON IF STR IS A KEY OR NOT
        if (data.containsKey(possible)) {
            complete = before + createSentence(data, data.get(possible).get(randomNum(data.get(possible).size())), true, str) + after;
        } else {
            complete = possible + " " + createSentence(data, sentence, false, str);
        }

        //CONTINUE RECURSION IF THERE ARE MORE TOKENS
        if (str.hasMoreTokens()) {
            complete = complete + createSentence(data, sentence, false, str);
        }

        //RETURN NEW SCENTENCE
        return complete;
    }

    //CALL CODE CLEAN UP WITH ALL THE DIFFERENT SEQUENCES
    public static String removeExtraSpace(String sentence) {
        //CALL CODE CLEANUP
        sentence = cleanUp(sentence, " .");
        sentence = cleanUp(sentence, " ,");
        sentence = cleanUp(sentence, " '");
        sentence = cleanUp(sentence, " !");
        sentence = cleanUp(sentence, " ?");
        sentence = cleanUp(sentence, " :");
        sentence = cleanUp(sentence, " ;");

        //RETURN THE CLEANED UP SENTENCE
        return sentence;
    }

    public static String cleanUp(String sentence, String sequence) {
        //VARIABLES
        String s1, s2;

        //REMOVE THE EXTRA SPACE IF THE SEQUENCE IS IN THE SENTENCE
        if (sentence.contains(sequence)) {
            s1 = sentence.substring(0, sentence.indexOf(sequence) + 2).replace(sequence, sequence.substring(1));
            s2 = sentence.substring(sentence.indexOf(sequence) + 2);
            sentence = s1 + cleanUp(s2, sequence);
        }
        return sentence;
    }

    //FORMATS OUTPUT TO MOVE TO THE NEXT LINE
    public static String formatSentence(String sentence, int index) {
        //DON'T DO ANYTHING IF LENGTH IS LESS THAN 80
        if (sentence.length() < 80) {
            return sentence;
        }

        //REPLACE INDEX WITH \N IF IT'S A SPACE
        if (sentence.substring(index - 1, index).equals(" ")) {
            return sentence.substring(0, index - 1) + "\n" + formatSentence(sentence.substring(index), 79);
        }//PROCEED TO NEXT INDEX IF CHRACTER AT THE INDEX IS NOT A SPACE 
        else {
            return formatSentence(sentence, index - 1);
        }
    }

    //GENERATES A RANDOM INT NUMBER
    public static int randomNum(int n) {
        return (int) (Math.random() * n);
    }

    /**
     * RETURN THE NEXT LINE that has useful data.
     *
     * @param input
     * @return the next line, or NULL if there is no useful data.
     */
    public static String nextLine(Scanner input) {

        String s = null;
        boolean complete = false;

        while (!complete) {
            if (input.hasNextLine()) {
                s = input.nextLine();
                if (s.trim().length() > 0) {
                    complete = true;
                }
            } else {
                complete = true;
            }
        }

        if (s != null && s.length() == 0) {
            s = null;
        }

        return s;

    }

    /**
     * NO NEED TO UNDERSTAND BELOW
     *
     * @param path
     * @return
     */
    public static ArrayList<String> listFilesInFolder(String path) {

        // DATA FOLDER
        File folder = new File(path);

        // FILE LISTING
        ArrayList<String> fileList = new ArrayList<>();

        // LOAD GRAMMAR FILES
        for (final File fileEntry : folder.listFiles()) {
            fileList.add(fileEntry.getName());
        }

        // SORT
        Collections.sort(fileList);

        return fileList;

    }

    // CLASS CONSTANTS
    private static final String FS = File.separator;
    private static final String FILE_PATH = "." + FS + "data" + FS + "random.sentence.generator" + FS;

}
