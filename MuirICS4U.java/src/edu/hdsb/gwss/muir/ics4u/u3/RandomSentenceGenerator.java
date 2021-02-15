/*
 * Random Sentence Generator
 *
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 */
public class RandomSentenceGenerator {

    public static void main( String[] args ) throws Exception {

        // FILE LIST
        ArrayList<String> fileList = listFilesInFolder( FILE_PATH );

        // GRAMMAR FILE - 6th - Extension Request
        File grammarFile = new File( FILE_PATH + fileList.get( 6 ) );

        // DATA TYPE FOR ASSIGNMENT
        // HashMap - KEY: <tag>    VALUES: ArrayList of Lines for that tag.
        HashMap<String, ArrayList<String>> grammar = new HashMap<>();           

        // SCANNER for the GRAMMER FILE
        Scanner input = new Scanner( grammarFile );

        // FIRST LINE IN FILE
        while( input.hasNextLine() ) {
            
            
            
            
            
        }


    }
    
    

    /**
     * RETURN THE NEXT LINE that has useful data.
     *
     * @return the next line, or NULL if there is no useful data.
     */
    public static String nextLine( Scanner input ) {

        String s = null;
        boolean complete = false;

        while( !complete ) {
            if( input.hasNextLine() ) {
                s = input.nextLine();
                if( s.trim().length() > 0 ) {
                    complete = true;
                }
            } else {
                complete = true;
            }
        }

        if( s != null && s.length() == 0 ) {
            s = null;
        }

        return s;

    }

    /**
     * NO NEED TO UNDERSTAND BELOW
     */
    public static ArrayList<String> listFilesInFolder( String path ) {

        // DATA FOLDER
        File folder = new File( path );

        // FILE LISTING
        ArrayList<String> fileList = new ArrayList<>();

        // LOAD GRAMMAR FILES
        for( final File fileEntry : folder.listFiles() ) {
            fileList.add( fileEntry.getName() );
        }

        // SORT
        Collections.sort( fileList );

        return fileList;

    }

    // CLASS CONSTANTS
    private static final String FS = File.separator;
    private static final String FILE_PATH = "." + FS + "data" + FS + "random.sentence.generator" + FS;

}
