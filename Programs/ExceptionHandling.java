/*
* Write a java program in which exception is handled
* if number is divided by zero and print the exception name.*/
package com.java;
import  java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        int y;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x=scan.nextInt();
        try{
            y=(9/x);
            System.out.println("Division of two numbers is: "+y);}
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }}