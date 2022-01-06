package com.company;
import java.util.*;

class FirstRepeatedChar {
    private static int findFirstRepeatedChar(String str){
        //write your code here
        int diff = str.length() , ans = -1;
        for (int i = 0 ; i < str.length() ; i++)
            for (int j = i+1 ; j<str.length() ; j++){
                if (str.charAt(i) == str.charAt(j) && j-i < diff) {
                    diff = j - i;
                    ans = i;
                }
        }
    return ans;

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = findFirstRepeatedChar(str);
        if(index != -1){
            System.out.println(str.charAt(index));
        }
        else{
            System.out.println("NA");
        }
    }
}