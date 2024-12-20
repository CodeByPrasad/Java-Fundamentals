package com.practice;

public class LogicalOperators {
    public static void main(String[] args){

        //there are 3 logical operators in java
        //AND, OR, NOT
        //& , |, !
        int a = 10;
        int b = 20;
        int c = 30;
        boolean d = false;
        if((a<b) && (b<c)){          //both conditions have true
            System.out.println("Greatest number is: " +c);
        } else {
            System.out.println("Wrong condition");
        }
            if ((a<b) || (b>c)){
                System.out.println("Greatest number is: " +c);
            } else {
                System.out.println("Wrong condition");
            }
                if (d == true){
                System.out.println("Value of D :" +d);
            } else {
                    System.out.println("Value of D after negate: " + !d);
        }
    }
}
