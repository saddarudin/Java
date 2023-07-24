package com.java;
/*
Write an example of anonymous class Test having show method
 */
class Test{
    public void show(){
        System.out.println("Class B");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Test a=new Test(){
            public void show(){
                System.out.println("Anonymous Class");
            }
        };
        a.show();
    }
}
