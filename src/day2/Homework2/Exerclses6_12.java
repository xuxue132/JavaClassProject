package day2.Homework2;

import java.util.Scanner;

public class Exerclses6_12 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the string range: ");
        String x1=input.next();
        String x2=input.next();

        char ch1=x1.charAt(0);
        char ch2=x2.charAt(0);

        System.out.print("Please enter the number specified for each line: ");
        int numberPerLine=input.nextInt();

        printChars(ch1,ch2,numberPerLine);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int i=0;

        while (ch1<=ch2){
            System.out.print(ch1);
            i++;
            if(i==numberPerLine){
                System.out.println();
                i=0;
            }
            ch1++;
        }
    }
}
