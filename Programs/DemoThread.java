/*
Create two classes A and B both extend Thread class
A prints numbers from 0 to 5 and B prints numbers
from 10 to 5. In main method run both threads simultaneously
 */
package com.java;
class A1 extends Thread
{
    public void run()
    {
        for(int i=0; i<=5; i++)
            System.out.println("Thread A: "+i);
    }
}
class B1 extends Thread
{
    public void run()
    {
        for(int i=10; i>=5; i--)
            System.out.println("Thread B: "+i);
    }
}
public class DemoThread {
    public static void main(String[] args) {
        A1 a=new A1();
        B1 b=new B1();
        a.start();
        b.start();
    }
}
