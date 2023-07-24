/*
* 1. Write java code that takes a value at run time and searches it in the array.
* If the value appears in the array then it prints the position of the value
* or else prints a message that value is not found.*/
package com.java;
import java.util.Scanner;
public class SearchFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int c=0;
        System.out.println("Enter any integer: ");
        int a = scan.nextInt();
        for (int i = 0; i < 10; i++) {
            int b = arr[i];
            if (a == b) {
                System.out.println("Its index is: " + i);
                c=1;
                break;
            }
        }
        if(c!=1) System.out.println("Value not present");

    }
}
