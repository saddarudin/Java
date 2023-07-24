package com.java;

import java.util.Scanner;

/*
Write a program that asks the user to enter the amount
that he or she has budgeted for a month. A loop should
then prompt the user to enter each for his or her
expenses for the month and keep a running total. When the
loop finishes, the program should display the amount that the
user is over or under budget.
 */
public class BudgetAnalysis {
    public BudgetAnalysis(double budget){
        if(budget<1)throw new IllegalArgumentException("Budget must be more than one rupee");
        double x;
        double amount=0;
        do {
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter your expense (or 0 to end): ");
            x=0;
            x=scan.nextDouble();
            amount+=x;
        }while (x!=0);
        if(amount>budget) System.out.println("The user is over budget ");
        else if (amount<budget) {
            System.out.println("The user is under budget");

        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter monthly budget: ");
        double z=scan.nextDouble();
        new BudgetAnalysis(z);

    }
}
