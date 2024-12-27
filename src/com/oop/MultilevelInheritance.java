package com.oop;

public class MultilevelInheritance {
    void parentDisplay(){
        System.out.println("This is Parent class method");
    };
    int z = 9;
}
class One extends MultilevelInheritance{
    void mediatorDisplay(){
        System.out.println("This is mideator class method");
    }
    int x = 2;
}
class Two extends One{
    void childDisplay(){
        System.out.println("This is child class method ");
    }
    int y = 4;
}
   class Prasad {
    public static void main(String[] args){
        Two obj = new Two();
        obj.parentDisplay();
        obj.childDisplay();
        obj.mediatorDisplay();
        System.out.println(obj.y);
        System.out.println(obj.x);
        System.out.println(obj.z);
    }
}
