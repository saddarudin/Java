package com.java;
/*
Write a java program to print even numbers from 1 to 100 without using loop
 */
public class EvenNumbersWithoutLoop {
public void even(int number){
    System.out.print(number+"  ");
    if(number<100){
        number+=2;
        even(number);
    }
}
    public static void main(String[] args) {
        new EvenNumbersWithoutLoop().even(2);
    }
}
