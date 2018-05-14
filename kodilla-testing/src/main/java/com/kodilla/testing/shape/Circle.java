package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double radius;
    private String name = "Circle";
    private final double PI = 3.14159;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return radius * radius * PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius, name);
    }
}
