package com.java;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
Write a java program that creates a file named "hassan.txt"
and writes some lines in that file. Must use BufferedWriter class
 */
public class BufferedWriterExample {
    public static void main(String[] args) throws IOException
    {

            BufferedWriter bw = new BufferedWriter(new FileWriter("hassan.txt",true));
            bw.write("\nHaji Hassan");
            bw.close();
    }
}
