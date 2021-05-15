package com.company;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int arr[] = {1, 6, 9, 4, 2};
		System.out.println("Before Selection sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");

		}
		System.out.println();
		//int i ;
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			//int flag = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {// saving one swap

					swap(arr, i, min);
				}

			}
		for(int i = 0 ; i< arr.length;i++){
			System.out.print(arr[i]+",");
		}

		}

		public static void swap( int arr[], int i, int j){
			int temp;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

// minimum no. of swaps even in worse case
// T(n) , best, average, worst = o(n^2) i.e not adaptable
//In place sorting algorithm
//  not stable algorithm
//  {2#,5,7,3,9,2*,1} -> {1,5,7,3,9,2*,2#} -> {1,2*,7,3,9,5,2#}