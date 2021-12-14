package com.company;

import java.util.Scanner;

/*
Description
    Write a Java program to check if an input number is a palindrome or not.
Note: A palindrome is a sequence of characters which reads the same backwards and forwards.

Input format:
    Get a number from the console
Output format:
    The output should be boolean value true if the input number is palindrome otherwise the output should be boolean value false

Sample input 1:
    98789
Sample output 1:
    true
Explanation 1:
    Here, if we try to read the given number in reverse format we get 98789.
    Thus, the reverse of the given number is equal to the original input and
    hence the output is boolean value true.

Sample input 2:
    12345
Sample output 2:
    false
Explanation 2:
    Here, if we try to read the given number in reverse format we get 54321.
    Thus, the reverse of the given number is not equal to the original
    input and hence the output is boolean value false.
 */
public class Palindrome {
    public static int palindrome(int num) {
        String reverseNum = "";
        int answer = 0;
        int digit;
        int counter = 0;
        for (int i = num; num > 0 ; num /= 10){
            digit= num%10;
            reverseNum += (char) digit+0 ;
        }
        for(int i=reverseNum.length()-1; i>=0 ; i--) {
            answer = answer + (((int) reverseNum.charAt(i) - 48) * (int) Math.pow(10, counter));
            counter++;
        }
        System.out.println(answer);
        return answer;
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = palindrome(num);
        boolean isPalindrome = false;
        if (answer == num)
            isPalindrome = true;
        System.out.println(isPalindrome);
    }
}
/*

454 %  10 = 4


 */