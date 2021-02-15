/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u3;

/**
 *
 * @author nwu10
 */
public class Euclid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcd(5, 10));
    }

    public static int gcd(int m, int n) {
        if (m == n) {
            return m;
        }
        if (m > n) {
            return gcd(n, m - n);
        }
        return gcd(n, m);
    }

}
