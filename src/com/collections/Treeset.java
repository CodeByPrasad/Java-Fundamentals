package com.collections;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args){

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(3);
        System.out.println(ts);
        ts.add(2);
        ts.add(1);
        System.out.println(ts);
    }
}
