/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author James Tang
 */
import java.util.Scanner;

public class FunctionCalculator {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
        
        //User Input
        System.out.println("What is the coordinates of the first point?");
        System.out.print("x: ");
        double x1=input.nextDouble() ;
        System.out.print("y: ");
        double y1=input.nextDouble() ;
        System.out.println("What is the coordinates of the second point?");
        System.out.print("x: ");
        double x2=input.nextDouble() ;
        System.out.print("y: ");
        double y2=input.nextDouble() ;
        System.out.println("What is the coordinates of the third point?");
        System.out.print("x: ");
        double x3=input.nextDouble() ;
        System.out.print("y: ");
        double y3=input.nextDouble() ;
        System.out.println("What is the coordinates of the fourth point?");
        System.out.print("x: ");
        double x4=input.nextDouble() ;
        System.out.print("y: ");
        double y4=input.nextDouble() ;
        
        //
        double a=(y2-y1)/(x2-x1) ;
        
        double b=(y3-y1-a*(x3-x1))/(x3-x1)*(x3-x2);
        
        double c=(y4-y1-a*(x4-x1)-b*(x4-x1)*(x4-x2))/(x4-x1)*(x4-x2)*(x4-x3);

        
        double d=c*(-x1+(-x2)+(-x3))+b;
        double e=c*(-x1)*(-x2+(-x3))+(-x3)+b*(-x1+(-x2))+a ;
        double f=c*(-x1*-x3)+b*(-x1*-x2)+a*(-x1)+y1 ;

        System.out.println("The equation of the graph that has the points "+"("+x1
                +","+y1+") "+"("+x2+","+y2+") "+"("+x3+","+y3+") "+"("+x4+","+y4+") is:");
        System.out.println(c+"x³+"+d+"x²+"+e+"x+-"+f);
    }
    
}
