package com.collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){

        LinkedList<String> LL = new LinkedList<String>();

        LL.add("Prasad");
        LL.add(1, "Shivaji");
        LL.add("Suryawanshi");

        System.out.println("Linked list elements: " + LL);
        LL.remove(1);
        System.out.println("Linked list elements after remove: " + LL);
        System.out.println("Size of linked list is : " + LL.size());
        LL.addLast("Patil");
        LL.addFirst("Samrat");
        LL.push("Developer");
        LL.pop();
        System.out.println(LL.peek());
        for (String i: LL){
            System.out.print(i + " ");
        }

    }
}
