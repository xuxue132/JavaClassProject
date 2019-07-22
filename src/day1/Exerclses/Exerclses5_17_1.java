package Exerclses;

import java.util.Scanner;

public class Exerclses5_17_1 {
    public static void main(String[] args){
        System.out.print("Enter the number of line: ");
        Scanner input=new Scanner(System.in);
        int line=input.nextInt();

        for(int i=1;i<=line;i++){
            for(int j=1;j<=2*line-2*i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int h=2;h<=i;h++){
                System.out.print(h+" ");
            }
            System.out.println();
        }
    }
}
