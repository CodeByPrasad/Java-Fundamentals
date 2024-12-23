package com.practice;

import java.util.Scanner;

public class IsDivisibleByFive {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if ((num % 5) == 0){
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}
