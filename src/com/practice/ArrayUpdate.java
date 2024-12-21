package com.practice;

public class ArrayUpdate {
    public static void main(String[] args){

        int arr[] = {1,3,2,5,6};
        System.out.println("Before updation ");
        for (int i = 0; i< arr.length; i++){
            System.out.println(+arr[i]);
        }
        arr[4] = 8;
        System.out.print("After updation"+ "\n");
        for (int i = 0; i< arr.length; i++){
            System.out.println(+arr[i]);
        }
    }
}
