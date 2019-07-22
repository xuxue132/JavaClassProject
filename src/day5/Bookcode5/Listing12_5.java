package day5.Bookcode5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing12_5 {
    public static void main(String[] args){
        Scanner intput=new Scanner(System.in);
        boolean continueInput=true;

        do{
            try {
                System.out.print("Enter an integer: ");
                int number=intput.nextInt();

                //Display the result
                System.out.println("The number entered is "+number);

                continueInput=false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again.("+"Incorrect input : an integer is required");
                intput.nextLine();
            }
        }while (continueInput);
    }
}
