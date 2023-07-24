/*
* 2. Write a java program based on filing.
* Perform Create, Read and Write operations on text file
* using BufferedReader and BufferedWriter Class.*/
package com.java;
import java.io.*;

public class Lab_9_Task_2  {
    public static void main(String[] args) throws IOException
    {
        int i;
        //Creating File using BufferWriter Class
        BufferedWriter bw = new BufferedWriter(new FileWriter("BufferFile.txt",true));
        //Writing into file
        bw.write("Saddar U Din Babar");
        bw.close();
        //Creating File Reader Class
        FileReader fr=new FileReader("BufferFile.txt");
        BufferedReader br=new BufferedReader(fr);
        do {
            i=br.read();
            if(i!=-1)
                System.out.print((char)i);
        }while(i!=-1);
        //Closing file
        br.close();
    }
}
