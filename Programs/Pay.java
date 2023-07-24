package com.java;

import java.util.Scanner;

/*
Write a program that calculates how much a person would earn over a period of
time if his or her salary is one rupee the first day and two rupees the
second day and continues to double each day. The program should ask the user
for the number of days. Display a table showing how much the salary was for
each day , and then show the total pay at the end of the period. The output should
be displayed in a hundred or a thousand amount not the number of rupees.
Do not accept the number less than one for the no of days worked
 */
public class Pay {
    public Pay(int days){
        if(days<1)throw new IllegalArgumentException("Number must be greater than 0");
        double salary=0.5;
        for(int i=1;i<=days;i++){
            salary*=2;
            System.out.println("Day "+i+": "+(salary/100)+" hundred rupees");
        }
        System.out.println("Total salary: "+(salary/100)+" hundred rupees");
    }

    public static void main(String[] args) {
        System.out.println("Enter number of days worked: ");
        Scanner scan=new Scanner(System.in);
        int days=scan.nextInt();
        new Pay(days);
    }
}
