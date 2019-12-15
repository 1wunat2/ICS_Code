/*
Name:Nathan
Date:4/3/2019
Version:0.01
Description:
    
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

/**
 *
 * @author 1wunat2
 */
public class MooseHerd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int t, amount;
        double f=0.83, n;
        for(t=0; t<=25; t++){
            while(t==0 || t==1){
              f = Math.pow(0.83, t);
              n = 220 / (1 + 10 * f);
              amount = (int)n;
              System.out.println(amount);
              t++;
            }
            f = f * 0.83;
            n = 220 / (1 + 10 * f);
            amount = (int)n;
            System.out.println(amount);
        }
    }
    
}
