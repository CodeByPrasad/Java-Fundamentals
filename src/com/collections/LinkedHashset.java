package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args){

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(2);
        System.out.println(lhs);
        lhs.addFirst(1);
        System.out.println(lhs);
        lhs.add(3);
        System.out.println(lhs);
    }
}
