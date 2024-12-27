package com.practice;

import java.util.Scanner;

public class FindGreatestOf3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greatest");
        } else if (num2 > num3){
            System.out.println(num2 + " is greatest");
        }
        else {
            System.out.println(num3 + " is greatest");
        }
    }
}
