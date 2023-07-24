/*
Create a movie class along with attributes like name, releaseYear,
duration and aggregate classes like:genre,actor,director,cameraman.
Add methods like short() with proper parameters, theaterRelease(),
postProduction(). Make three movie objects and initialize them
with proper value.
 */
package com.java;
class Genre
{
    private String genre_type;
    Genre(String genre_type)
    {
        this.genre_type=genre_type;
    }
    public void showData()
    {
        System.out.println("Genre is: "+genre_type);
    }
}
class Actor
{
    private String name;
    private int experience;
    Actor(String name,int experience)
    {
        this.name=name;
        this.experience=experience;
    }
    public void showData()
    {
        System.out.println("Name of actor is: "+name+"\nHis experience is: "+experience+" years.");
    }
}
class Director
{
    private String name;
    Director(String name)
    {
        this.name=name;
    }
    public void showData()
    {
        System.out.println("Name of director is: "+name);
    }
}
class Cameraman
{
    private String name;
    Cameraman(String name)
    {
        this.name=name;
    }
    public void showData()
    {
        System.out.println("Name of camera man is: "+name);
    }
}

class Movie
{
    private String name;
    private int releaseYear;
    private int duration;
    Genre g;
    Actor a;
    Director d;
    Cameraman cm;
    Movie(String name,int releaseYear, int duration,Genre g, Actor a, Director d, Cameraman cm)
    {
        this.name=name;
        this.releaseYear=releaseYear;
        this.duration=duration;
        this.g=g;
        this.a=a;
        this.d=d;
        this.cm=cm;
    }
    public void showData()
    {
        System.out.println("Name of movie is: "+name);
        System.out.println("Releae year is: "+releaseYear);
        System.out.println("Duration of the movie is: "+duration);
    }
    public void shoot(String area)
   {
       System.out.println("This movie is shouted in "+area);
   }
   public void theater_release(String date)
   {
       System.out.println("It will be released on "+date);
   }
   public void post_production()
   {
       System.out.println("This is post production method.");
   }
}

public class MovieDemo {
    public static void main(String[] args) {

        Genre g=new Genre("Emotional");
        Actor a=new Actor("Amir Khan",40);
        Director d=new Director("Saurabh Shukla");
        Cameraman cm=new Cameraman("Ali");
        Movie m1=new Movie("Lal Singh Chadha",2022,3,g,a,d,cm);
        m1.g.showData();
        m1.a.showData();
        m1.d.showData();
        m1.cm.showData();
        m1.showData();
        m1.shoot("Karachi");
        m1.theater_release("9th November");
        m1.post_production();


    }

}
