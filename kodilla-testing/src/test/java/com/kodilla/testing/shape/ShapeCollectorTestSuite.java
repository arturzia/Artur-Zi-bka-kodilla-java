package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //Given
        Square square = new Square(4);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapes().size());

    }

    @Test
    public void removeFigure(){

        //Given
        Circle circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, shapeCollector.getShapes().size());
    }

    @Test
    public void getFigure(){
        //Given
        Circle circle = new Circle(2.0);
        Triangle triangle = new Triangle(5.0);
        Square square = new Square(3);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //When
        Shape result = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(triangle, result);
    }
}
