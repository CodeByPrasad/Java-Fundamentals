package com.array;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args){

        int[][] arr = new int[3][];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            arr[i]= new int[size];
            for(int j= 0 ;j<arr[i].length;j++)
            {
                System.out.print("enter the element at: "+ i+" "+j );
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0 ;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

//        [1,2,3],
//        [5,5],
//        [6,7],
//        [8,9]]
    }
}
