package com.collections;

import java.util.Vector;

public class VectorList {
    public static void main(String[] args){

        Vector<Integer> vl = new Vector<Integer>();

        vl.add(0,2);
        vl.add(1,3);
        System.out.println(vl);
        System.out.println(vl.size());

    }
}
