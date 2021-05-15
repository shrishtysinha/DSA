package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {25, 5, 2, 18, 26, 0, 2, 29, 1, 28, 20};
        System.out.println("Before quick sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }
        System.out.println();
        int low= 0;
        int high = arr.length-1;
        quicksort(arr,low,high);
        System.out.println("After quick sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }

    }
     public static void quicksort(int [] arr , int low , int high){
        if(low<high) {
            int k = partition( arr , low, high); // determine the pivot index. After every partition pivot will be in sortec correct order
            quicksort(arr,low,k-1);
            quicksort(arr,k+1,high);
        }


     }

     public static int partition(int[] arr, int low , int high) {

        int pivot = arr[high]; // when pivot is the last element of  or A[high]
        int i = low - 1; // starting i from -1
         for( int j= low ; j<= high-1; j++){
             if(arr[j] < pivot){ // stablity has nothing to do with < or <=
                 i=i+1;
                 if(i!=j){
                     swap(arr , i, j);
                 }
             }
         }

         swap(arr, i+1 , high); // Pivot index index in sorted array would be i+1
         return i+1; // return the pivot index

     }

     public static void swap ( int[]arr ,int i , int j){
        int k;
        k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;

     }
}

// quick sort is not stable
// quick sort is inplace
// adaptable
// average and best case , t(n) = o(nlogn)
// worst case complexity t(n) = o(n^2)
// Randomized quick sort , best , wors, average , T(n) = o(nlogn)
// quick sort makes use of "tail recursion" which makes effective use of implicit cache memory

// worst cases:  pivot is a[high] or a[low] ,When problem is not divided into two subproblem
// when in each pass pivot comes out smallest or largest element of array
// case 1 : When array is increasingly sorted
// case 1 : When array is decreasingly sorted

// best case : when array is already sorted and pivot is selcted as middle element