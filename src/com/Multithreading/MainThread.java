package com.Multithreading;

 class Task1 extends Thread {
    public void run() {
        System.out.println("This code is running in task 1");
        for (int i = 1; i <= 5; i++){
            System.out.println("Task 1: " + i);
        }
    }
}
 class Task2 extends Thread {
    public void run(){
        System.out.println("This code is running in task 2");
        for (int i = 1; i <= 5; i++){
            System.out.println("Task 2: " + i);
        }
    }
}
 
class
MainThread {
    public static void main(String[] args) {
        Task1 thread1 = new Task1();
        Task2 thread2 = new Task2();
        thread1.start();
        thread2.start();
        System.out.println("This code is outside of the thread");
    }
}

