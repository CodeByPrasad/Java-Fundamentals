package com.practice;

import java.util.Arrays;

public class ZeroSorting {
    public static void main(String[] args) {

        int arr[] = {0,2,4,0,0,54,0,8,7,0,2,0};
int n = arr.length;
int j = n - 1;
int res[] = new int[n];

        for (int i = j; i >= 0; i--){
            if (arr[i] != 0){
                res[j] = arr[i];
                j--;
            }
        }
        while (j >= 0){
            res[j] = 0;
            j--;
        }
        System.out.println("sorted array:" + Arrays.toString(res));
    }
}
