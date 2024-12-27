package com.oop;

interface FirstInterface{
    public void firstMethod();
}
interface SecondInterface{
    public void secondMethod();
}
public class Interface implements FirstInterface, SecondInterface{
   public void firstMethod(){
       System.out.println("This is first interface method");
   }
   public void secondMethod(){
       System.out.println("This is second interface method");
   }
   public static void main(String[] args){
       Interface obj = new Interface();
       obj.firstMethod();
       obj.secondMethod();
   }
}
