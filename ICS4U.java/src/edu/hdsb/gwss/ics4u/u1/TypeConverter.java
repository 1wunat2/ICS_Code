/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u1;

/**
 *
 * @author nwu10
 */
public class TypeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        booleanToInt();
    }
    public static void booleanToInt(){
        boolean b = true;
        long val = b? 1:2;
        System.out.println(val);
    }
}
