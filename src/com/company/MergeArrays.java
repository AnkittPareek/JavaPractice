package com.company;
import java.util.Scanner;

class MergeArrays {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int ascendingMerge[] = mergeBothInAscendingOrder(sortedArray1, sortedArray2);

        for (int i = 0; i < ascendingMerge.length; i++) {
            System.out.println(ascendingMerge[i]);
        }
    }
    public static int[] getArrayInput(int n, Scanner sc) {
        int[] arr =  new int[n];
        for (int i = 0 ; i<n; i++)
            arr[i]=sc.nextInt();
        return arr;
    }
    private static int[] mergeBothInAscendingOrder(int arr1[], int arr2[]) {
        //write your code here
        int[] arr3 = new int[arr1.length+arr2.length];
        mergeArrays(arr1,arr2,arr3);
        return  arr3;
    }
    public static void mergeArrays(int[] left, int[] right, int[] mergedArray) {
        int l = 0, r = 0, m = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                mergedArray[m] = left[l];
                l++;
                m++;
            } else {
                mergedArray[m] = right[r];
                r++;
                m++;
            }
        }
        if (r < right.length) {
            while (r < right.length) {
                mergedArray[m] = right[r];
                r++;
                m++;
            }
        } else {
            while (l < left.length) {
                mergedArray[m] = left[l];
                l++;
                m++;
            }
        }
    }
}