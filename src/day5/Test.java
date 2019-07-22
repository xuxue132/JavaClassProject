package day5;

import javafx.scene.shape.CullFace;
import org.omg.CORBA.MARSHAL;

import java.util.Random;

public class Test {
}

interface Solid{
    public double volume();
}

class Sphere implements Solid{
    private double radius; //球半径
    public Sphere(){
        radius=0.0;
    }
    public Sphere(double r){
        radius=r;
    }
    public double volume(){
        return 4.0/3.0* Math.PI*radius*radius*radius;
    }
    public String toString(){
        return "球半径="+new java.text.DecimalFormat("0.00").format(radius);
    }
}

//声明立方体类
class Cuboid implements Solid{
    private double height,breadth,length;
    public Cuboid(){
        this(0.0,0.0,0.0);
    }
    public Cuboid(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public double volume(){
        return length*breadth*height;
    }
    public String toString(){
        return "立方体长="+new java.text.DecimalFormat("0.00").format(length)+
                "; 宽="+new java.text.DecimalFormat("0.00").format(breadth)+
                "; 高="+new java.text.DecimalFormat("0.00").format(height);
    }
}//类Coboid结束

//声明圆柱体类
class Cylinder implements Solid{
    private double heigth,radius;//高，半径
    public Cylinder(){
        this(0.0,0.0);
    }

    public Cylinder(double heigth, double radius) {
        this.heigth = heigth;
        this.radius = radius;
    }
    public double volume(){
        return Math.PI*radius*radius*heigth;
    }
    public String toString(){
        return "圆柱体高="+new java.text.DecimalFormat("0.00").format(heigth)+
                "; 半径="+new java.text.DecimalFormat("0.00").format(radius);
    }
}//类Cylinder结束

//声明随机生成对象类
class RandomSolidGenerator{
    private Random rand=new Random();
    public Solid next(){
        switch (rand.nextInt(3)){
            default:
            case 0:return new Sphere(Math.random()*10.0);
            case 1:return new Cuboid(Math.random()*10.0,Math.random()*10.0,Math.random()*10);
            case 2:return new Cylinder(Math.random()*10.0,Math.random()*10.0);
        }
    }//next方法结束
}//类RandomSolidGenerator

//声明主测试类
class VolumeCompute{
    private static RandomSolidGenerator gen=new RandomSolidGenerator();
    public static void main(String[] args){
        Solid[] s=new Solid[6];
        for(int i=0;i<s.length;i++){
            s[i]=gen.next();
            System.out.println(s[i]+"; 体积="+new java.text.DecimalFormat("0.00").format(s[i].volume()));
        }
    }
}