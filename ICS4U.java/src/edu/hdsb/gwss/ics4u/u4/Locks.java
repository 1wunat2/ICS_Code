/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4;

import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public abstract class Locks implements LocksInterface {

    //CLASS VARIABLES
    protected static int counter = 0;

    //INSTANCE VARIABLES
    protected int maxValue;
    protected int numValues;
    protected boolean open;
    protected int numInvalid;
    protected boolean active;
    protected final int primaryKey;
    protected String combo;

    //CONSTRUCTOR
    public Locks() {
        counter++;
        primaryKey = counter;
        combo = "";
        open = true;
        System.out.println("Locks()");
    }

    //PRINT THE LOCK
    @Override
    public String toString() {
        return "{" + "maxValue=" + maxValue + ", numValues=" + numValues + ", open=" + open + ", numInvalid=" + numInvalid + ", active=" + active + ", primaryKey=" + primaryKey;
    }

    //CHECK IF LOCK IS OPEN
    @Override
    public boolean isOpen() {
        System.out.println("isOpen");
        return open;
    }

    //GET MAX VALUE OF LOCK
    @Override
    public int getMaxValue() {
        System.out.println("getMax");
        return maxValue;
    }

    //GET PRIMARY KEY OF LOCK
    @Override
    public int getPrimaryKey() {
        System.out.println("getKey");
        return this.primaryKey;
    }

    //GET NUM OF INVALID ATTEMPTS TO OPEN
    @Override
    public int getNumInvalid() {
        System.out.println("numInvalid");
        return numInvalid;
    }

    //GET NUMS OF VALUES IN PASSCODE
    @Override
    public int getNumOfValues() {
        System.out.println("numVal");
        return numValues;
    }

    //CLOSE THE LOCK
    @Override
    public void close() {
        if (!open && active) {
            System.out.println("Already closed");
        } else {
            open = false;
        }
    }

    //CHECK IF YOU'RE LOCKED OUT
    @Override
    public boolean lockedOut() {
        System.out.println("lockedout?");
        return numInvalid > 2;
    }

    //OPEN THE LOCK
    protected void open(int[] n) {
        //ERROR CHECKING
        if (!open || !active || !combo.equals("")) {
            if (!lockedOut()) {
                //INITIALIZE VARIABLES
                int i = 0;
                boolean valid;
                StringTokenizer str = new StringTokenizer(combo, "-");
                do {
                    //COMPARE TO SEE IF PASSED VALUES ARE SAME AS PASSED
                    valid = Integer.parseInt(str.nextToken()) == n[i];
                    i++;
                } while (valid && i < numValues);
                if (!valid) {
                    //INVALID MESSAGE
                    System.out.print("Wrong password ");
                    numInvalid++;
                }
                if (valid) {
                    open = valid;
                    numInvalid = 0;
                }
            } else {
                //INVALID MESSAGE
                System.out.println("You got the the password wrong too many time, locked out");
            }
        } else {
            //INVALID MESSAGE
            System.out.println("Already open or currently not active");
        }
    }

    //EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            System.out.println("null");
            return false;
        }
        if (getClass() != obj.getClass()) {
            System.out.println("class");
            return false;
        }
        final Locks other = (Locks) obj;
        if (this.primaryKey != other.primaryKey) {
            System.out.println("key");
            return false;
        }
        System.out.println("same");
        return true;
    }

}
