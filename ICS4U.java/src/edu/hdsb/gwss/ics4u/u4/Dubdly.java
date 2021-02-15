/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4;

/**
 *
 * @author nwu10
 */
public class Dubdly extends Master {

    //VARIABLES
    private final static int MAXVALUE = 59;

    //CONSTRUCTOR
    public Dubdly() {
        super();
        maxValue = MAXVALUE;
        System.out.println("dubdly()");
    }

    //OPERATIONS
    @Override
    public String toString() {
        return "Dubdly{" + "maxValue=" + maxValue + ", numValues=" + numValues + ", open=" + open + ", numInvalid=" + numInvalid + ", active=" + active + ", primaryKey=" + primaryKey + ", fetchCombo=" + fetchCombo + '}';
    }
}
