package com.java;

public class ManualSubtract {
    public static int subtract(int a,int b){
        while (b!=0){
            int borrow=(~a)&b;
            a=a^b;
            b=borrow<<1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(subtract(-5,5));
    }
}
