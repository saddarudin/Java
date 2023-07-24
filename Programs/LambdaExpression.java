package com.java;
interface Aa{
    void show();
    default void add(){
        System.out.println("Hello");
    }
}

public class LambdaExpression {

    public static void main(String[] args) {
        Aa a=()->{
            System.out.println("Hi Saddar");
            System.out.println("This is coding with sdb");
        };
        a.show();
        a.add();
    }
}
