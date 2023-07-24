/*
Write  a java program that prints the
factorial of any positive number (use loop). It throws
an exception when negative number is provided
 */
package com.java;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input any positive integer: ");
        int a=scan.nextInt();
        if(a<0)throw new IllegalArgumentException("Provide only positive numbers!");
        int b=1;
        for(int i=a; i>0; i--) b=b*i;
        System.out.println("It's factorial is "+b);
    }
}