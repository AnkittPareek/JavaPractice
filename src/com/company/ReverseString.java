package com.company;
import java.util.*;
public class ReverseString {
    public static String reverse(String str) {
        //write your code here
        String reverseStr = "";
        for(int i = str.length()-1 ;  i>=0 ; i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}