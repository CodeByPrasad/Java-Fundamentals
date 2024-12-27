package com.basic;

 class JavaVariables {
     //global area
     int a = 10;   //global variable

    public static void main(String[] args) {
        int c = 30;
        JavaVariables obj = new JavaVariables();
        obj.display();
    }
     void display(){
         int b = 20;  //local variable
         System.out.println(b);
         System.out.println(a);
     }
}


