package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();


    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {

        shapes.add(shape);

    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shapes)) {
            shapes.remove(shapes);
            result = true;
        }
        return result;


    }

    public Shape getFigure(int n) {

        if (n >= 0 && n < shapes.size()) {
            Shape theShapes = shapes.get(n);
            return theShapes;
        }

        return null;
    }

    public void showFigures() {
    }

}