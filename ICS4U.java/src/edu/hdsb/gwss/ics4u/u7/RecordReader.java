/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u7;

/**
 *
 * @author nwu10
 */
public class RecordReader {
    //VARIABLES
    private static int counter;
    
    //EMPTY
    public RecordReader(){
        
    }
    
    //PRIMARY KEY
    public RecordReader(int id){
        counter++;
        id = counter;
    }
}
