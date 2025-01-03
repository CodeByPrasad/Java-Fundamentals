package com.Multithreading;

 class Thread1 extends Thread{
    public void run(){
        System.out.println("Running in thread 1");
    }
}
class Thread2 implements Runnable{
     public void run(){
         System.out.println("Running in thread 2");
     }
}
public class RunnableExample {
    public static void main(String[] args) {
        Thread ob = new Thread(new Thread1());
        Thread obj = new Thread(new Thread2());
        ob.start();
        obj.start();
    }
}
