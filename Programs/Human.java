/*
create a human class that is composed of Heart, Liver classes and is aggregated
with Clothes, Food and NIC classes. Attributes of the classes are given below:
1) Human:
name:String, food:Food, nic:NIC
speak():void,Human(Name,Food,Clothes,NIC)

2) Heart:
function(),heartBeating();

3) Liver:
function();

4)Food:
type:String,quality:String
Food(type,quality);

5)Clothes:
color:String,size:int,price:int
Clothes(color,size,price);

6)NIC:
name:String, dob:String, address:String
NIC(name,dob,address)
 */
package com.java;
class Human {
    String name;
    public void speak()
    {
        System.out.println("This is speak method in human class");
    }
    class Heart
    {
        public void function()
        {
            System.out.println("Function of heart: It's main function is to move blood throughout your body.");
        }
        public void heartBeating()
        {
            System.out.println("Heart Beating: A normal resting heart rate for adults ranges from 60 to 100 beats per minute.");
        }
    }
    class Liver {
        public void function() {
            System.out.println("Function of Liver: All the blood leaving the stomach and intestines passes through the liver.");
            System.out.println("The liver processes this blood and breaks down, balances, and creates the " +
                    "\nnutrients and also metabolizes drugs into forms that are easier to use for the rest of " +
                    "\nthe body or that are nontoxic.");
        }


    }
    Food food;
    Clothes clothes;
    NIC nic;
    Human(String name, Food food, Clothes clothes,NIC nic)
    {
        this.name=name;
        this.food=food;
        this.clothes=clothes;
        this.nic=nic;
    }
}



class Food
{
    String type;
    String quality;
    Food(String type, String quality)
    {
        this.type=type;
        this.quality=quality;
    }
}



class Clothes
{
    String color;
    int size;
    int price;
    Clothes(String color, int size, int price)
    {
        this.color=color;
        this.size=size;
        this.price=price;
    }
}



class NIC
{
    String name;
    String dateOfBirth;
    String address;
    NIC(String name, String dateOfBirth, String address)
    {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
    }
}



class HW_1_8
{
    public static void main(String[] args) {
        Food food=new Food("Fruit","Better");
        Clothes clothes=new Clothes("White",8,2000);
        NIC nic=new NIC("Saddar","05-02-2004","Bukhari Colony Dadu");
        Human h1=new Human("Saddar",food,clothes,nic);
        System.out.println("This is human class: ");
        System.out.println("Name of human: "+h1.name);
        h1.speak();
        Human.Heart heart =h1.new Heart();
        heart.function();
        heart.heartBeating();
        Human.Liver liver=h1.new Liver();
        liver.function();
        System.out.println("\nAggregation starts from here:");
        System.out.println("Type of food is: "+h1.food.type);
        System.out.println("Quality of food: "+h1.food.quality);
        System.out.println("Color of clothes is: "+h1.clothes.color);
        System.out.println("Price of clothes is: "+h1.clothes.price);
        System.out.println("Size of clothes is: "+h1.clothes.size+" meter");
        System.out.println("NIC Class:");
        System.out.println("Name: "+h1.nic.name);
        System.out.println("Date of birth: "+h1.nic.dateOfBirth);
        System.out.println("Address: "+h1.nic.address);
    }
}

