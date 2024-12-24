package com.practice;

class Main{
    int x;
    public void setInt(int y){
        x = y;
    }
    public int getInt(){
        System.out.println("number is : " +x);
        return x;
    }
}
public class EncapsulationExample {
    public static void main(String[] args){
        Main obj = new Main();
        obj.setInt(5);
        obj.getInt();
    }
}
