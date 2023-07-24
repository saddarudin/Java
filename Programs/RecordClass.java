package com.java;
record Alian(int id,String name){
/*
This class is used to fetch/store the data only
All variables declared in parameter are private and final
if you want any single data say id type Sout(id);
You can create static fields in this class but instance fields are not allowed
You can create methods in this class
This is called Compact Canonical Constructor
 */
}
public class RecordClass {
    public static void main(String[] args) {
        Alian a=new Alian(77,"Saddar");
        //you can print all attributes of object by this way
        System.out.println(a);
        //you can also call any single attribute say name of abject by
        System.out.println(a.name());
    }
}
