/*
Name: Nathan Wu
Date: 5/9/2019
Version: 2.0
Description:
    This program converts any number from 1 to 999 from its digit 
    representation to its word representation.
 */
package edu.hdsb.gwss.nathan.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1wunat2
 */
public class NumbersToWords {

    /**
     * @param args the command line arguments
     */
    public static int number, length, ten = 0, one, number2, x = 0, number3;
    public static String str = "", str2 = "", digit = "", str3 = "";

    public static void main(String[] args) {
        splashscreen();
        
        //data if user input
        //data();
        
        //for loop to test all cases
        for (int i = 1; i < 1000; i++) {
            str = Integer.toString(i);
            str3 = str;
            number = Integer.parseInt(str);
            number2 = number;
            number3 = number;
            if (number > 9) {
                ten = Integer.parseInt(str3.substring(str3.length() - 2, str3.length() - 1));
            }
            one = Integer.parseInt(str3.substring(str3.length() - 1));

            if (number < 20 && number > 10) {
                teens();
            } else if ((number > 19 && number < 100) || number == 10) {
                tens();
            } else {
                ones();
            }
        }
    }

    public static void splashscreen() {
        System.out.println("Numbers To Words");
        System.out.println("--------------------");
        System.out.println("This program converts any number from 1 to 999 "
                + "from its digit representation to its word representation.");
    }

    public static void data() {
        //object
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Input a number from 1 to 999.\n*The number must be "
                    + "in digit format and a whole number.");
            str = input.nextLine();
            str3 = str;
        } while (str.length() < 1 && str.length() > 3 && !Character.isDigit(str.charAt(0)) && !Character.isDigit(str.charAt(1)));
        number = Integer.parseInt(str);
        number2 = number;
        number3 = number;
        ten = Integer.parseInt(str3.substring(str3.length() - 2, str3.length() - 1));
        one = Integer.parseInt(str3.substring(str3.length() - 1));
    }

    public static void teens() {
        ten = Integer.parseInt(str3.substring(str3.length() - 2));
        one = Integer.parseInt(str3.substring(str3.length() - 1));
        number = number3 % 10;
        if (number == 3 || number == 5) {
            switch (number) {
                case 3:
                    str2 = "THIR";
                    break;
                case 5:
                    str2 = "FIF";
            }
            str2 = str2 + "TEEN";
        } else if (number == 4 || number > 5) {
            ones();
            str2 = str2 + "TEEN";
        } else {
            switch (number) {
                case 1:
                    str2 = "ELEVEN";
                    break;
                case 2:
                    str2 = "TWELVE";
            }
        }
        if (number3 > 99) {
            str = str + str2;
            System.out.println(str);
        } else {
            System.out.println(str2);
        }
    }

    public static void ones() {
        if (number > 99) {
            number = Integer.parseInt(str.substring(str.length() - 3, 1));
        }
        switch (number) {
            case 1:
                str2 = "ONE";
                break;
            case 2:
                str2 = "TWO";
                break;
            case 3:
                str2 = "THREE";
                break;
            case 4:
                str2 = "FOUR";
                break;
            case 5:
                str2 = "FIVE";
                break;
            case 6:
                str2 = "SIX";
                break;
            case 7:
                str2 = "SEVEN";
                break;
            case 8:
                str2 = "EIGHT";
                break;
            case 9:
                str2 = "NINE";
        }
        if (number2 > 99 && number2 % 100 == 0) {
            str = str2 + " HUNDRED ";
            System.out.println(str);
        } else if (number2 > 0 && number2 < 10 && ten == 0) {
            System.out.println(str2);
        } else if (number2 > 100 && x == 0) {
            str = str2 + " HUNDRED AND ";
            x++;
            if (ten == 0 && x == 1) {
                x++;
                number = one;
                number2 = 0;
                ones();
                str = str + str2;
                System.out.println(str);
            } else if (ten > 1 && x == 1) {
                x++;
                tens();
            } else if (x == 1) {
                x++;
                teens();
            }
        }
        x = 0;

    }

    public static void tens() {

        if (ten == 4 || ten > 5) {
            number = ten;
            number2 = Integer.parseInt(str3.substring(str3.length() - 2));
            ones();
            if (number3 > 100 && number > 19) {
                if (ten == 8) {
                    str2 = str + str2 + "Y";
                } else {
                    str2 = str + str2 + "TY";
                }
            } else {
                if (ten == 8) {
                    str2 = str2 + "Y";
                } else {
                    str2 = str2 + "TY";
                }
            }
        } else if (ten > 1) {
            switch (ten) {
                case 2:
                    str2 = "TWEN";
                    break;
                case 3:
                    str2 = "THIR";
                    break;
                case 5:
                    str2 = "FIF";
            }
            str2 = str2 + "TY";
        } else {
            str2 = "TEN";
        }
        if (number3 > 99) {
            str = str + str2;
            number = one;
            if (number != 0) {
                ones();
                str = str + " " + str2;
            }
        } else if (one > 0) {
            number = one;
            str = str2;
            ones();
            str = str + " " + str2;
        } else {
            str = str2;
        }
        System.out.println(str);
    }
}
