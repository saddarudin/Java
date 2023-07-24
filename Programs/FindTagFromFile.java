package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Create the following function
String parser(String tag,String fileName)
Note:
->You have been provided a file containing textual data
->The program should open the file and search for the provided tag,
->Once it finds the tag it should return the information between and the end tag
->For example parser("h6","headings.html")
->inside the abc.html there is a line: <h6> Heading 6 </h6>.
->The output for the function would be Heading 6.
 */
public class FindTagFromFile {

    public static String parser(String tag,String filePath){
        File f=new File(filePath);
        try {
            Scanner scan=new Scanner(f);
            while (scan.hasNextLine()){
                String s=scan.nextLine();
                if(s.contains("<"+tag+">")){
                    String[] s1=s.split("</");
                    String[] a=s1[0].split(">");
                    return a[1];
                }
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(parser("h6","src/com/java/FindTargetFromFile.txt"));
        
    }
}
