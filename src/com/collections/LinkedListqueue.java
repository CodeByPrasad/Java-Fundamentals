package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListqueue {
    public static void main(String[] args){

        Queue<String> lq = new LinkedList<>();

        lq.add("A");
        lq.add("B");
        lq.add("C");

        System.out.println(lq);

        for (String i: lq){
            System.out.println(i);
        }
    }
}
