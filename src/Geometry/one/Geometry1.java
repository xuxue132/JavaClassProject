package Geometry.one;
import javafx.scene.paint.Color;

import java.util.Scanner;

public class Geometry1 {
    public static void main(String[] args){
        Triangle triangle=new Triangle();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入三角形三条边: ");
        while (true) {
            try {
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();
                triangle.setSide1(side1);
                triangle.setSide2(side2);
                triangle.setSide3(side3);
                triangle.side();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }
        Circle circle=new Circle();
        System.out.println("请输入圆半径: ");
        while (true) {
            try {
                double radius=input.nextDouble();
                circle.setRadius(radius);
                circle.radius();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }
        GeometricObject[] RandomCreateGeometricObject=new GeometricObject[]{triangle,circle};

        RandomCreateGeometricObject[0].setColor(Color.RED);
        RandomCreateGeometricObject[0].setFilled(false);
        System.out.println(RandomCreateGeometricObject[0].toString());

        RandomCreateGeometricObject[1].setColor(Color.RED);
        RandomCreateGeometricObject[1].setFilled(false);
        System.out.println(RandomCreateGeometricObject[1].toString());

    }
}

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

class Triangle extends GeometricObject{
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws Exception{
        if(side1+side2<side3 || side1+side3<side1 || side3+side2<side1)
            throw new Exception("不能构成三角形");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void side()throws Exception{
        if(side1+side2<=side3 || side1+side3<=side1 || side3+side2<=side1)
            throw new Exception("不能构成三角形");
    }
    @Override
    public void draw(){
    }
    @Override
    public  void erase(){
    }

    public double getArea(){
        double p=(side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString(){
        return "The color is "+getColor()+" is "+getFilled()+" filled "+",The area is "+getArea()
                +" and the perimeter is "+getPerimeter();
    }
}

class Circle extends GeometricObject{
    private double radius=0;
    private static final double PI=3.14;

    public Circle() {
    }

    public Circle(double radius) throws Exception{
        if(radius<0)
            throw new Exception("半径不能为负数");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void radius() throws Exception{
        if(radius<0)
            throw new Exception("半径不能为负数");
    }
    @Override
    public void draw(){
    }
    @Override
    public  void erase(){
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString(){
        return "The color is "+getColor()+" is "+getFilled()+" filled "+",The area is "+getArea()
                +" and the perimeter is "+getPerimeter();
    }
}