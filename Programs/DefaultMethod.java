package com.java;
interface A{
    void show();
    default void print(){
        System.out.println("This is print method in A");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        A a=()->
                System.out.println("This is show method");
        a.show();
        a.print();
    }

}
