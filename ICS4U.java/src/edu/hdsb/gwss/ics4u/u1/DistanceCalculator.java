/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4u.u1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author nwu10
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input in ...");
        double div = 57.2958;
        double radius = 6378.8;
        
        System.out.println("lat 1: ");
        double lat1 = input.nextDouble();
        System.out.println("lon l: ");
        double lon1 = input.nextDouble();
        
        System.out.println("lat 2: ");
        double lat2 = input.nextDouble();
        System.out.println("lon 2: ");
        double lon2 = input.nextDouble();
        
        BigDecimal distance = new BigDecimal(radius*Math.acos(Math.sin(lat1)*
                Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon2-lon1)));
        
        System.out.println("Distance: "+distance);
    }

}
