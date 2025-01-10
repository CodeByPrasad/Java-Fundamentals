package com.ExceptionHandling;

public class UserDefinedException extends Exception {
    public UserDefinedException(String msg){
        super(msg);
    }
}
 class UserException {
     public static void validateAge(int age) throws UserDefinedException {
         if (age < 18){
             throw new UserDefinedException("age less than 18");
         }
         System.out.println("access granted");
     }

     public static void main(String[] args) {
        try {
            validateAge(19);
        } catch (UserDefinedException e){
            e.printStackTrace();
        }
     }
}
