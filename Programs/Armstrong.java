package com.java;
import java.util.Scanner;
/*
An Armstrong number of three digits is an integer such that
the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
Write a program to ask user to provide a three-digit number
and check the provided number is Armstrong number or not.
 */

public class Armstrong {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int a=scan.nextInt();
        int first,second,third,x;
        x=a%100;
        first=(a-x)/100;
        if(x<10)
        {second=0;third=x;}
        else {third=x%10;
            second=(x-third)/10;}
        if((first*first*first)+(second*second*second)+(third*third*third)==a) System.out.println("It is Armstrong number.");
        else System.out.println("It is not an Armstrong number.");

    }
}