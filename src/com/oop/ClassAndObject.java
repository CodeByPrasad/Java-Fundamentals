package com.oop;

public class ClassAndObject {                       // com.practice.Main class
void display(){                                     //class method
    System.out.println("This is class method");
}
    public static void main(String[] args){        //main method where objects created and method called
        ClassAndObject obj = new ClassAndObject(); //object creation
        obj.display();                            // Method Calling
    }
}
