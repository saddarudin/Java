/*
Create a class in java and use initializers both static and instance
static initializer should initialize the static variable and
instance initializer should initialize the non-static variable
use constructors to print the values of both the variables
 */
package com.java;
public class Initializer {

        private int x;
        private static int k;
        //Instance Initilizer
        {
            System.out.println("Initialization Block: x = "+x);
            x=5;
        }
        //static Initializer
        static
        {
            System.out.println("Static Initialization Block: k = "+k);
            k=10;
        }
        Initializer()
        {
            System.out.println("Constructor: x = "+x);
            System.out.println("Constructor: k = "+k);
        }
}
class Demo
{
    public static void main(String[] args) {
        new Initializer();
        Initializer obj1=new Initializer();
        Initializer obj2=new Initializer();
    }
}
