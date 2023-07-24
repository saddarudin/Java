/*
Write a java program that reads
the file named "saddar.txt" using FileOutputStream class
 */
package com.java;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("saddar.txt", true);
            String s = "Saddar";
            char[] ch =s.toCharArray();
            for (int i = 0; i < s.length(); i++)
                fout.write(ch[i]);
            fout.close();

    }
}
