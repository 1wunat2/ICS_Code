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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int again;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Press 0 if you would again. Press any other number"
                    + " if not.");
            again = input.nextInt();
        } while (again < 0);
    }

}
