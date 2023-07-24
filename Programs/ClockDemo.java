package com.java;
/*
create a clock class with hour, minute and second attributes
and setters and getters. Add conversion methods like:
double convertToSecond(float hour,float minute)
double convertToHour(float min,int second)
double convertToMinute(int seconds,float hour)
and make function to convert 3 hours and fifty minutes to
seconds and recheck with reciprocal method.
 */
class Clock
{
    private double hour;
    private double minutes;
    private double second;
    public void setHour(double hour)
    {
        this.hour=hour;
    }
    public void setMinutes(double minutes)
    {
        this.minutes=minutes;
    }
    public void setSeconds(double second)
    {
        this.second=second;
    }
    public double getHour()
    {
        return hour;
    }
    public double getMinutes()
    {
        return minutes;
    }
    public double getSecond()
    {
        return second;
    }
    public double convertToSeconds(double minute,double hour)
    {
        return ((hour*3600)+(minute*60));
    }
    public double convertToHour(double minutes, double second)
    {
        return ((minutes/60)+(second/3600));
    }
    public double convertToMinutes(double second, double hour)
    {
        return ((second/60)+(hour*60));
    }
}
public class ClockDemo {
    public static void main(String[] args) {
        Clock c=new Clock();
        System.out.println(c.convertToSeconds(50,3));
    }
}
