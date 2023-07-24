package com.java;
import java.util.Scanner;
/*
Get character from user and print consonant on screen
if it is consonant or vowel if it is vowel.
 */
class InputCharacter
{
 public static void main(String[] args)
 {
  char ch;
  System.out.println("Enter any character from English alphabet: ");
  Scanner scan = new Scanner(System.in);
  ch = scan.next().charAt(0);
     switch (ch) {
         case 'A', 'E','I','O','U','a','e','i','o', 'u' -> System.out.println("It is vowel");
         default -> System.out.println("It is consonant");
     }
 }
}