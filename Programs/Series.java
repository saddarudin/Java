/*
Generate a series of Odd and Even numbers using for and while loop*/
package com.java;
class Series
{
public static void main(String[] args)
{
int i;
System.out.println("\n\nUsing For Loop\n");
System.out.println("Odd	Even");

for( i=1; i<=50; i++)
{
System.out.print(i);
i++;
System.out.print("	"+i);
System.out.println("");
}



System.out.println("Using While Loop\n");
System.out.println("Odd	Even");
i=1;
while(i<=50)
{
System.out.print(i);
i++;
System.out.print("	"+i);
i++;
System.out.println("");
}

}
}

