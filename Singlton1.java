package com.arr.OOPs;

public class Singlton1 {
    private static Singlton1 instance = null;

    private Singlton1() {

    }

    public static Singlton1 getInstance() {
        if (instance == null) {
            instance = new Singlton1();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singlton1 s1 = getInstance();
        Singlton1 s2 = getInstance();
        System.out.println(s1.hashCode() + "====" + s2.hashCode());

    }
}
