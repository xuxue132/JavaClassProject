package day4.Bookode4;

public class Listing13_3 extends Listing13_1{
    private double width;
    private double height;

    public Listing13_3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Listing13_3(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}

