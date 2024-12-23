package com.practice;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args){

        int arr[][] = new int [3][];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter size of array:" );
            int size = input.nextInt();

            for (int j = 0; j< arr[i].length; j++){
                System.out.println("Enter array element at index" + i + j + ": ");
                int element = input.nextInt();
            }

        }
    }
}
