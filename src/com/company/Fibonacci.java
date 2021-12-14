package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int number){
        int a = 0, b = 1, temp;
        if(number<1){
            System.out.println("OOPS!!!...Enter a Natural Number and try again.");
        }
        else if (number==1){
            System.out.println(a);
        } else if(number==2){
            System.out.print( a + ", " + b );
        }
        else
            System.out.print( a + ", " + b );
        for (int i = 3 ; i<=number ; i++){
            temp = a;
            a = b;
            b = temp + b;
            System.out.print(", "+ b);
        }
    }


    public static void main(String[] args) {
        fibonacci(10);
    }
}
