package com.oop;

public class HierarchicaInheritance {
    void parentShow(){
        System.out.println("This is parent class method");
    }
}
class Child1 extends HierarchicaInheritance{
    void child1Show(){
        System.out.println("This is child 1 class method");
    }
}
class Child2 extends HierarchicaInheritance{
    void child2Show(){
        System.out.println("This is child 2 class method");
    }
}
class HierarchiCaller{
    public static void main(String[] args){
        Child1 obj = new Child1();
        obj.child1Show();
        obj.parentShow();

        Child2 o = new Child2();
        o.child2Show();
        o.parentShow();
    }
}
