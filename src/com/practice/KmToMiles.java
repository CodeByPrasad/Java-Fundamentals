package com.practice;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in KM: ");
        int distance = scan.nextInt();

        double miles = distance * 0.621371;

        System.out.println("Distance in miles:  " +miles);

    }
}
