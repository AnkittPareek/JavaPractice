package com.company;

import java.util.Scanner;

public class SelectionSortStateOfArray {
    public static void selectionSortAfterNIterations(int[] arr, int n) {
        //write your code here
        int pass = 0;
        if(arr.length==1){
            System.out.print(arr[0]);
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // Find Min
            int min = arr[i], minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // Swap min with first available location
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            if (n - 1 == i) {
                for (int x = 0; x < arr.length - 1; x++)
                    System.out.print(arr[x] + " ");
                System.out.print(arr[arr.length - 1]);
                pass = -1;
            }
        }
        if(pass != -1){
            for (int x = 0; x < arr.length - 1; x++)
                System.out.print(arr[x] + " ");
            System.out.print(arr[arr.length - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = scanner.nextInt();
        }
        int i = scanner.nextInt();
        selectionSortAfterNIterations(array, i);
    }
}