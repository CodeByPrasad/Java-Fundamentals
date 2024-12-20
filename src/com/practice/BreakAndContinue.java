package com.practice;

public class BreakAndContinue {
    public static void main(String[] args){

        for (int i = 0; i<= 10; i++){
            if (i == 5){
               break;
            } else if (i==2) {
                continue;
            }
            System.out.println(i);

        }
    }
}
