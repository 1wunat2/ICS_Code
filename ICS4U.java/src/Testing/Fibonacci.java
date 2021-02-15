/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nwu10
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fibonacci(4);
    }

    public static List<Integer> fibonacci(int n) {
        // Write your code here
        ArrayList list = new ArrayList<Integer>();
        list.add(0);
        if (n == 1) {
            return list;
        }
        list.add(1);
        if (n == 2) {

            return list;
        }
        n = n - 2;
        //BASE CASE
        return helper(n, list);
    }

    public static List<Integer> helper(int n, ArrayList list) {
        if (n == 0) {
            return list;
        }
        int next = (int) list.get(list.size() - 1) + (int) list.get(list.size() - 2);
        list.add(next);
        return helper(n - 1, list);
    }

}
