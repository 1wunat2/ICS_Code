/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.james.ics3u.u5.l2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author James Tang
 */
public class PersonalFileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        PrintWriter output = new PrintWriter(file);
        output.println("James");
        output.println("16");
        output.close();
    
        Scanner input = new Scanner(file);
        String name = input.nextLine();
        String age = input.nextLine();
        System.out.println("Name "+name+" Age "+age);
    }
}
