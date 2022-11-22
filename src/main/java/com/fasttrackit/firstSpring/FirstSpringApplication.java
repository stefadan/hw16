package com.fasttrackit.firstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		//System.out.println("In main FirstSpringApplication");
		SpringApplication.run(FirstSpringApplication.class, args);
		CountryService cs = new CountryService();
		System.out.println("All countries as objects: "+cs.getCountriesAsObject());
		System.out.println("All countries: "+cs.getCountries());
		System.out.println("Capital "+cs.getCapitalOfCountry("Malta"));
		System.out.println("Population "+cs.getPopulationOfCountry("Malta"));
		System.out.println("Countries in continent "+cs.getCountriesInContinent("Europe"));
		System.out.println("Countries in continent with population"+cs.getCountriesInContinentWithPopulation
				("Europe", 10000000));
		System.out.println("Neighbours "+cs.getNeighbours("Romania"));
		System.out.println("Neighbours "+cs.getCountriesWithNeighbor("BGR", "ROU"));

	}

}
