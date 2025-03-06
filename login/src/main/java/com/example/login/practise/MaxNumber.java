package com.example.login.practise;

public class MaxNumber {


    public static void main(String[] args) {

        Integer arr[] = { 12, 35, 2, 10, 34, 3 };
        int max=arr[0];
//        int temp = 0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
