package com.practice;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = scan.nextInt();

        System.out.println("Enter width: ");
        int width = scan.nextInt();

        float perimeter = 2 * (length + width);

        System.out.println("Perimeter of rectangle is:  " + perimeter);

    }
}
