/*
* Write a program based on threads.
* Perform multi-threading and print even numbers and such that
* when the numbers reach at value 30 then give a delay
* of 5 seconds. After the delay, the program will continue
* to print the series at the same manner.*/
package com.java;
public class Lab_8_Task_1 extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "    ");
            if (i == 30) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Exception:" + e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Lab_8_Task_1 t=new Lab_8_Task_1();
        t.start();
    }
}
