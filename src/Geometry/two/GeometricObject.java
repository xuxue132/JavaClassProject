package Geometry.two;

import javafx.scene.paint.Color;

abstract class GeometricObject{
    private Color color;
    private boolean filled;
    private java.util.Date date;

    public GeometricObject() {
        date=new java.util.Date();
    }

    public GeometricObject(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
        date=new java.util.Date();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract void draw();

    public abstract void erase();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();
}