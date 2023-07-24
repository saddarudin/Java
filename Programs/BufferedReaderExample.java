package com.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
/*

Write a java program that reads "hassan.txt" file.
Use BufferedReader class to read file.
 */
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException
    {
        int i;
        FileReader fr=new FileReader("hassan.txt");
        BufferedReader br=new BufferedReader(fr);
        do {

               i=br.read();
               if(i!=-1)
                   System.out.print((char)i);
            }while(i!=-1);
        br.close();
        System.out.print("\nFile has been read successfully.");

    }
}
