/*
Write a java program to demonstrate the concept
of threading. Create two threads one extends Thread class
and other implements Runnable interface
 */
package com.java;
class MyThread extends Thread{
public void run(){
for(int i=0;i<50;i++)System.out.println("This is thread not threat");
}}
class MyThreat implements Runnable{
public void run(){
for(int i=0; i<100;i++)System.out.println("This is threat not thread");
}
}
public class Main1{
public static void main(String[]args)
{
MyThread t1=new MyThread();
MyThreat t2=new MyThreat();
Thread th=new Thread(t2);
t1.start();
th.start();
}
}
