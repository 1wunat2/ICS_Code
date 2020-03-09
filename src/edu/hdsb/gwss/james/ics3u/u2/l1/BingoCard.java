/*
 * Name: James Tang
 * Date: Sept 23, 2019
 * Version: v0.1
 * Description: Creates a bingo card
 */
package edu.hdsb.gwss.james.ics3u.u2.l1;

/**
 * @author James Tang
 */
public class BingoCard {

    public static void main(String[] args) {
    String BingoFormat="%2s %8s %8s %8s %8s\n";
    
    System.out.format(BingoFormat,"B","I","N","G","O");
    System.out.format(BingoFormat,"7","16","38","60","61");
    System.out.format(BingoFormat,"9","30","43","57","75");
    System.out.format(BingoFormat,"3","21","FREE","52","73");
    System.out.format(BingoFormat,"6","19","32","46","65");
    System.out.format(BingoFormat,"13","28","37","53","69");
    }
    
}
