package com.java;

/*
Create a calculator class in java that performs four operations
addition, subtraction, multiplication and division on two variables
(create method for each operation)
Make setter functions that set values of both variable and make two objects
of calculator class and perform all operations on both objects and print the
results.
 */
public class Calculator {
    private double a;
    private double b;
    public void setA(double a)
    {
       this.a=a;
    }
    public void setB(double b)
    {
        this.b=b;
    }
    public double add()
    {
        return (a+b);
    }
    public double subtract()
    {
        return (a-b);
    }
    public double multiply()
    {
        return (a*b);
    }
    public double divide()
    {
        return (a/b);
    }
}
class CalculatorDemo
{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.setA(7);
        c1.setB(5);
        System.out.println("\nThis is first object\n\n");
        System.out.println("Addition of two numbers is: "+c1.add());
        System.out.println("Subtraction of two numbers is: "+c1.subtract());
        System.out.println("Multiplication of two numbers is: "+c1.multiply());
        System.out.println("Division of two numbers is: "+c1.divide());
        System.out.println("\nThis is second object\n\n" );
        Calculator c2=new Calculator();
        c2.setA(4);
        c2.setB(9);
        System.out.println("Addition of two numbers is: "+c2.add());
        System.out.println("Subtraction of two numbers is: "+c2.subtract());
        System.out.println("Multiplication of two numbers is: "+c2.multiply());
        System.out.println("Division of two numbers is: "+c2.divide());


    }
}
