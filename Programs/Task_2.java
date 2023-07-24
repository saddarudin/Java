/*
Write a java program to declare and initialize
a double variable with a value such as 50.25.
Then retrieve the integral part andfraction part.
Display actual number, integral part and fraction part*/

package com.java;
class Task_2
{
public static void main(String[] args)
{
double num = 50.25;
System.out.println("Actual number is: "+num);
int num1 = (int)num;
System.out.println("Integer part is: "+num1);
num -= num1;
System.out.print("Fractional part is: "+num);
}
}