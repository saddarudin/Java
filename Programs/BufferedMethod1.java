package com.java;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
/*
 */
public class BufferedMethod1 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("hassan.txt");
        BufferedReader br=new BufferedReader(fr);
        int i=1;
        String s=new String();
        while(i<=3)
        {
            s=br.readLine();
            i++;
        }
        System.out.println(s);
    }
}
