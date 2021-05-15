package com.company;

//Bubble sort without flag, t(n) = o(n^2)
/*public class Main {

    public static void main(String[] args) {
        int i , j;
        int arr [] = { 1,7,-1,2,3,8};
        System.out.println("Before Sorting");
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");


        }
        System.out.println("");
        for(i=0;i<arr.length-1;i++) { // Each Pass runs n-1 times
            for(j=0;j<arr.length-(i+1);j++) { // After every pass this will reduce 'i+1' times since i starts from 0
                if(arr[j] > arr [j+1]){ // stable algorithm > not >=
                    swap(arr , j , j+1);
                }
            }
        }
        System.out.println("After sorting");
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+ ",");

        }
        System.out.println("");


    }
    public static void swap(int arr[], int i , int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

    //Bubble sort with flag, t(n) = o(n^2)
    // If array is presorted or adaptable then reduce then don't wasting running through all pass
    // T(n) = o(n)
    public class Main {

        public static void main(String[] args) {
            int i , j;
            int flag = 0;
            int arr [] = { 1,7,-1,2,3,8};
            System.out.println("Before Sorting");
            for(i=0;i<arr.length-1;i++){
                System.out.print(arr[i]+",");


            }
            System.out.println("");
            for(i=0;i<arr.length-1;i++) { // Each Pass runs n-1 times
                for(j=0;j<arr.length-(i+1);j++) { // After every pass this will reduce 'i+1' times since i starts from 0
                    if(arr[j] > arr [j+1]){
                        swap(arr , j , j+1);
                        flag = 1;
                    }
                }
                if(flag == 0)
                    break;
            }
            System.out.println("After sorting");
            for(i=0;i<arr.length-1;i++){
                System.out.print(arr[i]+ ",");

            }
            System.out.println("");


        }
        public static void swap(int arr[], int i , int j)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}
 //Bubble sort : Stable, adaptable , Inplace