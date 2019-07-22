package Geometry.two;
import java.io.*;

class Triangle1  implements  GeometricObject2, Serializable {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle1() {
    }

    public Triangle1(double side1, double side2, double side3) throws Exception{
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

    public void writeToFile(File f) throws IOException {
        ObjectOutputStream text=new ObjectOutputStream(new FileOutputStream(f));
        text.writeObject(this);

    }

    @Override
    public String toString(){
        return "The triangle area is "+getArea() +" and the perimeter is "+getPerimeter();
    }
}
