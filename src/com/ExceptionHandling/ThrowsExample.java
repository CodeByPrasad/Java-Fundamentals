package com.ExceptionHandling;

public class ThrowsExample {

    static void validateAge(int age) throws ArithmeticException {
      if (age < 18){
          throw new ArithmeticException("Cant give access to age below 18");
      }
        System.out.println("Access granted !");
        int arr[] = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
        if (arr.length < 6) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }

    public static void main(String[] args) throws Exception {
        try{
            validateAge(19);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
