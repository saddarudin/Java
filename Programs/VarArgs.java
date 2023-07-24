/*
Write a java program to create a sum method that takes
variable arguments i.e no of arguments are not defined
This method should sum up all the numbers and then return sum
 */
package com.java;
class VariableArguments{
    /*
    Syntax->(int ... n)
    Here n is treated as an array
    The length of n depends on the number of arguments passed by user
     */
    public int sum(int ... n){
        int sum=0;
        for(int i:n)sum+=i;
        return sum;
    }
}
public class VarArgs {
    public static void main(String[] args) {
        VariableArguments obj=new VariableArguments();
        System.out.println(obj.sum(1,2,5,34));
    }
}
