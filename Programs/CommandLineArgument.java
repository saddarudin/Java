package com.java;
/*
Write a java program to pass argument through command line and
calculate the sum of the values passed and print that some.
 */
public class CommandLineArgument {
    public static void main(String[] args) {
        int a=0;
        for (String arg : args) a += Integer.parseInt(arg);
        System.out.println("Sum is "+a);
    }
}