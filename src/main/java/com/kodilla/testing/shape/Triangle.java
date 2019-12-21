package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 1 / 2 * a * h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                h == triangle.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h);
    }
}
