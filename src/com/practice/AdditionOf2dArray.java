package com.practice;

import java.util.Scanner;

public class AdditionOf2dArray {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int arr1[][] = new int[2][];
        int arr2[][] = new int[2][];
        int res[][] = new int[2][];

        for (int i = 0; i< arr1.length; i++){
            System.out.println("Enter size of array: ");
            int size = input.nextInt();

            arr1[i] = new int[size];
            for (int j = 0; j< arr1[i].length; j++){
                System.out.println("Enter element at index:" +i + j);
                int element = input.nextInt();
                arr1[i][j] = element;
            }
        }
        for (int i = 0; i< arr2.length; i++){
            System.out.println("ENter array size: ");
            int s = input.nextInt();
            arr2[i] = new int[s];
            for (int j= 0; j< arr2[i].length; j++){
                System.out.println("Enter array element at index: " +i + " " +j);
                int element = input.nextInt();
                arr2[i][j] = element;
            }
        }
        for (int i = 0; i< res.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                System.out.println("Arrays size not matching");
            }
            res[i] = new int[arr1[i].length];
            for (int j = 0; j < res[i].length; j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
