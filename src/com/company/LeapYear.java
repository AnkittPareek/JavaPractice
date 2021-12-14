package com.company;
import java.util.Scanner;

/*
Description
Write a program which takes a year as an input and prints
true if the year is a leap year and false otherwise.

Input format:
    Get a year from the console
Output format:
    The output should be boolean value true if the input year is a leap year
    otherwise the output should be boolean value false

Sample Input 1:
2000

Sample Output 1:
true

Sample Input 2:
1991

Sample Output 2:
false

 */
public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = isLeapYear(num);
        System.out.println(answer);
    }
}
