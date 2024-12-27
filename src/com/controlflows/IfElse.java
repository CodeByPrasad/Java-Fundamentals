package com.controlflows;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter students grade:" );
        int grade = input.nextInt();

        if (grade > 70){
            System.out.println("Student is pass with extension");
        } else if(grade >= 35) {
            System.out.println("Student is pass with: " +grade);
        } else {
            System.out.println("Student is fail");
        }
    }
}
