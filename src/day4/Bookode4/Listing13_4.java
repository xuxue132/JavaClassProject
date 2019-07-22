package day4.Bookode4;

public class Listing13_4 {
    public static void main(String[] args){
        Listing13_1 listing13_2=new Listing13_2(5);
        Listing13_1 listing13_3=new Listing13_3(5,3);

        System.out.println("The two object have the same area? "+
                equalArea(listing13_2,listing13_3));

        displayListing13_1(listing13_2);
        displayListing13_1(listing13_3);
    }

    public static boolean equalArea(Listing13_1 object1,
                                    Listing13_1 object2){
        return object1.getArea()==object2.getArea();
    }

    public static void displayListing13_1(Listing13_1 object){
        System.out.println();
        System.out.println("The area is "+object.getArea());
        System.out.println("The perimeter is "+object.getPerimeter());
    }
}
