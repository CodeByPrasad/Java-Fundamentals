package com.oop;

public class PolymorphismExample {
    public void Addition(){
        int x = 2;
        int y = 2;
        int z = x + y;
        System.out.println(z);
    }
    public void Addition(int x, int y){
        int z = x + y;
        System.out.println(z);
    }
    public int Addition(int a, int b, int c){
        int d = a + b + c;
        return d;
    }
    public void Addition(String a, String b){
        System.out.println( a + " " +b );
    }
}
 class MainClass{
    public static void main(String[] args){
        PolymorphismExample obj = new PolymorphismExample();
        obj.Addition();
        obj.Addition(2,2);
        System.out.println(obj.Addition(2,3,4));
        obj.Addition("prasad", "Suryawanshi");
    }
}
