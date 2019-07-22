package day4.homework4;

import day4.Bookode4.Listing13_1;
import day4.Bookode4.Listing13_2;
import day4.Bookode4.Listing13_3;

public class Exerclses13_7 {
    public static void main(String[] args){
        Listing13_1[] object=new Listing13_1[]{new Square(5),new Listing13_2(5),new Listing13_3(2,3),
        new Square(2),new Square(1)};

        for(int i=0;i<object.length;i++){
            System.out.println(object[i].getArea()+" and "+object[i].getPerimeter());
            if(object[i] instanceof Colorable){
                ((Colorable)object[i]).hoTocolor();
            }
            System.out.println();
        }
    }

}

class Square extends Listing13_1 implements Colorable{
    private double side;
    public Square(double side) {
        this.side=side;
    }

    @Override
    public void hoTocolor(){
        System.out.println("Color all for sides");
    }

    @Override
    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return 4*side;
    }

}
interface Colorable{
    public abstract void hoTocolor();
}