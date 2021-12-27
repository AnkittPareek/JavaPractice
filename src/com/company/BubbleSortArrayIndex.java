package com.company;
import java.util.Scanner;

public class BubbleSortArrayIndex {
    public  static void printIndex(int[] arr) {
        boolean isCompleted;
        int[] arr2 = new int[arr.length];
        for(int i=0 ; i< arr2.length;i++){
            arr2[i] = arr[i];
        }
        for(int i = 0; i < arr.length - 1; i++) {
            isCompleted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isCompleted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isCompleted) {
                break;
            }
        }
        boolean printblnk = false;
        for (int x = 0; x < arr.length; x++){
            for (int y = 0 ; y< arr2.length ; y++){
                if(arr[x]== arr2[y]){
                    System.out.print(y);
                    printblnk = true;
                    break;
                }
            }
                if(x<arr.length-1 && printblnk)
                    System.out.print(" ");
                printblnk = false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = scanner.nextInt();
        }
        printIndex(array);
    }
}