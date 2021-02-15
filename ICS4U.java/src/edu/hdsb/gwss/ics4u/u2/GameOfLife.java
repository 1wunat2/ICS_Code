/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 4U-Nathan
 */
public class GameOfLife {

    public static int NUM;
    public static boolean VALUE = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        boolean[][] cells;
        boolean[][] nextGen;
        int c, r, total, gen = 1;
        boolean again;

        //objects
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("How many rows");
        r = Integer.parseInt(input.nextLine());
        System.out.println("How many columns");
        c = Integer.parseInt(input.nextLine());
        total = r * c;
        System.out.println("How many cells are alive out of " + total);
        NUM = Integer.parseInt(input.nextLine());

        //set size of data
        cells = new boolean[c][r];
        nextGen = new boolean[c][r];

        //Start with all dead or alive cells
        cells = fillArray(cells, total);

        //Replace the values
        replaceCells(cells);

        System.out.println("Gen " + gen);
        display(cells);
        gen++;
        System.out.println("");

        do {
            nextGen = nextGeneration(cells, nextGen);
            cells = nextGen;
            System.out.println("Gen " + gen);
            display(cells);
            gen++;

            again = next(input);
        } while (again);
    }

    public static void display(boolean[][] cells) {
        for (boolean[] cell : cells) {
            for (int j = 0; j < cell.length; j++) {
                System.out.print(cell[j] ? 1 : 0);
            }
            System.out.println("");
        }
    }

    public static void replaceCells(boolean[][] cells) {
        int col, row;
        boolean placed;

        for (int i = 0; i < NUM; i++) {
            placed = false;

            while (!placed) {
                col = (int) (Math.random() * ((cells.length - 1) + 1));
                row = (int) (Math.random() * ((cells.length - 1) + 1));

                if (cells[col][row] != VALUE) {
                    cells[col][row] = VALUE;
                    placed = true;
                }
            }
        }
    }

    public static boolean validIndex(boolean[][] cells, int r, int c) {
        if (r < 0 || r >= cells.length) {
            return false;
        }
        return !(c < 0 || c >= cells[0].length);
    }

    public static int liveNeigh(boolean[][] cells, int i, int j) {
        int n = 0;
        for (int r = i - 1; r <= i + 1; r++) {
            for (int c = j - 1; c <= j + 1; c++) {
                if (validIndex(cells, r, c) && cells[r][c] && !(i == r && j == c)) {
                    n++;
                }
            }
        }
        return n;
    }

    public static boolean[][] fillArray(boolean[][] cells, int total) {
        if (NUM > Math.ceil(total / 2)) {
            for (boolean[] cell : cells) {
                Arrays.fill(cell, true);
            }
            NUM = total - NUM;
            VALUE = false;
        }
        return cells;
    }

    public static boolean[][] nextGeneration(boolean[][] cells, boolean[][] nextGen) {
        int n;

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                n = liveNeigh(cells, i, j);

                if (cells[i][j] == false && n == 3) {
                    nextGen[i][j] = true;
                } else if (cells[i][j] == true) {
                    switch (n) {
                        case 2:
                        case 3:
                            nextGen[i][j] = true;
                    }
                }
            }
        }
        return nextGen;
    }

    public static boolean next(Scanner input) {
        String choice;

        System.out.println("Press enter to continue or press e to exit");
        choice = input.nextLine();

        return !choice.equalsIgnoreCase("e");
    }
}
