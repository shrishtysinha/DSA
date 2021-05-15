package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 9, 7, 1, 0};
        System.out.println("Before Merge sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }
        System.out.println("");

        mergesort(arr, 0, arr.length);
        System.out.println("After Merge sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    public static void mergesort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        } else {
            int mid = start + ((end - start) / 2);
            mergesort(arr, start, mid);
            mergesort(arr, mid, end);
            merge(arr, start, mid, end);

        }


    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int temparr[] = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0; // traversing temporary array
        if (arr[mid - 1] <= arr[mid]) return;//array already sorted
        while (i < mid && j < end) {
            temparr[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + k, mid - i); // when remaining in left array
        System.arraycopy(temparr, 0, arr, start, k); // Actual copy
    }
}
