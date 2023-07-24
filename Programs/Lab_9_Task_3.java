/*
* 3. Write a program that opens a file in write mode(use file modes),
* takes name and roll no from the user write it in the file and closes the file.*/

package com.java;
import java.util.Scanner;
import java.io.FileWriter;
public class Lab_9_Task_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scan.nextLine();
        System.out.println("Enter your roll number: ");
        String rollNo=scan.nextLine();
        try {

            FileWriter fw = new FileWriter("BufferFile.txt",true);
            fw.write(name);
            fw.write(rollNo);
            fw.close();
        }catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
