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
public class MasterU extends Locks implements MasterUInterface {

    //VARIABLES
    private final static int NUMVALUES = 4, MAXVALUE = 9;

    //CONSTRUCTOR
    public MasterU() {
        super();
        numValues = NUMVALUES;
        maxValue = MAXVALUE;
        active = false;
        System.out.println("masterU()");
    }

    public MasterU(int n1, int n2, int n3, int n4) {
        super();
        numValues = NUMVALUES;
        maxValue = MAXVALUE;
        active = true;
        setCombo(n1, n2, n3, n4);
        System.out.println("masterU(4)");
    }

    //SETTER
    @Override
    public void setCombo(int n1, int n2, int n3, int n4) {
        System.out.println("mu.setcombo");
        if (!open && (n1 > 0 && n1 < maxValue && n2 > 0 && n2 < maxValue && n3 > 0 && n3 < maxValue && n4 > 0 && n4 < maxValue)) {
            combo = n1 + "-" + n2 + "-" + n3 + "-" + n4;
            System.out.println("Combo set");
        } else {
            System.out.println("Combo not set");
        }
    }

    //OPERATIONS
    @Override
    public void open(int n1, int n2, int n3, int n4) {
        System.out.println("mu.open");
        int[] n = {n1, n2, n3, n4};
        super.open(n);
    }
}
