/*
 * Name: James Tang
 * Date: Oct 16, 2019
 * Version: v0.1
 * Description: Find a person's BMI
*/

package edu.hdsb.gwss.james.ics3u.u3.Assignment;

/**
 *
 * @author James Tang
 */

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	
		
	//Object
	Scanner input = new Scanner(System.in);
	
	//Varibales
	double weight,height,BMI;
	String unit;
	
	//Splash Screen
		System.out.println("Body mass index (BMI) is a measure of the weight of a person scaled according to their height");
		
	//Input
		System.out.print("Are you using metric or imperial: ");
		unit = input.nextLine();
		System.out.print("What is your weight: ");
		weight = input.nextDouble();
		System.out.print("What is your height: ");
		height = input.nextDouble();

	//Processing
	if (height<=0 || weight <=0 ||!unit.equals("metric")||!unit.equals("imperial")){
            System.out.println("INVALID");
        }

        if ((unit.equals("metric"))&&(height>0)&&(weight>0)){
        BMI = weight/(height*height);
        if(BMI<16){
            System.out.println("STARVATION");
        }
        if((BMI>=16)&&(BMI<18.5)){
            System.out.println("UNDERWEGHT");
        }
        if((BMI>=18.5)&&(BMI<25)){
            System.out.println("IDEAL");
        }
        if((BMI>=25)&&(BMI<30)){
            System.out.println("OVERWEIGHT");
        }
        if((BMI>=30)&&(BMI<40)){
            System.out.println("OBESE");
        }
        if(BMI>=40){
            System.out.println("MORBIDLY OBESE");
        }
    }
        
        if ((unit.equals("imperial"))&&(height>0)&&(weight>0)){
        BMI = (weight*703)/(height*height);
          if(BMI<16){
            System.out.println("STARVATION");
        }
        if((BMI>=16)&&(BMI<18.5)){
            System.out.println("UNDERWEIGHT");
        }
        if((BMI>=18.5)&&(BMI<25)){
            System.out.println("IDEAL");
        }
        if((BMI>=25)&&(BMI<30)){
            System.out.println("OVERWEIGHT");
        }
        if((BMI>=30)&&(BMI<40)){
            System.out.println("OBESE");
        }
        if(BMI>=40){
            System.out.println("MORBIDLY OBESE");
        }
    }
        }}

