package com.array;

import java.util.Scanner;

public class DuplicateArrayElements {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int arr[] = new int[7];

        System.out.println("Enter array elements:");
        for (int i = 0; i<arr.length; i++){
            int element = input.nextInt();
            arr[i] = element;
        }
        for (int i = 0; i<= arr.length; i++){
            for (int j = i + 1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate array elements " +arr[i]);
                }
            }
        }
    }
}
