package Geometry.two;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Geometry2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        File file=new File("GeometricObjects_.dat");
        if(RandomCreateGeometricObject(file)){
            System.out.println("true");
        }
        ArrayList<GeometricObject2> notes = new ArrayList<>();
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));

        try {
            notes = (ArrayList<GeometricObject2>)(objectInputStream.readObject());
        }
        catch (Exception ex){
            System.out.print(ex.getMessage());
        }

        for (GeometricObject2 e:notes){
            System.out.println(e);
            System.out.println("its perimeter is " + e.getPerimeter());
            System.out.println("its area is " + e.getArea() +"\n");
        }
    }

    public static Boolean RandomCreateGeometricObject(File file) throws Exception {
        ArrayList<GeometricObject2> notes = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
            notes = (ArrayList<GeometricObject2>)(objectInputStream.readObject());
        }
        catch (Exception ignored){

        }
        boolean flag=false;
        GeometricObject2 note=null;
        int x=(int)(Math.random()*100+1);
        Scanner input=new Scanner(System.in);
        if(x<33){
                try {
                    double side1 = Math.random() * 100 + 1;
                    double side2= Math.random() * 100 + 1;
                    double side3= Math.random() * 100 % (side1 + side2 - Math.abs(side1 - side2)) + Math.abs(side1 - side2);
                    note = new Triangle1(side1, side2, side3);
                    flag=true;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
        }
        else if(x<66){
                try {
                    double radius=Math.random()*100+1;
                    note =new Circle1(radius);
                    flag=true;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
        }

        else {
            note = new Rectangle1(Math.random() * 100 + 1, Math.random() * 100 + 1);
            flag=true;
        }
        notes.add(note);
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(file));
            oos.writeObject(notes);
            flag = true;

        return flag;
    }
}