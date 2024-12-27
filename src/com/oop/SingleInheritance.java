package com.oop;

public class SingleInheritance {
    int x = 2;
   public void display(){
        System.out.println("Hello welcome");
    }
}
class MyClass extends SingleInheritance {
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.display();
        System.out.println(obj.x);;
    }
}
