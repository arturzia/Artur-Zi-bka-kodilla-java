package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String nameCountry;
    private final BigDecimal peopleQuantity;

    public Country(final String nameCountry, final BigDecimal peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPeopleQuantity() {

        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameCountry, country.nameCountry) &&
                Objects.equals(peopleQuantity, country.peopleQuantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameCountry, peopleQuantity);
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}