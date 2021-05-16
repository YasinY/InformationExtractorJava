package com.dogs.window;

public class Rectangle extends java.awt.Rectangle {

    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
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
