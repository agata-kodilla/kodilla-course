package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeList.remove(shape);
    }

    public Shape getFigure(int shapeNumber) {
        Shape shape = null;
        if (shapeList.size() > 0 && shapeNumber <= shapeList.size()) {
            shape = shapeList.get(shapeNumber);
        }
        return shape;
    }

    public List<Shape> showFigures() {
        List<Shape> list = null;
        if (shapeList.size() > 0) {
            list = shapeList;
        }
        return list;
    }

    public int getShapesQuantity() {
        return shapeList.size();
    }

    public double measureField(Shape shape) {
        return shape.getField();
    }
}
