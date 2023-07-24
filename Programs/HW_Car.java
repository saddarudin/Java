/*
Make a class carCompany containing nested class car and
have attributes type:String and car class has the following attributes:
color:String, capacity byte and noOfWheels:int. noOfWheels should
be static.
Make two objects of car in car company type1="Sidhan", type2="Hetchback"
and access these two objects from main class.
 */
package com.java;
class CarCompany
{
 String type1 = "Sedan";
 String type2 = "HechBack";


class Car
{
String color;
byte capacity;
static int noOfWheels = 4;

int Display()
{
CarCompany CC = new CarCompany();
String temp = CC.type1;
System.out.println("Car Type is: "+temp+"\nNumber of Wheels are: ");
return noOfWheels;
}

}


}

class HW_Car
{
public static void main(String[] args)
{
CarCompany CC = new CarCompany();
CarCompany.Car C = CC.new Car();
System.out.println(C.Display());
}
}