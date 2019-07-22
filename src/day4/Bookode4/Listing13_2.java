package day4.Bookode4;

public class Listing13_2 extends Listing13_1 {
    private double radius;

    public Listing13_2(double radius){
        this.radius=radius;
    }

    public Listing13_2(double radius,String color,boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getPermeter(){
        return 2*radius*Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is create "+getDateCretead()+" and the radius is "+radius);
    }
}
