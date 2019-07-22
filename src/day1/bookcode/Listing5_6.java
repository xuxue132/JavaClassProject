package bookcode;

import java.util.Scanner;

public class Listing5_6 {
    public static void main(String[] args){
        int date;
        int sum=0;

        Scanner input=new Scanner(System.in);

        //Keep read the date until input is 0
        do{
            System.out.print("Enter an integer (if input ends if it is 0): ");
            date=input.nextInt();
            sum+=date;
        }while (date!=0);
        System.out.print("The sum is: "+sum);
    }
}
