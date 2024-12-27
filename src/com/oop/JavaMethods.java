package com.oop;

public class JavaMethods {
    static void myMethod(){
        System.out.println("Hello This is a 1st method");
    }
    static void person(String name, int age){
        System.out.println("Name: " +name + "\n"+"Age: " +age);
    }
    static int sum(int num){
        return 5 + num;
    }
    void student(){
        System.out.println("Im a it student");
    }
    public static void main(String[] args){
        JavaMethods obj = new JavaMethods();
        myMethod();  //method calling
       obj.student();
        person("Prasad", 24); //parameterised method
        System.out.println("Sum is: " + sum(5));
    }
}
