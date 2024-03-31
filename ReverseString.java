package com.arr.OOPs;

public class ReverseString {

    public static void getReverse() {
        String str = "hellopankaj";
        char ch;
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverse = ch + reverse;

        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        getReverse();
    }
}
