package com.java;
public class FinalKeyword {
    private final int x=5;  //final instance variable
    private final static int y;  //final static variable
    static {y=4;}
    public void fun()
    {
       final int k; //final local variable
        k=2;
        System.out.println(k);
    }
    public static void main(String[] args) {
        FinalKeyword F=new FinalKeyword();
        System.out.println(F.x);
        System.out.println(FinalKeyword.y);
        F.fun();
    }
}
