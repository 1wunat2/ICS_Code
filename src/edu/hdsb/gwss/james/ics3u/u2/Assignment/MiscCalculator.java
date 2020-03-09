/*
 * Name: James Tang
 * Date: Oct 1, 2019
 * Version: v0.3
 * Description: Solves for various different things
 */

package edu.hdsb.gwss.james.ics3u.u2.Assignment;
/**
 * @author James Tang
 */
import java.util.Scanner;

public class MiscCalculator {

    static void Triangle(){
    
    //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %-12s \n ","Area","Perimeter");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
        
        //Process
        if(choice.equals("Area")){
            
            //Input
            System.out.print("What is the base length: ");
            double b=input.nextDouble();
            System.out.print("What is the height: ");
            double h=input.nextDouble();
            
            //Display
            System.out.println("The area of the triangle is "+((b*h)/2)+"cm"
                    +(char) 0x00B2);   
        }
        
        //Process
        if(choice.equals("Perimeter")){
            
            //Input
            System.out.print("What is the side length 1: ");
            double s1=input.nextDouble();
            System.out.print("What is the side length 2: ");
            double s2=input.nextDouble();
            System.out.print("What is the side length 3: ");
            double s3=input.nextDouble();
            
            //Display
            System.out.println("The perimeter of the triangle is "
                    +(s1+s2+s3)+"cm");    
        }
    }
    
    static void Circle(){ 
        
    //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %-12s \n ","Area","Circumference");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the radius: ");
            double r=input.nextDouble();
        
        //Process
        if(choice.equals("Area")){
            
            //Display
            System.out.println("The area of the circle is "+
                    (Math.PI *Math.pow(r,2))+"cm"+(char) 0x00B2);   
        }
        
        //Process
        if(choice.equals("Circumference")){

            //Display
            System.out.println("The circumference of the cirlce is "
                    +(2*Math.PI*r)+"cm");    
        }        
        
    }
    
    static void Square(){
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %-12s \n ","Area","Perimeter");
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the side length: ");
            double s=input.nextDouble();
        
        if(choice.equals("Area")){
            
            System.out.println("The area of the square is "
                    +(s*s)+"cm"+(char) 0x00B2);   
        }
        
        if(choice.equals("Perimeter")){

            System.out.println("The perimeter of the square is "+(4*s)+"cm");    
        }        
        
    }
    
    static void Rectangle(){
       
    //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %-12s \n ","Area","Perimeter");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the side length 1: ");
            double s1=input.nextDouble();
            System.out.print("What is the side length 2: ");
            double s2=input.nextDouble();
        
        //Process
        if(choice.equals("Area")){
            
            //Display
            System.out.println("The area of the rectangle is "
                    +(s1*s2)+"cm"+(char) 0x00B2);   
        }
        
        //Process
        if(choice.equals("Perimeter")){

            //Display
            System.out.println("The perimeter of the rectangle is "
                    +(2*s1+2*s2)+"cm");    
        }        
            
    }
    
    static void Polygon(){
        
    //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %-12s \n ","Area","Perimeter");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("How many sides does the polygon have: ");
            double n=input.nextDouble();
            System.out.print("What is the length of the side: ");
            double s=input.nextDouble();
        
        //Process
        if(choice.equals("Area")){
            
            //Display
            System.out.println("The area of the polygon is "
                    +((Math.pow(s,2)*n)/4*Math.tan(180/n))+"cm"+(char) 0x00B2);   
        }
        
        //Process
        if(choice.equals("Perimeter")){

            //Display
            System.out.println("The perimeter of the rectangle is "+(n*s)+"cm");    
        }        
              
    }
    
    static void Cube(){
        
    //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %12s \n ","Surface Area","Volume");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the length of the side: ");
            double s=input.nextDouble();
        
        //Process
        if(choice.equals("Surface Area")){
            
            //Display
            System.out.println("The surface area of the cube is "
                    +(6*Math.pow(s,2))+"cm"+(char) 0x00B2);   
        }
        
        //Process
        if(choice.equals("Volume")){
            
            //Display
            System.out.println("The volume of the cube is "
                    +(Math.pow(s,3))+"cm"+(char) 0x00B3);    
        }
        
    }
    
    static void Sphere(){
        
    //Object
    Scanner input = new Scanner(System.in);
    
        //Input
        System.out.format("%-12s %12s \n ","Surface Area","Volume");
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the radius of the circle: ");
            double r=input.nextDouble();
        
        //Process
        if(choice.equals("Surface Area")){
            
            //Display
            System.out.println("The surface area of the sphere is "
                    +(4*Math.PI*Math.pow(r,2))+"cm"+(char) 0x00B2);   
        }
        
        //Process
        if(choice.equals("Volume")){
            
            //Display
            System.out.println("The volume of the sphere is "
                    +((4/3)*Math.PI*Math.pow(r,3))+"cm"+(char) 0x00B3);    
        }
           
    }
    
