package com.java;
abstract class Wearable{
    boolean screen;
    double cost;
    String batteryPower;
    public abstract void operate();
    public abstract void checkHealthStatus();
    Wearable(){
        screen=true;
        cost=0;
        batteryPower="00mAH";
    }
}
class SmartWatch extends Wearable{
    @Override
    public void operate() {
        System.out.println("This is operate method of SmartWatch class.");
    }
    @Override
    public void checkHealthStatus() {
        System.out.println("This is healthCheckStatus method of SmartWatch class.");
    }
    public void checkingFaceBookStatus()
    {
        System.out.println("This watch is supported with FaceBook");
    }
}
class SmartPhone extends Wearable{
    @Override
    public void operate() {
        System.out.println("This is operate() method in SmartPhone Class.");
    }

    @Override
    public void checkHealthStatus() {
        System.out.println("This is healthCheckStatus method() in SmartPhone class.");
    }
    public void checkingFacebookStatus()
    {
        System.out.println("This smart phone is supported with FaceBook.");
    }
}
public class WearableDemo {
    public static void main(String[] args) {
        Wearable w1,w2;
        SmartWatch sw=new SmartWatch();
        SmartPhone sp=new SmartPhone();
        w1=new SmartWatch();
        w1.operate();
        w1.checkHealthStatus();
        w2=new SmartPhone();
        w2.operate();
        w2.checkHealthStatus();
        sw.checkingFaceBookStatus();
        sp.checkingFacebookStatus();
    }
}
