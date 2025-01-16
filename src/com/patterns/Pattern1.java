package com.patterns;

public class Pattern1 {
    protected void print(){
        int n = 5;
        int num = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(j + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 obj = new Pattern1();
        obj.print();
    }
}

