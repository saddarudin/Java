/*
Create a java program to read input from user
using Scanner class. Get two inputs from user
one integer and other as String and then print
both on screen
 */
package com.java;
import java.util.Scanner;
class Input
{
public static void main(String[] args)
{
Scanner Scan = new Scanner(System.in);
System.out.println("Enter integer value");
int a = Scan.nextInt();
String s = Scan.nextLine();
    System.out.println("Integer: "+a);
    System.out.println("String: "+s);
}
}
