/*
 * Name: James Tang
 * Date: Jan 07, 2020
 * Version: v0.1
 * Description: Displays 10 random integers and sorts them
 */
package edu.hdsb.gwss.james.ics3u.u7.l3;

/**
 *
 * @author 1tangjam
 */
public class BubbleSort {

    public static void sort (int[] list){
        int swap;
        
    
    }
    public static void main(String[] args) {
        //Variables

        //Creats Golf Score Array
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i]=(int) (Math.random() * 1000) + 1;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        
        sort(list);
        
        
    }

}
