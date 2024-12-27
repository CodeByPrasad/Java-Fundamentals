package com.oop;

abstract class AbstractClass {
    public abstract void show();
    void display(){
        System.out.println("This is abstract class method");
    }
}
class AbstractChild extends AbstractClass{
    public void show(){
        System.out.println("This is abstract method of abstract class");
    }
    public void show1(){
        System.out.println("This is child clas method");
    }
}
class AbstractCaller{
    public static void main(String[] args){
        AbstractChild obj = new AbstractChild();
        obj.show();
        obj.display();
        obj.show1();
    }
}