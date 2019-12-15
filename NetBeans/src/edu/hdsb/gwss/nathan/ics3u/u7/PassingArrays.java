/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nathan.ics3u.u7;

/**
 *
 * @author nwu10
 */
public class PassingArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {
            2, 3, 9, 5
        };
        test(data);
        
        for(int i  = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
    public static int test(int[] data){
        data[0] = 0;
        return data[0];
    }
    
}
