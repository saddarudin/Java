package com.java;
/*
Create the following method
double Division(int a,int b);
Note:
 ->The method cannot use the "/" sign or any builtin function.
 ->You have to divide two numbers using loops
 ->The answer should contain at least two numbers after decimal point
 ->Example Div(10,3) should return 3.33
 */
public class ManualDivision {
    public static double Division(int a,int b){

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2=new StringBuilder();
        int count=0;
        if(a<b){
            s1.append("0");
            a*=10;
            for(int i=0;i<2;i++){
                while (a>=b){
                    a=a-b;
                    count++;
                }
                s2.append(count);
                count=0;
                a*=10;
            }
        }
        else {
            for(int i=0;i<3;i++){
                while (a>=b){
                    a=a-b;
                    count++;
                }
                if(i==0)s1.append(count);
                else s2.append(count);
                count=0;
                a=a*10;
            }
        }


        return Double.parseDouble(s1 +"."+s2);
    }

    public static void main(String[] args) {
        System.out.println(ManualDivision.Division(10,3));
    }
}
