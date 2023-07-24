package com.java;
/*
Create a car class having carType: String, carName:String, price:int and
color:String as attributes. This class must have two constructors
a default constructor in which assign any appropriate values manually
and a parametrized constructor that assigns all the attributes by
the values provided by the user. Create a duplicateCar() method
that returns the duplicate of that car that calls it.
 */
class Car{
    String carType;
    String carName;
    int price;
    String colour;
    Car(){
        this.carName="Corolla";
        this.carType="Hybrid";
        this.colour="Blue";
        this.price=3400000;
    }
    Car(String a,String b,String c,int x){
        this.price=x;
        this.colour=a;
        this.carType=b;
        this.carName=c;
    }
    Car duplicateCar(){
        return this;

    }

}



public class HomeWork {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car("white","Hybrid","Vezel",4000000);
        Car c3;
        c3 =c2.duplicateCar();
        System.out.println(c3.carName);

    }
}