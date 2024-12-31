package com.collections;

import java.util.Stack;

public class StackList {
    public static void main(String[] args){

        Stack<String> sl = new Stack<>();

        sl.add("Prasad");
        System.out.println(sl);
        sl.add("Shivaji");
        System.out.println(sl);
        sl.push("Suryawanshi");
        System.out.println(sl);
        sl.pop();
        System.out.println(sl);
        System.out.println(sl.peek());
    }
}
