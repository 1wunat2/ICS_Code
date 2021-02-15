/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u6;

/**
 *
 * @author nwu10
 */
public class IfStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (b > a) {
            System.out.println("a<b");
        } else if (a == b) {
            System.out.println("a=b");
        } else {
            System.out.println("a>b");
        }
    }

}
