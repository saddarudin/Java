/*Create a Student class that stores student data(name,rollno, dept,age),
provides methods for initializing and displaying student data.
Also provide a parameterized constructor for initializing
student class data members.*/
package com.java;
public class Student {
private String name;
private String rollNo;
private String dept;
private int age;
    Student(){

    }
Student(String name,String rollNo,String dept, int age) {
    this.rollNo=rollNo;
    this.age=age;
    this.name=name;
    this.dept=dept;
}
public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Saddar U Din");
        s1.setRollNo("21SW077");
        s1.setDept("Software");
        s1.setAge(19);
        System.out.println("Name: "+s1.getName());
        System.out.println("Roll Number: "+s1.getRollNo());
        System.out.println("Department: "+s1.getDept());
        System.out.println("Age: "+s1.getAge());
    }

}
