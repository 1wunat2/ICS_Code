/*
Name: Nathan Wu
Date:5/15/2019
Version:1.0
Description:
    This program converts a time in standard or traditional and changes it to 
    the other, standard to traditional or traditional to standard.
 */
package edu.hdsb.gwss.nathan.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nwu10
 */
public class TimeChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variables
        String time = "", amOrPm = "";
        int hour = 0, minute = 0;

        //objacts
        File arab = new File("DATA31.txt");
        Scanner input = new Scanner(arab);

        splashscreen();

        //reading from the file
        while (input.hasNextLine()) {
            time = input.nextLine();
            time(time, hour, minute, amOrPm);
        }
    }

    public static void splashscreen() {
        System.out.println("Standard Time");
        System.out.println("-----------------");
        System.out.println("This program converts a time in standard or traditio"
                + "nal and changes it to the other, standard to traditional or"
                + " traditional to standard.\n");
    }

    public static void time(String time, int hour, int minute, String amOrPm) throws FileNotFoundException {
        //variables
        boolean repeat, standard = false;

        //turning hour and minute into string
        try {
            //tokenizing
            time = time.replaceAll(" ", ":");
            StringTokenizer str = new StringTokenizer(time, ":");
            hour = Integer.parseInt(str.nextToken());
            minute = Integer.parseInt(str.nextToken());

            //if standard get am or pm
            if (str.countTokens() == 1) {
                amOrPm = str.nextToken();
                standard = true;
            } else {
                amOrPm = "";
                standard = false;
            }
            repeat = false;

            //if ther is a miss input repeat
        } catch (Exception e) {
            repeat = true;
        }
        //error check
        if (standard && ((time.length() != 7 && time.length() != 8)
                || (hour < 1 || hour > 12) || (!amOrPm.equalsIgnoreCase("am")
                && !amOrPm.equalsIgnoreCase("pm") || (minute > 60 || minute < 0)) || repeat)) {
            System.out.println("Invalid Time");
            repeat = false;
        } else if (!standard && (!(time.length() == 5)
                || (hour < 1 || hour > 23) || (!amOrPm.equalsIgnoreCase("") || (minute > 60 || minute < 0))
                || repeat)) {
            System.out.println("Invalid Time");
            repeat = false;
        } else {
            repeat = true;
        }
        //if traditional convert to standard
        if (amOrPm.equalsIgnoreCase("am") || amOrPm.equalsIgnoreCase("pm") && repeat) {
            convertToTraditional(time, hour, minute, amOrPm);
        } //if standard convert to traditional
        else if (repeat) {
            convertToStandard(time, hour, minute);
        }
    }

    public static void convertToStandard(String time, int hour, int minute) {
        //converting to standard
        if (hour > 12) {
            hour = hour - 12;
            time = hour + ":" + minute + " PM";
            if (minute < 10) {
                time = hour + ":" + "0" + minute + " PM";
            }
        } else if (hour < 12 && hour > 0) {
            time = hour + ":" + minute + " AM";
            if (minute < 10) {
                time = hour + ":" + "0" + minute + " AM";
            }
        } else if (hour == 12) {
            time = hour + ":" + minute + " PM";
            if (minute < 10) {
                time = hour + ":" + "0" + minute + " PM";
            }
        } else {
            hour = hour + 12;
            time = hour + ":" + minute + " AM";
            if (minute < 10) {
                time = hour + ":" + "0" + minute + " AM";
            }
        }
        if (hour < 10) {
            time = "0" + time;
        }
        System.out.println("Standard time: " + time);
    }

    public static void convertToTraditional(String time, int hour, int minute, String amOrPm) {
        //converting to traditional
        if (amOrPm.equalsIgnoreCase("am")) {
            if (hour < 10) {
                time = "0" + hour + ":" + minute;
                if (minute < 10) {
                    time = "0" + hour + ":" + "0" + minute;
                }
            } else {
                time = hour + ":" + minute;
                if (minute < 10) {
                    time = hour + ":" + "0" + minute;
                }
            }
        } else {
            if (hour != 12) {
                hour = hour + 12;
                time = hour + ":" + minute;
            } else {
                time = hour + ":" + minute;
            }
            if (minute < 10) {
                time = hour + ":" + "0" + minute;
            }
        }
        System.out.println("Traditional time: " + time);
    }
}
