package com.patterns;

public class DiamondPattern {
    public static void main(String[] args) {

        int a = 5;
//        int num = 1;
        for (int i = 1 ; i <= a; i++){ 
            for (int j = 1; j<= a-i; j++){
                System.out.print(" ");

//                num++;
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*" + " ");
            }

            System.out.println(" ");
        }
        for (int i = a-1 ; i >= 1; i--){
            for (int j = 1; j<= a-i; j++){
                System.out.print(" ");

//                num++;
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*" + " ");
            }

            System.out.println(" ");
        }
    }
}
