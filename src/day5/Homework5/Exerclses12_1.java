package day5.Homework5;

import java.util.Scanner;

public class Exerclses12_1 {
    public static void main(String[] args){
        int sum=0;
        int x1,x3;
        String x2;
        Scanner input=new Scanner(System.in);
        try{
            x1=input.nextInt();
            x2=input.next();
            x3=input.nextInt();
            if(x2.charAt(0)=='+'){
                sum=x1+x3;
            }
            else if(x2.charAt(0)=='-'){
                sum=x1-x3;
            }
            System.out.print(x1+x2+x3+"="+sum);
        }
        catch (Exception e){
            System.out.print("wrong input: ");
            input.nextLine();
        }
    }
}
