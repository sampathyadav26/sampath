package com.example.login.practise;

public class LeftRotateArray {

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 1, 2};
         int d=3;

         int n=arr.length;
         int k=0;
         int temp[]=new int[n];
         for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
         }
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

         for(int i=0;i<n;i++){
             arr[i]=temp[i];
         }

        System.out.println("after rotating");

         for(int i=0;i<n;i++){
             System.out.println(arr[i]);
         }
    }
}
