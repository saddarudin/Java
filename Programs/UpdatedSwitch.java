/*
Write a program to print day of
week when user enters number from 1
to 7
Use enhanced switched case to perform this task
 */
package com.java;
import java.util.Scanner;

public class UpdatedSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String result;
        String day=scan.next();

        //Switch can return value
        result=switch (day){
            //arrow has replaced colon and break
            case "Saturday","Sunday"-> "I wake up at 7 am";
            default -> "I wake up at 6 am";
        };
        System.out.println(result);
    }
}
