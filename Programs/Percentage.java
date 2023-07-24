/*
Write a java program to calculate the percentage of
student for five subjects get obtained marks from user for
each subject total marks 100 per subject
Also calculate the grade on following criteria and print the result
A+ for greater than 90
A for 83 to 90
B+ for 75 to 82
B for 65 to 74
C+ for 60 to 64
C for 50 to 59
F for less than 50

Output should be like
Subject   Obt. Marks   Percentage    Grade
 */
package com.java;
import java.util.Scanner;
public class Percentage
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  //boolean a,b,c,d,e;
  byte[] Mark;
  Mark = new byte[5];
  String[] Subject = new String[]{"OOP","LAAG","ISE","PP","FE"};
  String[] Grade = new String[5];
  //float per1, per2, per3, per4, per5;
  for(int i=0; i<5; i++)
  {
   System.out.println("Enter your marks (Max. 100) in "+Subject[i]);
   Mark[i] = scan.nextByte();
   if(Mark[i]<50){Grade[i] = "F";}
   else if(Mark[i]>=50 && Mark[i]<=59){Grade[i] = "C";}
   else if(Mark[i]>=60 && Mark[i]<=64){Grade[i] = "C+";}
   else if(Mark[i]>=65 && Mark[i]<=74){Grade[i] = "B";}
   else if(Mark[i]>=75 && Mark[i]<=82){Grade[i] = "B+";}
   else if(Mark[i]>=83 && Mark[i]<=90){Grade[i] = "A";}
   else if(Mark[i]>=90){Grade[i] = "A+";}
  }
   
 System.out.println("Subject		Obt.Marks	Percentage	Grade");
 for(int i=0; i<5; i++)
{
 System.out.println(Subject[i]+"		"+Mark[i]+"		"+Mark[i]+"		"+Grade[i]);
}
}
}