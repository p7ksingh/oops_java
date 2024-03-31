package com.arr.OOPs;

public class StaticChec {
    public static int num = 10;

    public static int getNum() {
        System.out.println(num);
        num = 20;
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(getNum());
    }
}
