package com.company;

import java.util.Scanner;

public class PerfectNumber{
    public static int perfectNumber(int num) {
        int sumOfFactors = 0;
        if (num == 1)
            sumOfFactors += num;
        for(int i = 1 ; i<num ; i++){
            if(num % i == 0){
                sumOfFactors += i;
            }
        }
        return sumOfFactors;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = perfectNumber(num);
        boolean isPerfectNumber = false;
        if (answer == num)
            isPerfectNumber = true;
        System.out.println(isPerfectNumber);
    }
}