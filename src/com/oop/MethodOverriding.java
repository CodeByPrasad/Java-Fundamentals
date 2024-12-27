package com.oop;

public class MethodOverriding {
    void display(){
        System.out.println("Parent method");
    }
}
 class Child extends MethodOverriding{
    void display(){
        System.out.println("Childs Method");
    }
    public static void main(String[] args){
        MethodOverriding o = new MethodOverriding();
        o.display();

        Child obj = new Child();
        obj.display();
    }
}
