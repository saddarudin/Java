package com.java;
/*
Write a java code that define radius for a circle and 
print the circumference, diameter and area for the circle*/

import java.util.Scanner;

class Circle
{
public static void main(String[] args)
{
Scanner scan= new Scanner(System.in);
System.out.println("Enter radius of circle: ");
float r1=scan.nextFloat();
System.out.println("\nCircumference of circle is: "+(2*3.142*r1));

System.out.println("\nDiameter of circle is: "+(2*r1));

System.out.println("\nArea of circle is: "+(3.142*r1*r1));
}
}