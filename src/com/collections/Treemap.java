package com.collections;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args){

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1,"A");
        tm.put(2,"B");
        tm.put(3,"C");

        System.out.println(tm);

        for (Integer i: tm.keySet()){
            System.out.println("Key: " + i + " Value: " +tm.get(i));
        }
    }
}
