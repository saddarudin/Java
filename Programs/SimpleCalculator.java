/*
Create a simple calculator in java having four basic operations
 */
package com.java;
import java.util.Scanner;
public class SimpleCalculator
{
  public static void main(String[] args)
  { 
    Scanner scan = new Scanner(System.in);
    int x,y;
    char ch;
    System.out.println("Enter first number: ");
    x = scan.nextInt();
    System.out.println("Enter operation(+, -, *, /): ");
    ch = scan.next().charAt(0);
    System.out.println("Enter second number: ");
    y = scan.nextInt();
    switch (ch) {
      case '+' -> System.out.println(x + "+" + y + "=" + (x + y));
      case '-' -> System.out.println(x + "-" + y + "=" + (x - y));
      case '*' -> System.out.println(x + "*" + y + "=" + (x * y));
      case '/' -> {
        if (y == 0)System.out.println("Division by zero is not permissible!");
        else
          System.out.println(x + "/" + y + "=" + (x / y));
      }
      default -> System.out.println("Incorrect Input");
    }
  }
}