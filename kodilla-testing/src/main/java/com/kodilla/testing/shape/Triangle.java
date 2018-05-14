package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{

    private double side;
    private String name = "Triangle";

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (side * side * sqrt(3.0))/4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(side, name);
    }
}
