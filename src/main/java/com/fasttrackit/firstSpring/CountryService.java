package com.fasttrackit.firstSpring;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountryService {
    List<Country> countries;

    {
        try {
            countries = CountryReader.readFileBuffered();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Stream<Country> countryStream = countries.stream();

    //- list all countries:  -> returns a list of country objects
    public List<Country> getCountriesAsObject() {
        return countries.stream()
                .filter(pers -> pers.getName().length() > 0).collect(toList());
    }

    //- list all country names :  -> returns a list of strings
    public List<String> getCountries() {
        List<String> countryName = countries.stream()
                .map(country -> country.getName()).toList();
        //System.out.println("Country name: " + countryName);
        return countryName;
    }

    //- get capital of a country :  -> returns a string
    public String getCapitalOfCountry(String country) {
        String retCountry = countries.stream()
                .filter(con -> con.getName().equalsIgnoreCase(country)).toList().toString();
        return retCountry.toString();
    }

    //- get population of a country : -> returns a long
    public long getPopulationOfCountry(String country) {
        List<Long> retCountry = countries.stream()
                .filter(ent -> ent.getName().equalsIgnoreCase(country))
                .map(ent -> ent.getPopulation())
                .collect(toList());
        //System.out.println("Population=" + retCountry);
        return retCountry.get(0);
    }

    //- get countries in continent : -> returns list of Country objects
    public List<Country> getCountriesInContinent(String continent) {
        List<Country> retCountry = countries.stream()
                .filter(ent -> ent.getContinent().equalsIgnoreCase(continent))
                .collect(toList());
        //System.out.println("Countries=" + retCountry);
        return retCountry;
    }

    //- get country neighbours :  -> returns list of Strings
    public List<String> getNeighbours(String country) {
        List<String> retCountry = countries.stream()
                .filter(ent -> ent.getName().equalsIgnoreCase(country))
                .map(ent -> ent.getNeighbours())
                .collect(toList());
        //System.out.println("Neighbours=" + retCountry);
        return retCountry;
    }

    //- get countries in <continent> with population larger than <population> : -> returns list of Country objects
    public List<Country> getCountriesInContinentWithPopulation(String continent, long population) {
        List<Country> retCountry = countries.stream()
                .filter(ent -> ent.getContinent().equalsIgnoreCase(continent))
                .filter(ent -> ent.getPopulation() > population)
                .collect(toList());
        //System.out.println("Countries=" + retCountry);
        return retCountry;
    }

    //- get countries that neighbor X but not neighbor Y :-> returns list of Country objects
    public List<Country> getCountriesWithNeighbor(String neightborX, String neightborY) {
        List<Country> retCountry = countries.stream()
                .filter(ent -> ent.getNeighbours().contains(neightborX))
                .filter(ent -> !ent.getNeighbours().contains(neightborY))
                .collect(toList());
        //System.out.println("Countries=" + retCountry);
        return retCountry;
    }

    @Override
    public String toString() {
        return "CountryService{" +
                "countries=" + countries +
                ", countryStream=" + countryStream +
                '}';
    }
}
