package com.company;
import javax.print.attribute.standard.MediaSize;
import java.util.*;
public class FindUniqueCharsString {
    static String removeChars(String str, String secStr) {
        // write your code here
        if(secStr.length() > str.length())
            return "NA";
        if (str.toLowerCase(Locale.ROOT).equals(secStr.toLowerCase(Locale.ROOT)))
            return "same";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i<str.length(); i++){
            boolean isUnique = true;
            int x = 0;
            while(x<secStr.length()){
                if (str.toLowerCase(Locale.ROOT).charAt(i)==secStr.toLowerCase(Locale.ROOT).charAt(x)) {
                    isUnique = false;
                    break;
                }
                x++;
            }
            if (isUnique)
                ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(removeChars(str1,str2));
    }
}