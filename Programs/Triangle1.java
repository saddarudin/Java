/*
Print the following pattern in java
*
**
***
****
*/
package com.java;
class Triangle
{
public static void main(String[] args)
{
for(int i = 0; i<=3; i++)
{
for(int j = i; j>=0; j--)
System.out.print("*");
System.out.println("");
}
}
}