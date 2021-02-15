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
public interface LocksInterface {

    public boolean isOpen();

    public int getMaxValue();

    public int getPrimaryKey();

    public int getNumInvalid();

    public int getNumOfValues();

    public boolean lockedOut();

    public void close();

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);
}
