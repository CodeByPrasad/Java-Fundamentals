package com.practice;

public class InheritanceExample {
    int x = 2;
   public void display(){
        System.out.println("Hello welcome");
    }
}
class MyClass extends InheritanceExample{
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.display();
        System.out.println(obj.x);;
    }
}
