package com.java;
abstract class Vehicle{
    int noOfWheels;
    int capacity;
    String color;
    abstract void accelerate();
    abstract void stop();
    abstract void changeDirection();
}
abstract class Bike extends Vehicle{
    int model;
}
abstract class car extends Vehicle{
    String company;
}
abstract class Truck extends Vehicle{
    double size;
}
abstract class Bus extends Vehicle{
    int model;
}
class Cycle extends Bike{
    @Override
    void accelerate(){
        System.out.println("Cycle is accelerating...");
    }
    @Override
    void stop(){
        System.out.println("Cycle is stopping...");
    }

    @Override
    void changeDirection() {
        System.out.println("Cycle is changing direction..");
    }
}
class MotorBike extends Bike{

    @Override
    void accelerate() {
        System.out.println("Motor Bike is accelerating..");
    }

    @Override
    void stop() {
        System.out.println("Motor Bike is stopping..");
    }

    @Override
    void changeDirection() {
        System.out.println("Motor Bike is changing direction...");
    }
}
class SportsCar extends car {

    @Override
    void accelerate() {
        System.out.println("Sports car is accelerating...");
    }

    @Override
    void stop() {
        System.out.println("Sports car is stopping...");
    }

    @Override
    void changeDirection() {
        System.out.println("Sports car is Changing Direction...");
    }
}
class Taxi extends car {
    @Override
    void accelerate() {
        System.out.println("Taxi is accelerating...");
    }

    @Override
    void stop() {
        System.out.println("Taxi is stopping...");
    }

    @Override
    void changeDirection() {
        System.out.println("Taxi is Changing Direction...");
    }
}

class Mazda extends Truck{
    @Override
    void accelerate() {
        System.out.println("Mazda is accelerating...");
    }

    @Override
    void stop() {
        System.out.println("Mazda is stopping...");
    }

    @Override
    void changeDirection() {
        System.out.println("Mazda is Changing Direction...");
    }
}

class LargeTruck extends Truck{
    @Override
    void accelerate() {
        System.out.println("Large Truck  is accelerating...");
    }

    @Override
    void stop() {
        System.out.println("Large Truck is stopping...");
    }

    @Override
    void changeDirection() {
        System.out.println("Large Truck is Changing Direction...");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Vehicle v=new SportsCar();
        v.capacity=2;
        v.color="Golden";
        v.noOfWheels=4;
        System.out.println("Capacity: "+v.capacity+"\nColor: "+v.color+"\nNo of wheels: "+v.noOfWheels);
        v.accelerate();
        v.changeDirection();
        v.stop();
    }
}
