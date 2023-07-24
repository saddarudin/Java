package com.java;
/*
CPU is composed in the Computer class. Write a java program to
demonstrate this example
The attributes of computer class are: name, color,price
It must contain following methods:
constructor:Computer(name:String,color:String,price:int) to assign the instance variables
showData():to display the values of attributes
Create same methods and attributes in CPU class.
 */
class Computer
{
 private String name;
 private String color;
 private int price;
 public void pressEnter()
 {
  System.out.println("Press Enter key."); 
 }
 Computer(String name, String color, int price)
 {
  this.name=name;
  this.color=color;
  this.price=price;
 }
 public void showData()
 {
  System.out.println("Name of this computer is: "+name);
  System.out.println("Color of this computer is: "+color);
  System.out.println("Price of this computer is: "+price); 
 }
class CPU
{
 private int size;
 private String color;
 public void storedata()
 {
  System.out.println("I store data in huge amount.");
 }
 CPU(int size, String color)
 {
  this.size=size;
  this.color=color; 
 }
 public void showData()
 {
  System.out.println("Size in inches of Central Processing Unit is: "+size);
  System.out.println("Color of CPU is "+color);
 }
 
} 
}

public class ComputerDemo
{
 public static void main(String[] args)
{
 Computer c=new Computer("Dell","White",70000);
 c.showData();
 c.pressEnter();
 Computer.CPU cpu=c.new CPU(37,"Black");
 cpu.showData();
}
}