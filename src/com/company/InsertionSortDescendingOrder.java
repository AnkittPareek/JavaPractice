package com.company;
import java.util.Scanner;

class InsertionSortDescendingOrder {
    public static void insertionSortDescending(int array[]) {
        //write your code here
        int sorted = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (j == array.length)
                    break;
                while (array[j] > array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        if (array[array.length-1] > array[array.length - 2]){
            int temp = array[array.length - 2];
            array[array.length-2] = array[array.length-1];
            array[array.length-1] = temp;
        }
        for (int item : array)
            System.out.println(item);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSortDescending(array);
    }
}