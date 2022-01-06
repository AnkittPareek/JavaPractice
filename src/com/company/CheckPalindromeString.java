package com.company;
import java.util.*;
public class CheckPalindromeString {
    public static boolean isPalindrome(String str) {
        //write your code here
        boolean answer = false;
        String reverseStr = "";
        for(int i = str.length()-1 ;  i>=0 ; i--){
            reverseStr += str.charAt(i);
        }
        if(str.toLowerCase(Locale.ROOT).equals(reverseStr.toLowerCase(Locale.ROOT)))
           answer = true;
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}