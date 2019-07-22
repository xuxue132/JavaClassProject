package day4.Bookode4;

import java.util.Date;

public abstract class Listing13_1 {
    private String color="white";
    private boolean filled;
    private java.util.Date dateCretead;

    protected Listing13_1(){
        dateCretead=new java.util.Date();
    }

    public Listing13_1(String color, boolean filled) {
        dateCretead=new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCretead() {
        return dateCretead;
    }

    public String toString(){
        return "create on "+dateCretead+"\ncolor: "+color+
                " and filled: "+filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
