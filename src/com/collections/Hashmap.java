package com.collections;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){

        HashMap<Integer , Integer> hm = new HashMap<>();

        hm.put(1,1);
        hm.put(3,3);
        hm.put(2,2);
        hm.put(4,5);
        System.out.println(hm);
        int x = hm.get(4);
        System.out.println(x);
        hm.clear();
        System.out.println(hm);
    }

}
