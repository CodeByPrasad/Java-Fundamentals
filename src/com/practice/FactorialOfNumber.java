package com.practice;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int num = in.nextInt();
        int fact = 1;
        long temp = num;
        if (num < 0){
            System.out.println("enter pos num");
        } else {
            while(temp > 0){
                fact *= temp;
                temp--;
            }
        }
        System.out.println("Factorial of " + num+ " is " + fact);
    }
}
