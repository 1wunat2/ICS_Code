/*
 * ICS4U.2020.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u3;

/**
 * Binary Search; Recursive Algorithm
 *
 * @author Wm.Muir
 * @version ICS4U.2020.Q1
 */
public class D3_BinarySearch {

    public static void main( String[] args ) {
       
        int[] data = {
            0, 11, 12, 23, 34, 45, 56, 57, 68, 79, 110, 111, 112
        };
        
        boolean passed = true;
        for( int i = 0; i < data.length; i++ ) {
            
            // MUST BE FOUND!
            if( i != binarySearch( data, data[i] ) ) passed = false;
            
        }
        System.out.println( "Test Cases Passed? " + passed );
        
    }
    
    /**
     * PUBLIC METHOD; USERS
     */
    public static int binarySearch( int[] data, int searchValue ) {
            return binarySearch( data, searchValue, 0, data.length-1 );
    }
    
    /**
     * PRIVATE METHOD; DEVELOPER
     */
    public static int binarySearch( int[] data, int searchValue, int L, int R ) {
        
        // BASE CASE / ERROR CHECKING - Not Found (-1)
        if( data == null || L > R ) return -1;
        
        int mid = (L+R)/2;
        
        // FOUND IT!
        if( data[mid] == searchValue ) return mid;
        
        // NOT FOUND, LEFT SIDE HALF?
        if( data[mid] > searchValue ) return binarySearch( data, searchValue, L, mid-1 );
        
        // NOT FOUND, MUST BE ON THE RIGHT
        return binarySearch( data, searchValue, mid+1, R ); 
        
        
    }
    
}
