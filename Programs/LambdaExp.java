/*
Write a java code to create an interface having show method
and then call this show method in main method using
lambda expression
 */
package com.java;
interface I1{
    void show();
}
public class LambdaExp {
    public static void main(String[] args) {
        I1 i=()-> System.out.println("Hi, I am here!");
        i.show();
    }
}
