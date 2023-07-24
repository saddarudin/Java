/*Write a java program that takes the table, starting and 
ending point of the table and prints the output in the following way:
Enter starting point: 3
Enter ending point: 5
Enter table number: 5
5*3=15
5*4=20
5*5=25
*/
package com.java;
import java.util.Scanner;

class Table
{

public static void main(String args[])
{
  int start, end, x;
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter starting point: ");
  start = scan.nextInt();
  System.out.println("Enter ending point: ");
  end=scan.nextInt();
  System.out.println("Enter table number: ");
  x=scan.nextInt();
for(int i=start; i<=end; i++)
System.out.println(x+"*"+i+" = "+i*x);
}
}