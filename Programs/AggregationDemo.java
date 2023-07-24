/*
Make a class car with following methods:
1) a constructor: CAR(color:String, name:String,model:int))
2) void showData(): which shows name, color and model of car
3) void accelerate()
This car class is aggregated with Engine class.
Engine class contains following methods:
1) constructor: Engine(String typeOfOil, String engCompany, int noOfBold);
2) void start()
3) void showData() which shows typeOfOil,engineCompany and noOfBolds
In main method make object of CAR class and call method of car. Also create object of Engine class and call its methods
 */
package com.java;
class CAR
{
     String color;
     String name;
     int model;

    public CAR(String color, String name,int model)
    {
        this.color=color;
        this.name=name;
        this.model=model;
    }
    public void showData() {
        System.out.println("Color: "+color+"\nName: "+name+"\nModel: "+model);
    }
    public void accelerate() {
        System.out.println("This is acceleration method");
    }
     class Engine
    {
         String typeOfOil;
         String engCompany;
         int noOfBold;

        public Engine(String typeOfOil, String engCompany, int noOfBold){
            this.typeOfOil=typeOfOil;
            this.engCompany=engCompany;
            this.noOfBold=noOfBold;
        }
        public void start()
        {
            System.out.println("This is start method of engine class.");
        }
        public void showData(){
            System.out.println("Type of Oil: "+typeOfOil+"\nCompany: "+engCompany+"\nNo of Bolds: "+noOfBold);
        }
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        CAR car=new CAR("Black","Civic",22);
        car.accelerate();
        car.showData();
        // Syntax For Composition , Note : This is obj for inner class.
        CAR.Engine engine=car.new Engine("Best","Honda",38);
        engine.showData();
        engine.start();
    }
}
