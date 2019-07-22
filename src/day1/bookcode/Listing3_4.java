package bookcode;

import java.util.Scanner;

public class Listing3_4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //Enter the weight
        System.out.print("Enter weight in pounds: ");
        double weigth=input.nextDouble();

        //Enter the height
        System.out.print("Enter height in pound: ");
        double heigth=input.nextDouble();

        final double KIL0GRAMS_PER_P0UND=0.45359237;
        final double METERS_PER_INCH=0.0254;

        //compute BMI
        double weightKilograms=weigth*KIL0GRAMS_PER_P0UND;
        double heightMeters=heigth*METERS_PER_INCH;
        double bmi=weightKilograms/(heightMeters*heightMeters);

        System.out.println("BMI is: "+bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi<25)
            System.out.println("Normal");
        else if(bmi<30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
