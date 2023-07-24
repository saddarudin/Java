/*
Create user defined thread that prints table of 33, 59 and 97 from 1 to 10000
like:
33*1=33
33*2=33
...
33*10000=330000
 */
package com.java;
class MyThreadTable extends Thread{
    @Override
    public void run() {
        int a=33, b=59, c=97;
        System.out.println("Table of 33         Table of 59         Table of 97");
        for(int i=1;i<=10000;i++){
            System.out.println(a+"*"+i+"="+a*i+"             "+b+"*"+i+"="+b*i+"              "+c+"*"+i+"="+c*i);
        }
    }
}
public class MyThreadDemo{
    public static void main(String[] args) {
        MyThreadTable t=new MyThreadTable();
        t.start();
    }
}