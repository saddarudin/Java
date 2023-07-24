/*
This example demonstrate the example of copy vs clone
 */
package com.java;
public class Copy_VS_Clone {
    public static void main(String[] args) {
        int[] array={2,4,5,6,7,8};
        int[] copyArray=new int[6];
        System.arraycopy(array,0,copyArray,0,array.length);
        //address of copyArray
        System.out.println(copyArray);
        //Address of array
        System.out.println(array);
        int[] cloneArray=(int[])array.clone();
        //Address of clone address
        System.out.println(cloneArray);
    }
}
