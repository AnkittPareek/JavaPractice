package com.company;

import java.util.Scanner;

/*
Factorial
Description
    Write a program that takes a number as an input and prints the factorial of the number as the output.

Input Format:
    Whole number
Output Format:
    Factorial of the given number

Sample Input 1:
    2
Sample Output 1:
    2
Explanation 1:
    Factorial of 2 is,
    = 1 * 2
    = 2

Sample Input 2:
    4
Sample Output 2:
    24
Explanation 2:
    Factorial of 4 is,
    = 1 * 2 * 3 * 4
    = 24
 */
public class Factorial {
    public static int factorial(int num) {
        int factorial = 1 ;
        for (int i = 1 ; i <= num ; i++){
            factorial *= i;
        }
    return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = factorial(num);
        System.out.println(answer);
    }
}
