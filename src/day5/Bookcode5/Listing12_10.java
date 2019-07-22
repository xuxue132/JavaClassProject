package day5.Bookcode5;

public class Listing12_10 {
    public static void main(String[] args){
        try{
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex){
            System.out.println(ex);
        }
        System.out.println("Number of objects created: "+CircleWithCustomException.getNumberOfObject());
    }
}

class InvalidRadiusException extends Exception{
    private double radius;

    public InvalidRadiusException(double radius){
        super("Invalid radius "+radius);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
}

class CircleWithCustomException{
    private double radius;
    private static int numberOfObject=0;

    public CircleWithCustomException()throws InvalidRadiusException{
        this(1.0);
    }

    public CircleWithCustomException(double newRadius)
        throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObject++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius)
        throws InvalidRadiusException{
        if(newRadius>=0)
            radius=newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObject(){
        return numberOfObject;
    }

    public double findArea(){
        return radius*radius*3.14159;
    }


}