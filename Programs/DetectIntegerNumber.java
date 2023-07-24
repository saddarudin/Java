/*
Write a program in java to get a number from user and
check weather given number is integer or not.
Hint: Use .contains method of String class
 */
package com.java;
import java.util.Scanner;

public class DetectIntegerNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num=scan.next();
        if(num.contains(".")) System.out.println("It is not an integer number");
        else System.out.println("It is integer number");
    }

}
