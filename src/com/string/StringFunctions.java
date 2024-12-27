package com.string;

public class StringFunctions {
    public static void main(String[] args){

        String str = "prasad";  //String literal enclosed within double qoaute and saved in String pool
        String name = new String("prasad"); //String with new keyword saved in heap memory

        //string functions

        str = str.toUpperCase();
        str = str.toLowerCase();

        str = str.concat(" Suryawanshi");

        int size = str.length();
        System.out.println(size);

        boolean isAvailable = str.contains("prasad");
        System.out.println(isAvailable);

        int isSame = str.compareTo("samrat");
        System.out.println(isSame);

        System.out.println(str.contains("p"));
        System.out.println(str);

    }
}
