package com.practice;

import java.lang.module.Configuration;

    public class ConstructorExample {
        int age;
        String name;

        public ConstructorExample (){
             age = 5;
             name = "prasad";
        }
        public static void main(String[] args) {
            ConstructorExample obj = new ConstructorExample();
            System.out.println("Age is: " + obj.age + " Name is : " +obj.name);
        }
    }