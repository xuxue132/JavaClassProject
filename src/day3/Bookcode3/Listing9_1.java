package day3.Bookcode3;

public class Listing9_1 {
    public static void main(String [] args){
        SimpleCirle circle1=new SimpleCirle();
        System.out.println("The area of the circle of radius "+circle1.radius+
                " is "+circle1.getArea());

        SimpleCirle circle2=new SimpleCirle(25);
        System.out.println("The area of the circle of radius "+circle2.radius+
                " is "+circle2.getArea());

        SimpleCirle circle3=new SimpleCirle(125);
        System.out.println("The area of the circle of radius "+circle3.radius+
                " is "+circle3.getArea());

        SimpleCirle circle4=new SimpleCirle(100);
        System.out.println("The area of the circle of radius "+circle4.radius+
                " is "+circle4.getArea());
    }
}

class SimpleCirle{
    double radius;

    public SimpleCirle() {
        radius=1;
    }

    public SimpleCirle(double radius) {
        this.radius = radius;
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

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
