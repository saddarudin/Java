/*
Enter a double value and separate its integral
and fractional part and print on screen*/
package com.java;
import java.util.Scanner;
class Float
{
public static void main(String[] args)
{
double b;
Scanner scan=new Scanner(System.in);
System.out.println("Enter any float value");
b=scan.nextDouble();
int c=(int)b;
double f=b-c;
System.out.println("Integer part is: "+c);

System.out.println("Float part is: "+f);
}
}