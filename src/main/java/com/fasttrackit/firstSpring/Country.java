package com.fasttrackit.firstSpring;

public class Country {
            int crt;
            String name;
            String capital;
            long population;
            int area;
            String continent;
            String neighbours;

    public Country(int i, String name, String capital, long population, int area,
                   String continent, String neighbours) {
        this.crt = i;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbours = neighbours;

    }
    public Country(int i, String token, String token1, long population, int area,
                   String continent) {
        this.crt = i;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
    }

    public int getCrt() {
        return crt;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }

    public String getNeighbours() {
        return neighbours;
    }

    @Override
    public String toString() {
        return "Country{" +
                "crt=" + crt +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", continent='" + continent + '\'' +
                ", neighbours='" + neighbours + '\'' +
                '}';
    }
}
