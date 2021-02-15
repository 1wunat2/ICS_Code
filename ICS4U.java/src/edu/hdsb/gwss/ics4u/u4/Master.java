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
public class Master extends Locks implements NonConfigurableInterface {

    //VARIABLES
    private final static int NUMVALUES = 3, MAXVALUE = 39;
    protected int fetchCombo;

    //CONSTRUCTOR
    public Master() {
        super();
        numValues = NUMVALUES;
        maxValue = MAXVALUE;
        active = true;
        setCombo();
        System.out.println("master()");
    }

    //SETTER
    private void setCombo() {
        for (int i = 0; i < numValues; i++) {
            this.combo = this.combo + " " + (int) (Math.random() * maxValue);
        }
        this.combo = this.combo.trim().replaceAll(" ", "-");
        System.out.println("Combo set");
    }

    //GETTER
    @Override
    public int getNumOfValues() {
        return numValues;
    }

    @Override
    public String getCombo() {
        if (active && open && fetchCombo == 0) {
            fetchCombo++;
            return combo;
        } else {
            return "*****";
        }
    }

    //OPERATIONS
    @Override
    public void open(int n1, int n2, int n3) {
        int[] n = {n1, n2, n3};
        super.open(n);
    }

    @Override
    public String toString() {
        return "Master" + super.toString() + ", fetchCombo=" + fetchCombo + '}';
    }
}
