package Geometry.two;

import java.io.*;

class Circle1  implements GeometricObject2, Serializable {
    private double radius=0;
    private static final double PI=3.14;

    public Circle1() {
    }

    public Circle1(double radius) throws Exception{
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

    public void writeToFile(File f) throws IOException {
        ObjectOutputStream text=new ObjectOutputStream(new FileOutputStream(f));
        text.writeObject(this);
    }

    @Override
    public String toString(){
        return ",The circle area is "+getArea()
                +" and the perimeter is "+getPerimeter();
    }
}
