package com.java;

/*
Write a program in java in which create a class Box
with attributes length,width and height
create a setDimension(length:double,width:double,height:double)
also create showDimension method that prints length, width and height
of the box
 */
public class Box {
    double length,breadth,height;
    public void setDimension(double l, double b, double h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimension()
    {
        System.out.println("Length is: "+length+"\nBreadth is: "+breadth+"\nHeight is: "+height);
    }

}
class BoxDemo{
    public static void main(String[] args) {
        Box box = new Box();
        box.setDimension(2.5,5.0,8.4);
        box.showDimension();
    }
}
