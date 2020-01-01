package com.kodilla.testing.shape;

import org.junit.*;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Shape circle = new Circle(4);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape square = new Square(7);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigureExisting() {
        //Given
        Shape triangle = new Triangle(7, 4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        assertTrue(result);
    }

    @Test
    public void testGetFigureExisting() {
        //Given
        Shape triangle = new Triangle(13, 33);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        assertEquals(triangle, figure);
    }

    @Test
    public void testGetFigureNotExisting() {
        //Given
        Shape triangle = new Triangle(13, 33);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        assertEquals(null, figure);
    }

    @Test
    public void testShowFiguresExisting() {
        //Given
        Shape triangle = new Triangle(13, 33);
        Shape square = new Square(45);
        Shape triangle2 = new Triangle(10, 33);
        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(circle);

        //When
        List<Shape> list = shapeCollector.showFigures();

        //Then
        assertEquals(4, list.size());
    }
    @Test
    public void testShowFiguresNotExisting() {
        //Given
        Shape triangle = new Triangle(13, 33);
        Shape square = new Square(45);
        Shape triangle2 = new Triangle(10, 33);
        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        List<Shape> list = shapeCollector.showFigures();

        //Then
        assertEquals(null, list);
    }

    @Test
    public void testMeasureFieldtExisting() {
        //Given
        Triangle triangle = new Triangle(17, 33);

        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        double triangleField = shapeCollector.measureField(triangle);

        //Then
        assertEquals(Double.doubleToLongBits(280.5), Double.doubleToLongBits(triangleField));
    }
}
