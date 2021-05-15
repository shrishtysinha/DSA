package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] = new int[5];
        System.out.println("Enter the unsorted array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Insertion sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }

        System.out.println("");
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i+ 1] = key;
        }
        System.out.println("After Insertion sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }
    }
}
// No swaps only shifts
// Best algorithm if input size is small
// stable algorithm due to "arr[i] > key"
// Best case t(n) = o(n), when input is sorted in increasing order, no shifts only comparison
// worst and average case t(n) = o(n^2)
// Adaptable and Inplace algo.
