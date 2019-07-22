package day4;

import java.util.Date;

public class Listing11_1 {
    private String color="white";
    private boolean filled;
    private java.util.Date dateCreate;

    public Listing11_1() {
        dateCreate=new java.util.Date();
    }

    public Listing11_1(String color, boolean filled, Date dateCreate) {
        this.color = color;
        this.filled = filled;
        dateCreate=new java.util.Date();
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

    public Date getDateCreate() {
        return dateCreate;
    }

    public String toString(){
        return "create on "+dateCreate+"\ncolor: "+color+" and filled: "+filled;
    }
}
