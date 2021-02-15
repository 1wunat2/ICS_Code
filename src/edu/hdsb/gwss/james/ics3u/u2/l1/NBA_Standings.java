/*
 * Name: James Tang
 * Date: Sept 23, 2019
 * Version: v0.1
 * Description: Creates a table to display the 2019 NBA standings
 */
package edu.hdsb.gwss.james.ics3u.u2.l1;

/**
 
 * @author James Tang
 */
public class NBA_Standings {

    public static void main(String[] args) {
     
        System.out.println("NBA Standings");
        System.out.println(" ");
        System.out.println("Eastern Conference");
        System.out.println(" ");

        String nba_format="%-8s %8s %8s %8s %8s\n";

        System.out.format(nba_format, "Ranking","Team","W","L","PS/G");
        System.out.format(nba_format, "1","Bucks","60","22","118.1");
        System.out.format(nba_format, "2","Raptors","58","24","108.4");
        System.out.format(nba_format, "3","76ers","51","31","112.5");
        System.out.format(nba_format, "4","Celtics","49","33","108.0");
        System.out.format(nba_format, "5","Pacers","48","34","104.7");
        System.out.format(nba_format, "6","Nets","42","40","112.3");
        System.out.format(nba_format, "7","Magic","42","40","106.6");
        System.out.format(nba_format, "8","Pistons","41","41","107.3");
    }

    }
    

