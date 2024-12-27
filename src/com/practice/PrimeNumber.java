package com.practice;

import java.util.Scanner;

public class PrimeNumber {
        public static void main(String[] args){

//            Scanner input = new Scanner(System.in);
//
//            int arr1[][] = new int[3][];
//            int arr2[][] = new int[3][];
//
//
//            for (int i = 0; i< arr1.length; i++){
//                System.out.println("Enter size of array " + (i+1));
//                int size = input.nextInt();
//                arr1[i] = new int[size];
//            }
//            for (int i = 0; i< arr2.length; i++){
//                System.out.println("Enter size of array " + (i+1));
//                int size = input.nextInt();
//                arr2[i] = new int[size];
//            }
//            int sum[][]  = new int[arr1.length][arr1[0].length];
//
//            for(int i = 0; i< arr1.length; i++) {
//                for (int j = 0; j< arr1[i].length; j++){
//                    System.out.println("Enter element of array " + (i+1) );
//                    int element = input.nextInt();
//                    arr1[i][j] = element;
//                }
//            }
//            for(int i = 0; i< arr2.length; i++) {
//                for (int j = 0; j< arr2[i].length; j++){
//                    System.out.println("Enter element of array " + (i+1) );
//                    int element = input.nextInt();
//                    arr2[i][j] = element;
//                }
//            }
//            for (int i = 0; i< arr1.length; i++){
//                for (int j = 0; j< arr1[i].length; j++){
//                    sum[i][j] = arr1[i][j] + arr2[i][j];
//                }
//            }
//            for (int i = 0; i< arr1.length; i++){
//                for (int j = 0; j< arr1[i].length; j++){
//                    System.out.print(sum[i][j]+ " ");
//                }
//                System.out.println();
//            }


            //Prime number

//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter number: ");
//            int num = input.nextInt();
            int arr[] = {1,2,3,54,6,5};
            for (int i = 0; i< arr.length; i++){
                if (isPrime(arr[i])){
                    System.out.println(arr[i] + " is prime number");
                } else {
                    System.out.println(arr[i] + " is not prime number");
                }
            }

   }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
    }
}
