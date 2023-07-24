/*
* 3.Develop a java program that takes 5 floating numbers as runtime arguments
* and print their total sum and average.*/
package com.java;
public class Lab_6_Task_3 {
    public static void main(String[] args) {
        double arr[]={0,0,0,0,0,};
        double a=0;
        for(int i=0; i<args.length; i++)
        {
            arr[i]=Double.parseDouble(args[i]);
        }
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
            a+=arr[i];
        }
        System.out.println("Sum is: "+a);
        System.out.println("Average is "+(a/5));
    }
}
