/*
* 03. Create a new user-defined exception if
* the user inputs value in negative integer.*/
package com.java;
import java.util.Scanner;

class NegativeIntException extends Exception
{
    NegativeIntException(String s)
    {
        super(s);
    }
}
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int x=scan.nextInt();
        try
        {
            if(x<0)throw new NegativeIntException("Exception: Please provide positive integer.");
            System.out.println("You entered: "+x);
        }catch(NegativeIntException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
