/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start, end, number, min, max;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your start value?");
        start = input.nextInt();
        System.out.println("What is your end value?");
        end = input.nextInt();
        
        min = Math.min(start, end);
        max = Math.max(start, end);
        number=min;
        do{
            System.out.println("\n"+number);
            number++;
            }while(number<=max);
        
    }
    
}
