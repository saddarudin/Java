package com.java;
import java.util.Scanner;
/*
Write a program in java in which create an integer array of size 5
ask user to provide five integer values store those values in array
and print all the values entered by the user
 */

class Array
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter 5 integer values: ");
        for(int i=0; i<5; i++) arr[i]=sc.nextInt();
        System.out.println("You entered the following values: ");
        for(int i=0; i<5; i++)
            System.out.println(arr[i]);
    }
}