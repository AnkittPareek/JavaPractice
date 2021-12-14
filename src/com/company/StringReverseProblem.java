package com.company;

import java.util.Scanner;

public class StringReverseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer reverseInput = new StringBuffer();

        for (int i = input.length()-1; i>=0; i-- ){
            reverseInput.append(input.charAt(i));
        }
        System.out.println(reverseInput);
    }
}
