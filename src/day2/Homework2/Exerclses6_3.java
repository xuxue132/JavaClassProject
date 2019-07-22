package day2.Homework2;

import java.util.Scanner;

public class Exerclses6_3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Please input the number: ");
        int number=input.nextInt();

        System.out.println(isPalindrome(number));
    }
    public static int reverse(int number){
        int number2=0;

        //将数倒叙
        while (number>0){
            number2+=number%10;
            number2=number2*10;
            number=number/10;
        }

        return number2/10;
    }

    public static boolean isPalindrome(int number){
        int number2=reverse(number);

        //判断是否为回文
        if(number2!=number)
            return false;
        else
            return true;
    }
}
