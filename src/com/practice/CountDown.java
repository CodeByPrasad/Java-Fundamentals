package com.practice;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the counter");
        int counter = input.nextInt();

//        while(counter >= 1){
//            System.out.println(counter);
//            counter--;
//        }
        for (int i = counter; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Ready to launch rocket ");
    }
}
