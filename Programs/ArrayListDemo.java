/*
Create an object of ArrayList add some numeric values
and print them
 */
package com.java;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(9);
        //we cannot add other data type now for example l.add("5");
        for (Integer i:l) System.out.println(i);
    }
}
