package com.java;

/*
Generate ASCII characters from 0 to 255 using for loop and while loop
*/

class ASCII
{

public static void main(String[] args)
{
int i;
System.out.println("\nUsing For Loop\n");
for(i=0; i<=150; i++)
{
System.out.print((char)i+"	");
}



System.out.println("\nUsing While Loop\n");
i=151;
while(i<=255)
{
System.out.print((char)i+"	");
i++;
}
}

}