    static void Pyramid(){
    
    //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %12s \n ","Surface Area","Volume");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the length of the base: ");
            double s=input.nextDouble();
            System.out.print("What is the height: ");
            double h=input.nextDouble();            
        
        //Process
        if(choice.equals("Volume")){
            
            //Display
            System.out.println("The volume of the pyramid is "
                    +((s*s*h)/4)+"cm"+(char) 0x00B3);   
        }
        
        //Process
        if(choice.equals("Surface Area")){
            double a=s*s+s*Math.sqrt(Math.pow((s/2),2)+Math.pow(h,2))
                    +s*Math.sqrt(Math.pow((s/2),2)+Math.pow(h,2));
            
            //Display
            System.out.println("The surface area of the pyramid is "
                    +a+"cm"+(char) 0x00B2);    
        }
        
    }
    
    static void Dodecahedron(){
    
        //Object
    Scanner input = new Scanner(System.in);
        System.out.format("%-12s %12s \n ","Surface Area","Volume");
        
        //Input
        System.out.print("What Do you Want to Solve for Today: ");
        String choice = input.nextLine();
            System.out.print("What is the length of the side: ");
            double s=input.nextDouble();

        //Process
        if(choice.equals("Volume")){
            
            //Display
            double v= ((15+7*Math.sqrt(5))/4)*Math.pow(s,3);
            System.out.println("The volume of the pyramid is "
                    +v+"cm"+(char) 0x00B3);   
        }
        
        //Process
        if(choice.equals("Surface Area")){
            double a=3*(Math.sqrt(25+10*Math.sqrt(5)))*Math.pow(s,2);
            
            //Display
            System.out.println("The surface area of the pyramid is "+a+"cm"+(char) 0x00B2);    
        }   
    }
    
    static void Quadratic(){
        //Object
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("What is your 'a' value: ");
        double a=input.nextDouble();
        System.out.print("What is your 'b' value: ");
        double b=input.nextDouble();
        System.out.print("What is your 'c' value: ");
        double c=input.nextDouble();    
        
        //Processing
        double r1, r2;
        double d = Math.pow(b,2)- 4*a*c;
        
        //For real roots
        if(d > 0) {
            
            //Processing
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            
            //Display
            System.out.println("The roots of the quadratic "
                +a+"x"+(char) 0x00B2+"+"+b+"x"+c
                +" is "+"("+r1+",0), and ("+r2+",0)");
        }

        //For imaginary roots
        else {
            
            //Processing
            double Real=-b/(2 *a);
            double Imaginary=Math.sqrt(-d) / (2 * a);
            
            //Display
            System.out.println("The roots of the quadratic "
                +a+"x"+(char) 0x00B2+"+"+b+"x"+c
                +" is ("+Real+"+"+Imaginary+"i,0), and ("+Real+"+"+Imaginary+"i,0)");
 
    }
    }
    
    static void Midpoint(){
    //Object
    Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("What is your first 'x' value: ");
        double x1=input.nextDouble();
        System.out.print("What is your first 'y' value: ");
        double y1=input.nextDouble();
        System.out.print("What is your second 'x' value: ");
        double x2=input.nextDouble();    
        System.out.print("What is your second 'y' value: ");
        double y2=input.nextDouble();    
        
        //Processing
        double mx=(x1+x2)/2;
        double my=(1+y2)/2;
        
        //Display
        System.out.println("The midpoint is ("+mx+","+my+")");
    }
    
    static void DB2P(){
     //Object
    Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("What is your first 'x' value: ");
        double x1=input.nextDouble();
        System.out.print("What is your first 'y' value: ");
        double y1=input.nextDouble();
        System.out.print("What is your second 'x' value: ");
        double x2=input.nextDouble();    
        System.out.print("What is your second 'y' value: ");
        double y2=input.nextDouble();    
        
        //Processing
        double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        
        //Display
        System.out.println("The distance between the 2 points is "+d);    
    }
    
    public static void main(String[] args) {
        
        //Object
        Scanner input = new Scanner(System.in);
        
        String Format="%-12s %-12s %-12s %-12s %-12s \n";
        System.out.format(Format, "Triangle","Circle", "Square", 
                "Rectangle","Regular Polygon");
        System.out.println("");
        System.out.format(Format, "Cube", "Sphere", "Dodecahedron","",
                "Square Pyramid");
        System.out.println("");
        System.out.format(Format, "Quadratic","Midpoint",
                "Distance Between 2 Points", "", "");
        System.out.println("");
        System.out.println("Please write everything as displayed");
        System.out.println("");
        
        //Input
        System.out.print("What Do You Want to Solve for Today: "); 
        String choice = input.nextLine();

        //Display
           
        if(choice.equals("Triangle")) {  
            Triangle();
        }
        
        if(choice.equals("Circle")){
            Circle();
        }
        
        if(choice.equals("Square")){
           Square(); 
        }
        
        if(choice.equals("Rectangle")){
           Rectangle(); 
        }
        
        if(choice.equals("Regular Polygon")){
            Polygon();
        }
        
        if(choice.equals("Cube")){
            Cube();
        }
        
        if(choice.equals("Sphere")){
            Sphere();
        }
        
        if(choice.equals("Square Pyramid")){
            Pyramid();
        }
        
        if(choice.equals("Dodecahedron")){
            Dodecahedron();
        }
        
        if(choice.equals("Quadratic")){
            Quadratic();
        }
        
        if(choice.equals("Midpoint")){
            Midpoint();
        }
        
        if(choice.contains("Distance Between 2 Points")){
           DB2P();
           
        }
        
        }
    }
    
