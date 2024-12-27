package com.array;

public class ReverseArray {
    public static void main(String[] args){

        //String reverse

        String str = "prasad suryawanshi";
        String reverse = "";

        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        //Array reverse

//        int arr[] = {1,2,32,4};
//        int rev[] = new int[arr.length];
//int j = 0;
//        for(int i= arr.length-1; i>= 0; i--){
//             rev[j] = arr[i];
//             j++;
//        }
//        for (int i: rev) {
//            System.out.print(i+ " ");
//        }

    }
}
