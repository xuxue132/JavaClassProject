package day3.Bookcode3;

public class SimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius +
                " is " + circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius +
                " is " + circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius +
                " is " + circle3.getArea());

        SimpleCircle circle4 = new SimpleCircle(100);
        System.out.println("The area of the circle of radius " + circle4.radius +
                " is " + circle4.getArea());
    }
    double radius;

    public SimpleCircle() {
        radius=1;
    }

    public SimpleCircle(double radius) {
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
