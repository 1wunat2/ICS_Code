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
public class Android extends Locks implements AndroidInterface {

    //VARIABLES
    private final static int NUMVALUES = 3, MAXVALUE = 9;

    //CONSTRUCTOR
    public Android() {
        super();
        numValues = NUMVALUES;
        maxValue = MAXVALUE;
        active = false;
    }

    public Android(int n1, int n2, int n3) {
        super();
        numValues = NUMVALUES;
        maxValue = MAXVALUE;
        active = true;
        setCombo(n1, n2, n3);
    }

    //OPERATIONS
    @Override
    public void setCombo(int n1, int n2, int n3) {
        System.out.println("a.setcombo");
        if (open && (n1 > 0 || n1 < maxValue || n2 > 0 || n2 < maxValue || n3 > 0 || n3 < maxValue)) {
            combo = n1 + "-" + n2 + "-" + n3;
            System.out.println("Combo set");
        } else {
            System.out.println("Combo not set");
        }
    }

    @Override
    public void open(int n1, int n2, int n3) {
        System.out.println("a.open");
        int[] n = {n1, n2, n3};
        super.open(n);
    }

    @Override
    public String toString() {
        return "Android" + super.toString();
    }
}
