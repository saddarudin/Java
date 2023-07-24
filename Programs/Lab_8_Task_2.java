/*Create three classes, Storage, Counter, and Printer.
The Storage class should store an integer.
The Counter class should create a thread that starts counting  from 0
(i.e. 0,1, 2,3,4….) and stores each value in the Storage class.
The Printer class should create a new thread that keeps reading
the value in the Storage class and printing it.*/
package com.java;
class Counter extends Thread
{
    int count=0;
    public Counter(String s)
    {
        System.out.println(s);
    }
    public void run()
    {
        for (int i=0;i<20;i++) {
            ++count;
            Storage.setStore(count);
        }
    }
}
class Storage
{
    static int[] store=new int[21];
    public  Storage(String s)
    {
        System.out.println(s);
    }
    public static void setStore(int a)
    {
        store[a]=a;
    }
}
class Printer extends Thread
{
    public Printer(String s)
    {
        System.out.println(s);
    }
    @Override
    public void run()
    {
        for (int i=0;i<Storage.store.length;i++)
            System.out.println(Storage.store[i]);
    }
}
public class Lab_8_Task_2 {
    public static void main(String[] args) {
        Counter counter=new Counter("Counter Class Started:\n");
        Storage storage=new Storage("Storage class started:\n");
        Printer printer=new Printer("Printer Class Started:\n");
        counter.start();
        printer.start();
    }
}
