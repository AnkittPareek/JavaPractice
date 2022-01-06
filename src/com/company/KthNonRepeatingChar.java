package com.company;
import java.util.*;

public class KthNonRepeatingChar {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        kthNonRepeatingCharacter(str, k);
    }

    // Method to find the kth non-repeating character in the string
    static void kthNonRepeatingCharacter(String str, int k) {
        // Write your code here
        char c = '1';
        StringBuilder ch = new StringBuilder();
        for (int i=0; i<str.length();i++){
            boolean foundRepeat = false;
            if(str.charAt(i)==' ')
                continue;
            c = str.charAt(i);
            for (int j = 0; j< str.length();j++){
                if (str.charAt(j) == c && i != j) {
                    foundRepeat = true;
                    break;
                }
            }
            if (!foundRepeat)
                ch.append(c);
        }
        if (k<=ch.length())
            System.out.println(ch.charAt(k-1));
        else
            System.out.println("NA");
    }
}