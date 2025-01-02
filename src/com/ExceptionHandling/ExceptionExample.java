package com.ExceptionHandling;

public class ExceptionExample {

    public static void main(String[] args) throws Exception {

            try{
                int i = 10 / 2;
                System.out.println(i);
                int arr[] = {1,2,4,3,5};
                for (int j: arr){
                    System.out.println(arr[5]);
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Array length is exceeded: " + e.getMessage());
            }
            catch (ArithmeticException e){
                System.out.println("Cant divide by zero" + e.getMessage());
            }
                finally {
                System.out.println("Execute anyhow");
            }
    }
}
