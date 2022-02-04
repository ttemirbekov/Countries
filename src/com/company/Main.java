package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Country1 country = new Country1();
        country.setName("Japan");
        country.setLocation("East Asia");
        country.setCapitall("Tokyo");
        country.setArea(377.975);
        country.setPopulation(125.8);
        country.setCurrency("Japanese yen");
        country.setEmperor("Naruhito");
        country.setPrimeminister("Fumio Kishida");

        System.out.println("Country: " + country.getName());
        System.out.println("Location: " + country.getLocation());
        System.out.println("Capital: " + country.getCapitall());
        System.out.println("Total Area: " + country.getArea() + " " + "sq km") ;
        System.out.println("Population: " + country.getPopulation() + " " + "million people");
        System.out.println("Currency: " + country.getCurrency());
        System.out.println("Emperor: " + country.getEmperor());
        System.out.println("Prime-Minister: " + country.getPrimeminister());

        System.out.println("***************************************************");

        Country2 country2 = new Country2();
        country2.setName("Australia");
        country2.setLocation("South East,lying between Indian and Pacific Oceans");
        country2.setCapitall("Canberra");
        country2.setArea(377.975);
        country2.setPopulation(25.69);
        country2.setCurrency("Australian Dollar");
        country2.setPresident("Doesn't have");
        country2.setPrimeminister("Scott Morrison");
        System.out.println("Country: " + country2.getName());
        System.out.println("Location: " + country2.getLocation());
        System.out.println("Capital: " + country2.getCapitall());
        System.out.println("Total Area: " + country2.getArea() + " " + "sq km");
        System.out.println("Population: " + country2.getPopulation() + " " +  "million people");
        System.out.println("Currency: " + country2.getCurrency());
        System.out.println("President: " + country2.getPresident());
        System.out.println("Prime-Minister: " + country2.getPrimeminister());

        System.out.println("*******************************************************");

        Country3 country3 = new Country3();
        country3.setName("United States of America");
        country3.setLocation("North America");
        country3.setCapitall("Washington");
        country3.setArea(9.834);
        country3.setPopulation(329.5);
        country3.setCurrency("American Dollar");
        country3.setPresident("Joe Biden");
        country3.setPrimeminister("Doesn't have");
        System.out.println("Country: " + country3.getName());
        System.out.println("Location: " + country3.getLocation());
        System.out.println("Capital: " + country3.getCapitall());
        System.out.println("Total Area: " + country3.getArea() + " million sq km");
        System.out.println("Populaton: " + country3.getPopulation() + " " + "million people");
        System.out.println("Currency: " + country3.getCurrency());
        System.out.println("President: " + country3.getPresident());
        System.out.println("Prime-Minister: " + country3.getPrimeminister());

    }
}

