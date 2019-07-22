package day4;

import java.util.Date;

public class Listing13_11 implements Cloneable, Comparable<Listing13_11>{
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public Listing13_11(int id, double area) {
        whenBuilt=new java.util.Date();
        this.id = id;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public int compareTo(Listing13_11 o) {
        if(area>o.area)
            return 1;
        else if(area<o.area)
            return -1;
        else
            return 0;
    }
}


