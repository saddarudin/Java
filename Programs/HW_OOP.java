package com.java;
import java.util.ArrayList;
/*
Write a java program to demonstrate the given scenario
University class is composed of Student and Department classes.
1)University;
name:String, ArrayList:Student, ArrayList:Department
University(uname:String,std:String[],dept:String[])
getDepartment(name:String):Department, getStudent(name:String):Student,
enrollsIn(dept:Department,student:Student), displayStudentsInDept(dept:Department):void

2)Student:
name,dept
Student(name),display()

3)Department:
name,ArrayList:Student
Department(dept:string),displayStudents()

In main method create two objects of university class muet and nust add some depts and
students enrolls students in both universities and display them out.
 */
class University
{

  String uname;
  ArrayList<Students>  studentlist = new ArrayList<>();
  ArrayList<Departments> deptlist = new ArrayList<>();

  University(String univ, String[] std, String[] dept)
  {
     uname = univ;
      for (String s : std) studentlist.add(new Students(s));
      for (String s : dept) deptlist.add(new Departments(s));
  }

  class Students
  {
     String sname;
     Departments depts;
     Students(String sname)
     {
       this.sname = sname;
     }
     
     void display()
     {
       System.out.println(sname);
       System.out.println(depts.dname);
     }
  }

  class Departments
  {
     String dname;
     ArrayList<Students> deptstd = new ArrayList<>();
     Departments(String dname)
     {
       this.dname = dname;
     }

     void displayStudents()
     {
         for (Students students : deptstd) System.out.println(students.sname);
     } 
  }
  
  Departments getDepartment(String name)
  {
      for (Departments departments : deptlist) if (departments.dname.equals(name)) return departments;

    return null;
  }

  Students getStudents(String name)
  {
      for (Students students : studentlist) if (students.sname.equals(name)) return students;

    return null;
  }

  public void enrollsIn(Departments d, Students s)
  {
    s.depts = d;
    d.deptstd.add(s);
  }
  
  public void displayStudentsInDept(Departments d)
  {
    d.displayStudents();
  }
}


class HW_OOP
{
  public static void main(String[] args)
  {
    String[] snames = {"Saddar","Shoaib","Shams","Din Muhammad","Ashraf"};
    String[] depart = {"SW", "CS"};
    

    String[] snames1 = {"Altaf","Khalique","Mohsin","M. Khan","Ali","Jahanzeb","Hub Ali","Danish","GM","Aamir"};
    String[] depart1 = {"SW", "CS", "CE", "EL"};

    University muet = new University("Mehran UET", snames, depart);
    University nust = new University("National UST",snames1,depart1);

    muet.enrollsIn(muet.getDepartment("SW"), muet.getStudents("Saddar"));   
    muet.enrollsIn(muet.getDepartment("CS"), muet.getStudents("Shoaib"));
    muet.enrollsIn(muet.getDepartment("SW"), muet.getStudents("Shams"));
    muet.enrollsIn(muet.getDepartment("CS"), muet.getStudents("Ashraf"));

    nust.enrollsIn(nust.getDepartment("SW"), nust.getStudents("Altaf"));
    nust.enrollsIn(nust.getDepartment("SW"), nust.getStudents("Khalique"));
    nust.enrollsIn(nust.getDepartment("EL"), nust.getStudents("Mohsin"));
    nust.enrollsIn(nust.getDepartment("CS"), nust.getStudents("M. Khan"));
    nust.enrollsIn(nust.getDepartment("CE"), nust.getStudents("Ali"));
    nust.enrollsIn(nust.getDepartment("CE"), nust.getStudents("Jahanzeb"));
    nust.enrollsIn(nust.getDepartment("SW"), nust.getStudents("Hub Ali"));
    nust.enrollsIn(nust.getDepartment("EL"), nust.getStudents("Danish"));
    nust.enrollsIn(nust.getDepartment("SW"), nust.getStudents("GM"));
    nust.enrollsIn(nust.getDepartment("CS"), nust.getStudents("Aamir"));

    
    System.out.println("SW Mehran: ");
    muet.displayStudentsInDept(muet.getDepartment("SW"));
    System.out.println("CS Mehran: ");
    muet.displayStudentsInDept(muet.getDepartment("CS"));
   
   System.out.println("SW NUST: ");
   nust.displayStudentsInDept(nust.getDepartment("SW"));
   System.out.println("CS NUST: ");
   nust.displayStudentsInDept(nust.getDepartment("CS"));
   System.out.println("CE NUST: ");
   nust.displayStudentsInDept(nust.getDepartment("CE"));
   System.out.println("EL NUST: ");
   nust.displayStudentsInDept(nust.getDepartment("EL"));

  }
};