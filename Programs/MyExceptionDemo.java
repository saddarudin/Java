/*
* 2. Write a java program which takes an input from the user
* if his/her age is less than 18 then throw a user defined exception.
* User defined exception class must include two methods of eligible and not eligible*/
package com.java;
import java.util.Scanner;
class MyException extends Exception{
    public void eligibleMethod()
    {
        System.out.println("You are eligible.");
    }
    public void notEligibleMethod()
    {
        System.out.println("You are ineligible");
    }
}
class MyExceptionDemo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.println("Enter your age: ");
        x=scan.nextInt();
        try
        {
            if(x<18)
                throw new MyException();


        }catch(MyException e)
        {
            e.notEligibleMethod();
        }
    }
}
