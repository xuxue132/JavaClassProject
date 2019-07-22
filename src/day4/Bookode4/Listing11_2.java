package day4.Bookode4;

public class Listing11_2 extends day4.Listing11_1 {
    private double radius;

    public Listing11_2(){
    }

    public Listing11_2(double radius,String color,boolean filled){
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

    public double getDiameter(){
        return 2*radius;
    }

    public double getPermeter(){
        return 2*radius*Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is create "+getDateCreate()+" and the radius is "+radius);
    }
}
