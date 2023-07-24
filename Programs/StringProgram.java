package com.java;

public class StringProgram {
    public static int parser(String name,String pattern){
        int count=0,index=0;
        char[] c1=name.toCharArray();
        char[] c2=pattern.toCharArray();
        for(char c:c2){
            for (char value : c1) {
                if (c == value) count++;
            }
            index+=count;
            count=0;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(parser("subsequence","su"));
    }
}
