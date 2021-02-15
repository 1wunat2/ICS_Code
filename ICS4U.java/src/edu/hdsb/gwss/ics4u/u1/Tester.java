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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String e = "vvfd .vfevfvfd .", sequence = " .";
        String s1 =e.substring(0, e.indexOf(" .")+2).replace(sequence, sequence.substring(1));
        String s2 =e.substring(e.indexOf(" .") + 2);
        e =  s1 + s2;
        System.out.println(e);
    }
}
