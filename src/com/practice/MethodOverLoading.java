package com.practice;

public class MethodOverLoading {
     static int sum(int a, int b){
        return a + b;
    }
     static double sum(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
int c = sum(2,2);
double d = sum(2.2,2.2);
        System.out.println("Addition of 2 int: " +c);
        System.out.println("Addition of 2 double: " +d);
    }
}
