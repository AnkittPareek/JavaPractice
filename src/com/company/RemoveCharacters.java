package com.company;
import java.util.*;
public class RemoveCharacters {
    static String removeCommonChar(String str1, String str2)
    {
        String s = "";
        Boolean found = false;
        for(int i = 0; i<str1.length(); i++){
            for(int j = 0 ; j<str2.length(); j++){
                if (str1.charAt(i)==(str2.charAt(j)))
                    found=true;
            }
            if (found==false)
                s=s+(str1.charAt(i));
            found=false;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(removeCommonChar(str1, str2));
    }
}