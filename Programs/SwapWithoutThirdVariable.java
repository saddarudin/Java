package com.java;
/*
Write a java program to swap two variables without creating third variable
 */
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("Before swapping: x ="+x+"  y=" +y);
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swapping x="+x+"  y="+y);
    }
}
