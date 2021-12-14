package com.company;

import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        int n, x;
        int[] numberArray = {1,15,90,40,35,63,79,88,20};
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        boolean numberFound = false;
        for (int i = 0; i < numberArray.length ;i++) {
            if (numberArray[i] == n) {
                numberFound = true;
                System.out.println(i);
            }
        }
        if (!numberFound){
            System.out.println("Number not found");
        }
    }

}
