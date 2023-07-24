/*
* 05. Create a new InvalidPasswordFormatException
* which throws an exception on following scenarios:
i. Password is less than 8 characters.
* ii. Password has Asterisk(*).*/
package com.java;
import java.util.Scanner;
class InvalidPasswordFormatException extends Exception
{
    InvalidPasswordFormatException(String s)
    {
        super(s);
    }
}
public class Task_5 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Password of minimum 8 characters and maximum 15 characters: ");
        String pass;
        pass=scan.nextLine();
        try
        {
            if(pass.length()<8||pass.length()>15) {
                if(pass.contains("*"))throw new InvalidPasswordFormatException("Exception: Incorrect length and password contains" +
                        " * sign");
                throw new InvalidPasswordFormatException("Exception: Password must be 8 to 15 characters");
            }
            else if(pass.contains("*"))throw new InvalidPasswordFormatException("Exception: Password has * sign");
            System.out.println("You have entered correct password.");

        }catch(InvalidPasswordFormatException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
