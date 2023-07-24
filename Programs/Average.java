package com.java;

/*
Write a java program that declares 5 floating 
numbers and print their total sum and average.
*/

class Average {
    public static void main(String[] args) {
        float a=2.14f;
        float b=3.4731f;
        float c= 7.9012f;
        float d=0.874f;
        float e=7.4f;
        float sum = a+b+c+d+e;
        float average = sum/5.0f;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);
    }
}