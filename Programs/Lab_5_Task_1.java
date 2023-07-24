/*
* 01. Create a class having 4 functions, add, sub, mul and div.
*  Each function accepts 2 parameters and returns the sum, difference,
*  multiplication and division of these numbers.

Create a main class having main function that uses the above class.*/
package com.java;
 class Operations {
    public int add(int a,int b)
    {
        return (a+b);
    }
    public int sub(int a,int b)
    {
        return (a-b);
    }
    public int mul(int a, int b)
    {
        return (a*b);
    }
    public double div(int a, int b)
    {
        return (a/b);
    }
}
class Lab_5_Task_1
{
    public static void main(String[] args) {
        Operations op= new Operations();
        System.out.println("Addition : "+op.add(4,5));
        System.out.println("Subtraction : "+op.sub(8,9));
        System.out.println("Multiplication: "+op.mul(4,9));
        System.out.println("Division: "+op.div(8,4));
    }
}
