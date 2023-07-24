package com.java;
/*
Create a CarExample class with three types of constructors
1) no argument: sets default values
2) two argument constructor type and color both are strings:
sets type and color provided by user
3) one argument that is CarExample(CarExample c): that assigns
every object same type and color

Other attributes of CarExample are: engineNo, capacity
Create a method duplicateCar() that returns duplicate object of CarExample
 */
public class CarExample
{
String cartype;
String color;
long engineNum;
byte capacity;
//No arguments constructor
CarExample(){
cartype = "Abc";
color = "Xyz";
engineNum = 0000;
capacity = 00;}
//Argumentative Constructor
CarExample(String type, String colour)
{
cartype = type;
color = colour;
}
//Passing Object
CarExample(CarExample C)
{
this.cartype=C.cartype;
this.color=C.color;
}
CarExample duplicate_Car()
{
return this;
}
    public static void main(String[] args)
    {
        CarExample c1,c2,c3,c4,c5;
        c1 = new CarExample();
        c2 = new CarExample("Electric","White");
        c3 = new CarExample(c2);
        c4 = new CarExample();
        c4 = c1.duplicate_Car();
        c5 = c2.duplicate_Car();
        System.out.println(c5.duplicate_Car());
    }
}


