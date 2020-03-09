/*
Name:Nathan Wu
Date:4/9/2019
Version:1.0
Description:
    This program calculated how many years it will take for the soil to erode 
    that it is not deep enough to not be able to grow crops. 
 */
package edu.hdsb.gwss.nathan.ics3u.u4;

/**
 *
 * @author 1wunat2
 */
public class SoilErosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SPLASH SCREEN
        System.out.println("Soil Erosion\n");
        System.out.println("Careless land management causes approximately 1.25% "
                + "of the topsoil to erode each year. It is then lost forever "
                + "since it takes nature approximately 400 years to produce "
                + "2.5cm of topsoil.  At 10cm, the topsoil is so shallow the "
                + "crops cannot grow on a large scale. If Canada has about 30cm "
                + "of topsoil, how many years will it take for the depths to "
                + "bereduced to 10cm?\n");
        
        //constants
        final double erodePercent = 1.25, produced = 2.5 / 400;

        //variable
        double soil = 30, erode;
        int year;

        for (year = 1; soil > 10; year++) {
            erode = erodePercent * soil / 100;
            soil = soil - erode + produced;
        }
        System.out.println("It will take " + year + " years for the soil to erode to a "
                + "depth such that crops will not grow.");
    }

}
