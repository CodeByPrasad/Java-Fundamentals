package com.oop;

class EncapsulationExample {
    int x;
    public void setInt(int y){
        x = y;
    }
    public int getInt(){
        System.out.println("number is : " +x);
        return x;
    }
}
  class Main {
    public static void main(String[] args){
        EncapsulationExample obj = new EncapsulationExample();
        obj.setInt(5);
        obj.getInt();
    }
}
