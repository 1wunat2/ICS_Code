/*
Name: Nathan Wu
Date: 2/28/2019
Version: 0.01
Description:
    digits activity for practice.
 */
package edu.hdsb.gwss.nathan.ics3u.u2;

/**
 *
 * @author 1wunat2
 */
public class digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           int xyz = 234;
           int x = xyz/100;
           int y = (xyz-x*100)/10;
           int z = (xyz-(x*100)-(y*10));
           System.out.println("for the number "+xyz);
           System.out.println("the hundreth place digit is "+x);
           System.out.println("the tenth place digit is "+y);
           System.out.println("the ones place digit is "+z);
           
             
                     

        
                
    }
    
}
