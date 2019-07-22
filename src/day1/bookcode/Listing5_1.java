package bookcode;

import java.util.Scanner;

public class Listing5_1 {
    public static void main(String[] args){
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);

        Scanner input=new Scanner(System.in);
        System.out.print("What is "+number1+"+"+number2+"?");
        int answer=input.nextInt();

        while (number1+number2!=answer){
            System.out.print("Wrong answer .try again.What is "+number1+"+"+number2+"?");
            answer=input.nextInt();
        }
        System.out.println("You got it!");
    }
}
