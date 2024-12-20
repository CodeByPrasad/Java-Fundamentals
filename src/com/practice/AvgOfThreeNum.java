package com.practice;

import java.util.Scanner;

public class AvgOfThreeNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number:  ");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter 3rd number: ");
        int num3 = scan.nextInt();

        float avg = (num1 + num2 + num3) / 3;

        System.out.println("Average of 3 numbers is:   " +avg);

    }
}
