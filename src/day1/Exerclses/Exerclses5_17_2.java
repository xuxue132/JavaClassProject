package day1.Exerclses;

import java.util.Scanner;

public class Exerclses5_17_2 {
    public static void main(String[] args){
        System.out.print("Enter the number of line: ");
        Scanner input=new Scanner(System.in);
        int line=input.nextInt();
        int i=1,k=0,h=2,j=1;
        while(i<=line){
            j=1;
            h=2;
            while(j<=2*line-2*i){
                System.out.print(" ");
                j++;
            }
            k=i;
            while (k>=1){
                System.out.print(k+" ");
                k--;
            }
            while (h<=i){
                System.out.print(h+" ");
                h++;
            }
            System.out.println();
            i++;
        }
    }
}
