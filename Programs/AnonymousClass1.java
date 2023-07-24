package com.java;
/*
Create an interface I in which show method is declared
Now create an Anonymous class to call show method.
 */

interface I{
    void show();
}
public class AnonymousClass1 {
    public static void main(String[] args) {
        I i=new I() {
            @Override
            public void show() {
                System.out.println("Hi, This is Saddar U Din");
            }
        };
        i.show();
    }
}
