package com.practice;

import java.util.Scanner;

public class ArrayDeclaration {
    public static void main(String[] args) {

        //array declaration
        int[] numbers;
        int num[];
        String[] names;

        //Array initialization
        int[] nums = {1, 2, 3, 4};
        int n[] = {2, 3, 4};
        String[] cars = {"Jaguar", "Mercedes", "BMW", "Lexus"};

        System.out.println("1st element of array nums: " + nums[0]);
        System.out.println("2nd element of array n: " + n[1]);
        System.out.println("3rd element of array cars: " +cars[2]);
    }

}
