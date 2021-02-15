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
public class Pacman {

    //VARIABLES
    private static final int TOTAL_LIVES = 1;
    private int size, xLoc, yLoc, lives;
    private boolean isEating;

    //CONSTRUCTORS
    public Pacman() {
        this(1, 1, 1);
    }

    public Pacman(int xLoc, int yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        lives = TOTAL_LIVES;
        isEating = false;
    }

    public Pacman(int size) {
        this(1, 1);
        this.size = size;
    }

    public Pacman(int size, int xLoc, int yLoc) {
        this.size = size;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        lives = TOTAL_LIVES;
        isEating = false;
    }

    //GETTERS
    public int getSize() {
        return size;
    }

    public int getxLoc() {
        return xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public int getLives() {
        return lives;
    }

    public boolean isIsEating() {
        return isEating;
    }

    //SETTERS
    public void setSize(int size) {
        this.size = size;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

}
