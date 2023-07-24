/*04. Write a java program which takes an input
from the user if his/her age is less than 18 then
throw a user defined exception. User defined
exception class must include two methods of
eligible and not eligible. */
package com.java;
import  java.util.Scanner;
class UserDefinedException extends Exception{
    public void eligible()
    {
        System.out.println("You are eligible");
    }
    public void notEligible()
    {
        System.out.println("You are ineligible");
    }
}
public class Task_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        UserDefinedException ude=new UserDefinedException();

        try{
            int x=scan.nextInt();
            if(x<18)
                throw new UserDefinedException();
            ude.eligible();
        }
        catch(UserDefinedException e)
        {
            e.notEligible();
        }
    }
}