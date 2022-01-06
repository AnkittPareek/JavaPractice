package com.company;
import java.util.*;
public class StringPermutations {
    public static  void stringPermutations(String str, int left, int right) {
        // write your code here
        int temp = 0;
        int mid = left + 1;
        if(str.length()==1)
            System.out.println(str.charAt(left));
        else if (str.length() == 2) {
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(1));
            System.out.print(str.charAt(1));
            System.out.println(str.charAt(0));

        }
        else if (str.length()==3) {
            for (int i = 0; i < str.length(); i++) {
                if (i != 0)
                    if (left == 0) {
                        mid = 0;
                        left = 1;
                        right = 2;
                    } else if (mid == 0) {
                        left = 2;
                        mid = 1;
                        right = 0;
                    }
                int l = left, m = mid, r = right;
                for (int j = 1; j < str.length(); j++) {
                    System.out.print(str.charAt(l));
                    System.out.print(str.charAt(m));
                    System.out.println(str.charAt(r));

                    temp = m;
                    m = r;
                    r = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if(len <= 3)
            stringPermutations(str,0,len-1);
        else
            System.out.print("NA");
    }
}