package com.practice;

public class ParameterisedConstructor {
    int age;
    String name;

    public ParameterisedConstructor(int x, String y ){
        age = x;
        name = y;
    }
    public static void main(String[] args){
        ParameterisedConstructor obj = new ParameterisedConstructor(24,"prasad");
        System.out.println("Age is: " + obj.age + " Name is: " +obj.name);
    }
}
