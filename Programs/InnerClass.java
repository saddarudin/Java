/*
Write a java program to illustrate the concept of
inner class(nested class) create same method in both outer and inner class
 with different implementation
 */
package com.java;
class Outer{
    int a;
    public void show(){
        a=10;
        System.out.println("Value of a is: "+a);
    }
    static class Inner{
        int b;
        public void show(){
            b=10;
            System.out.println("Value of b is: "+b);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();
        Outer.Inner in=new Outer.Inner();
        in.show();
    }
}
