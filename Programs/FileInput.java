package com.java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 Write a java program that creates a file named "hassan.txt"
 input some text in the file and then read that file
 use FileOutputSteam for inputting text and FileInputStream
 for reading that file*/

public class FileInput {
    public static void main(String []args) throws IOException
    {
        int i;
        StringBuilder sa=null;
        FileOutputStream f1=new FileOutputStream("hassan.txt",true);
        String s="Hassan";
        char ch[]=s.toCharArray();
        for( i=0; i<s.length();i++) f1.write(ch[i]);
        FileInputStream f;
        f=new FileInputStream("hassan.txt");
        do
        {
             i=f.read();
            if(i!=-1) {
                System.out.print((char)i);
                sa.append((char)i);
            }
        }while(i!=-1);
        f.close();
        System.out.println("\nString: "+sa);
    }
}
