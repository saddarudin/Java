/*
Create a user defined exception named IncorrectInput
that throws exception. Exception message should be
like: "Input is character" if user enters a single character
or "Input is floating" if user enters floating number
 */
package com.java;
import java.util.Scanner;
class IncorrectInput extends Throwable
{
    IncorrectInput(String s)
    {
        super(s);
    }
}

public class Lab_7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter character or float number: ");
        String str=scan.nextLine();
        int l = str.length();
        try {
            if (l == 1) {
               throw new IncorrectInput("Input is character");
            } else if (str.contains(".")) {
                throw new IncorrectInput("Input is float");
            }
        }catch (IncorrectInput e)
        {
            System.out.println(e.getMessage());
        }
    }
}
