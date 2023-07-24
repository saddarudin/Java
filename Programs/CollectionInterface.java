package com.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
Use Collection interface to create object of  ArrayList
data structure to store some numeric values and then
print the values using iterator method.
 */

public class CollectionInterface {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        values.add(8);
        values.add(10);
        values.add(4);
        System.out.println(values);

        //if we want to print each value on different line
        Iterator it=values.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
