package com.kodilla.testing.shape;

public class Application {

    public static void main (String[] args){

        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.0);
        Triangle triangle = new Triangle(5.0);
        Square square = new Square(3);
        Circle circle2 = new Circle(3.0);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle2);

        for (Shape k: shapeCollector.getShapes()) {
            shapeCollector.showFigures(k);
            System.out.println();
        }

        Shape getFigure = shapeCollector.getFigure(1);

        System.out.println("Get figure no. 1: ");
        shapeCollector.showFigures(getFigure);

        shapeCollector.removeFigure(triangle);


        for (Shape k: shapeCollector.getShapes()) {
            shapeCollector.showFigures(k);
            System.out.println();
        }



    }

}
