/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String[] resCol = new String[3];
        StringTokenizer input;
        String[] color = new String[3];
        boolean match = false;
        int n = 0, value;

        //objects
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the resistor colors in the format color1-color2-color3");
        input = new StringTokenizer(scanner.nextLine(), "-");
        int j = input.countTokens();
        for (int i = 0; i < j; i++) {
            resCol[i] = input.nextToken().toLowerCase();
        }

        for (int i = 0; i < resCol.length; i++) {
            switch (resCol[i]) {
                case "black":
                    color[i] = "0";
                    break;
                case "brown":
                    color[i] = "1";
                    break;
                case "red":
                    color[i] = "2";
                    break;
                case "orange":
                    color[i] = "3";
                    break;
                case "yellow":
                    color[i] = "4";
                    break;
                case "green":
                    color[i] = "5";
                    break;
                case "blue":
                    color[i] = "6";
                    break;
                case "violet":
                    color[i] = "7";
                    break;
                case "grey":
                    color[i] = "8";
                    break;
                case "white":
                    color[i] = "9";
                    break;
            }
        }
        value = (int) (Integer.parseInt(color[0] + color[1]) * Math.pow(10, Integer.parseInt(color[2])));
        System.out.println(value);
    }
}
