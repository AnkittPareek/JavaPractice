package com.company;
import java.io.*;
import java.util.*;

public class AlternativeSorting {
    public static void alternativeSorting(int[] arr) {

        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
        if (arr.length % 2 != 0)
            System.out.print(arr[i]);
    }

    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        alternativeSorting(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}