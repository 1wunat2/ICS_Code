/*
 * Name: James Tang
 * Date: Sept 23, 2019
 * Version: v0.1
 * Description: Displays the rules of rock, paper, scissors
 */
package edu.hdsb.gwss.james.ics3u.u2.l1;

/**
 * @author James Tang
 */
public class RockPaperScissors {

    public static void main(String[] args) {
                
        String RPS = "%-8s \n" ;
        System.out.println("Rock Paper Scissors Rules");
        System.out.println("Players choose between rock, paper, or scissors");
        System.out.println("Players display the choice they have made");
        System.out.println("The choice that each player chose determines the winner");
        System.out.format(RPS,"Rock beats scissors");
        System.out.format(RPS,"Rock beats scissors");
        System.out.format(RPS,"Paper beats rock");
        System.out.format(RPS,"Scissors beats paper");
    }
    
}
