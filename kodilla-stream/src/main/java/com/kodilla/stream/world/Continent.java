package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

    private final String nameContinent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {

        return nameContinent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }


    public List<Country> getCountry() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(nameContinent, continent.nameContinent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameContinent);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "nameContinent='" + nameContinent + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}
