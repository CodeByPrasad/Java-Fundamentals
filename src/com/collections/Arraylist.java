package com.collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println("ELements of array list: " + al);
        System.out.println(al.get(1));
        al.remove(2);
        System.out.println("ELements of array after remove: " + al);
        int size = al.size();
        System.out.println("size of array list: " + size) ;
int j =0;
for (int i: al){
    System.out.println("element at index "+ j + " is: " + i);
}
    }
}
