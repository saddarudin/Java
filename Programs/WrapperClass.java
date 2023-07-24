/*
Write a java program that converts string into
numbers use wrapper classes. Give values manually
in the form of String
 */
package com.java;
public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper class valueOf()
        Integer i1=Integer.valueOf("125");
        Double d1=Double.valueOf("2.54");
        //Wrapper class parseAbc()
        int i2=Integer.parseInt("123");
        double d2=Double.parseDouble("2.57");
        //Wrapper class abcValue()
        int c=i1.intValue();
        System.out.println(i1+"\n"+d1+"\n"+i2+"\n"+d2+"\n"+c);
    }
}
