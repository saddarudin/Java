/*
* 02. Throw and catch Arithmetic, ArrayIndexOutOfBond
* and NullPointerException.*/
package com.java;
import java.util.Scanner;
public class Task_21 {
    public void arithmetic(int y)
    {
        System.out.println(9+"/"+y+"="+(9/y));
    }
    public void array(int y)
    {
        int[] arr={1,2,3,4,50};
        System.out.println("At index "+y+": "+arr[y]);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Task_21 t=new Task_21();
        try
        {
            System.out.println("Arithmetic exception handling. ");
            System.out.println("Enter any integer: ");
            int y=scan.nextInt();
            if(y==0)throw new ArithmeticException();
            t.arithmetic(y);
        }catch(ArithmeticException e)
        {
            System.out.println("Exception: Division by zero\n");
        }
        try
        {
            System.out.println("ArrayIndexOutOfBound Exception handling");
            System.out.println("Enter any integer: ");
            int y=scan.nextInt();
            if(y>4 || y<0)throw new ArrayIndexOutOfBoundsException();
            t.array(y);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception: Array index out of bound\n");
        }

        String str=null;
        try
        {
            System.out.println("Null Pointer Exception Handling");
            throw new NullPointerException();
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception: Variable is never defined");
        }
    }
}
