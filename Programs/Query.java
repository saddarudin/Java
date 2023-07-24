package com.java;

import java.util.Arrays;
import java.util.Scanner;
/*
Create an array consisting of following entries:
eat, taste, test, elbow, silent, study, car, arc, dusty, state, below, listen, tea, estate
Assume that a user enters a string of letters called query string. Your code must then return
all words in the array that can be made using all letters in the query string.
For example, if the query string is astet, the output will consist of the words taste and state.
Note that test is not in the output because it cannot be made using the input letters,
e.g., the input contains only one e.
 */
public class Query {
    public static void main(String[] args) {
        String[] str={"Eat","Taste","Test","Elbow","Silent","Study","Car","Arc","Dusty","State","Below","Listen","Tea","Estate"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter query: ");
        String query=scan.nextLine();
        for(String s:str){
            if(s.length()==query.length()){
                char[] string=s.toLowerCase().toCharArray();
                char[] string1=query.toLowerCase().toCharArray();
                Arrays.sort(string);
                Arrays.sort(string1);
                if(Arrays.toString(string).equals(Arrays.toString(string1))) System.out.println(s);
            }

        }

    }
}
