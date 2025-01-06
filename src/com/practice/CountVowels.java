package com.practice;

public class CountVowels {
    public static void main(String[] args) {
        int vc = 0;
        int cc = 0;
        String s = "Suryawanshi";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vc++;
            } else {
                cc++;
            }
        }
        System.out.println("vowels: " +vc);
        System.out.println("consonants: " +cc);
    }
}
