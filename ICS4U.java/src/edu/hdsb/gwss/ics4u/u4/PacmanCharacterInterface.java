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
public interface PacmanCharacterInterface {
    //GETTERS
    public int getSize() ;
    public int getxLoc() ;
    public int getyLoc() ;
    public int getLives() ;
    public int getDirection();
    public boolean isMouthOpen();
    
    //SETERS
    public void setSize(int size);
    public void setxLoc(int xLoc);
    public void setyLoc(int yLoc);
    public void setmouthOpen(boolean mouthOpen);
    
    //DRAW
    public void drawCharacter();
    
    //ACTIONS
    public void moveRight();
    public void moveLeft();
    public void moveUp();
    public void moveDown();
}
