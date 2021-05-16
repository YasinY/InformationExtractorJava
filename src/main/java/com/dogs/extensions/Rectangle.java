package com.dogs.extensions;

public class Rectangle extends java.awt.Rectangle {

    public Rectangle(int left, int top, int right, int bottom) {
        super(left, top, (right - left), (bottom - top));
    }


    // x2 = x1 + 41
    @Override
    public double getMaxX() {
        return Math.abs(getMinX() + 41);
    }

    // y1 = y2 + 14
    @Override
    public double getMinY() {
        return Math.abs(getMaxY() + 14);
    }
}
