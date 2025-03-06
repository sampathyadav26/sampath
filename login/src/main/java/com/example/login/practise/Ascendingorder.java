package com.example.login.practise;

import java.util.Scanner;

public class Ascendingorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer arr[] = {2, 9, 8, 56, 4, 10};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
//        System.out.println(arr[i]);
        }
        System.out.print("Enter the K value:");
        int k = sc.nextInt();
//     System.out.println("-------------------");
//        for(int i=0;i<arr.leng]]]]]h;i++){
//            System.out.println(arr[i]);
//        }
//    }
        System.out.println(k+"th highest value is :"+arr[k-1]);
    }
}
