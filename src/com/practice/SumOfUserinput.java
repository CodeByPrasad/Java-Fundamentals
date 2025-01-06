package com.practice;

import java.util.Scanner;

public class SumOfUserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = input.nextInt();
        double total = 0.0;
        while(num != 0){
            total += num;
            System.out.println("Enter next number:");
            num = input.nextDouble();
        }

        System.out.println("Total: " + total);
    }
}
