package Geometry.two;

import java.io.*;

public class Rectangle1 implements GeometricObject2, Serializable {
    private double wideth;
    private double height;

    public Rectangle1() {
    }

    public Rectangle1(double wideth,double height) throws Exception{
        if(wideth<0 || height<0)
            throw new Exception("不能构成矩形");
        this.wideth=wideth;
        this.height=height;
    }

    public double getWideth() {
        return wideth;
    }

    public void setWideth(double wideth) {
        this.wideth = wideth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw(){
    }
    @Override
    public  void erase(){
    }

    public double getArea(){
        return wideth*height;
    }

    public double getPerimeter(){
        return 2*(wideth+height);
    }

    public void writeToFile(File f) throws IOException {
        ObjectOutputStream text=new ObjectOutputStream(new FileOutputStream(f));
        text.writeObject(this);
    }

    @Override
    public String toString(){
        return ",The rectangle area is "+getArea()
                +" and the perimeter is "+getPerimeter();
    }
}
