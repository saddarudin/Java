/*
Implement the following scenario in java
Continent and Country class are aggregated and City is composed with Country
Continent
-cname:String
-listOfCountries:ArrayList
-size:double
+getter and setter of attributes
+displayCountries


Country
-cname:String
-listOfCities:ArrayList
-capacity:City
+Country(_,_)
+displayCities()
+noOfCities():int
+CapitalCity():City


City
-cname:String
-population:long
+displayCity()

 */
package com.java;

import java.util.ArrayList;

class Continent {
    private String cname;
    private double size;
    private ArrayList<Country> countryList=new ArrayList<>();
    Continent(String[] list)
    {
        for (String s : list) countryList.add(new Country(s));
    }

    public void setCname(String cname)
    {
        this.cname=cname;
    }
    public void setSize(double size)
    {
        this.size=size;
    }
    public String getCname()
    {
        return cname;
    }
    public double getSize()
    {
        return size;
    }
    public void displayCountries()
    {
        System.out.println("Country Names: ");
        for(int i=0; i<countryList.size(); i++)
            System.out.println((i+1)+". "+countryList.get(i).countryName);
    }
}
class Country
{
    public String countryName;
    private City capitalCity;
    private String city;
    private ArrayList<City> listOfCities = new ArrayList<>();
    class City
    {
        private String cityName;
        private double population;
        public City(String cityName)
        {
            this.cityName=cityName;
        }
        public void setPopulation(double population)
        {
            this.population=population;
        }
        public void displayCity()
        {
            System.out.println("Name of capital city is: "+cityName);
            System.out.println("Population is "+population);
        }
    }
    public Country(String[] cityList)
    {
        for(int i=0; i<cityList.length; i++)
            listOfCities.add(new City(cityList[i]));
    }
    public Country(String countryName)
    {
        this.countryName=countryName;
    }
    public void displayCities()
    {
        System.out.println("Name of cities: ");
        for(int i=0; i<listOfCities.size(); i++)
        {
            System.out.println(listOfCities.get(i).cityName);
        }
    }
    public int noOfCities()
    {
        return listOfCities.size();
    }
    public City Capital()
    {
        return capitalCity;
    }
    public String getCountryName(){return countryName;}
}
class ContinentCountryAggregation
{
    public static void main(String[] args) {
        String[] countryNames={"Fiji","Papua New Guinea","Solomon Island","Marshal Island","Northern Mariana Island","American Samoa",
                "Micronesia","New Zealand","Vanuatu","New Caledonia","French Polynesia","Australia","Samoa","Palau","Cook Island","Guam",
                "Niue","Tokelau","Kiribati","Tuvalu","Wallis and Futuna Islands","Nauru","Tonga"};
        Continent C = new Continent(countryNames);
        C.setCname("Australia");
        C.setSize(7692000);
        System.out.println(C.getCname());
        System.out.println(C.getSize());
        C.displayCountries();
        String[] citiesOfFiji={"Suva","Nadi","Lautoka","Labasa"};
        String[] citiesOfPNG={"Port Moresby","Lae","Madang","Arawa","Mount Hagen","Popondetta","Mendi","Wewak","Goroka","Kavieng","Kimbe",
                "Daru","Alotau","Vanimo","Kundiawa","Lorengau","Kerema","Wabag","Kokopo","Kurumul","Tari","Buka"};
        Country c1=new Country(citiesOfPNG);
        Country c2=new Country("Papua New Guinea");
        System.out.println(c2.countryName);
        System.out.println("Number of cities: "+c1.noOfCities());
        Country.City city1 = c1.new City("Port Moresby");
        city1.setPopulation(383000);
        city1.displayCity();
        c1.displayCities();
    }
}
