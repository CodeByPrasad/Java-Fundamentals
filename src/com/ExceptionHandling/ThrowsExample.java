package com.ExceptionHandling;

public class ThrowsExample {
    static void validateAge(int age) throws Exception {
      if (age < 18){
          throw new Exception("Cant give access to age below 18");
      }
        System.out.println("Access granted !");
    }
    public static void main(String[] args) throws Exception {
        validateAge(18);
    }
}
