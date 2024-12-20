package com.practice;

public class FindRemainingPens {
    public static void main(String[] args){

        int totalPens = 14;
        int totalStudents = 3;

        int penPerStud = totalPens / totalStudents;
        int reamainingPens = totalPens % totalStudents;

        System.out.println("The pen per student is " + penPerStud + " and the remaining pen not distributed is " + reamainingPens);

    }
}
