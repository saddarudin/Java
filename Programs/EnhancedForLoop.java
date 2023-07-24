/*

Let a be a two-dimensional array (2D array of return type integer) use enhanced for loop
to print its elements
 */
package com.java;
public class EnhancedForLoop {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {0,0,0,2},
                {8,8},
        };
        for(int[] i:a)
        {
            for (int j:i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
