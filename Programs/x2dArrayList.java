package com.java;

import java.util.ArrayList;
/*
Create a two-dimensional arraylist<String> named dinner that stores
two arraylists named food and drinks
Insert some food items in food list and drinks in drink
Print dinner list, food list and drinks list.
 */

public class x2dArrayList {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<>();
        food.add("Sada Biryani");
        food.add("Chicken Biryani");
        food.add("Chicken");
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("cold drink");
        drinks.add("lassi");
        drinks.add("tea");
        drinks.add("coffee");
        ArrayList<ArrayList<String>> dinner=new ArrayList<>();
        dinner.add(food);
        dinner.add(drinks);
        System.out.println(dinner);//printing all things
        System.out.println(dinner.get(0));//printing list that is at 0 index
        System.out.println(dinner.get(1));//printing the list that is at index 1
        for(int i=0;i<dinner.size();i++) System.out.println(dinner.get(i));
        //printing 1st item of first list
        System.out.println(dinner.get(0).get(0));
        //printing 1st item of second list
        System.out.println(dinner.get(1).get(0));
        //Printing all items of both the lists
        for (ArrayList<String> strings : dinner) {
            for (String string : strings) System.out.println(string);
        }
    }
}
