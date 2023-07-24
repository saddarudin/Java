/*
* 2.Write a java program to demonstrate the concept of java runtime arguments.
* Input your name and roll number and print it on the console.*/
package com.java;
public class JavaRunTimeArguments {
    /*
    * The java command-line argument is an argument i.e.
    * passed at the time of running the java program.
    *The arguments passed from the console can be received
    * in the java program it can be used as an input.*/
    public static void main(String[] args) {
for(int i=0; i<args.length;i++)
    System.out.println(args[i]);
    }
}
