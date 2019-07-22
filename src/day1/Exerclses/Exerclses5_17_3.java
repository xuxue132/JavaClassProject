package day1.Exerclses;

import java.util.Scanner;

public class Exerclses5_17_3 {
    public static void main(String[] args){
        System.out.print("Enter the number of line: ");
        Scanner input=new Scanner(System.in);
        int line=input.nextInt();
        int i=1,k=0,h=2,j=1;
        if (i <= line) {
            do {
                j = 1;
                h = 2;
                if (j <= 2 * line - 2 * i) {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j <= 2 * line - 2 * i);
                }
                k = i;
                if (k >= 1) {
                    do {
                        System.out.print(k + " ");
                        k--;
                    } while (k >= 1);
                }
                if (h <= i) {
                    do {
                        System.out.print(h + " ");
                        h++;
                    } while (h <= i);
                }
                System.out.println();
                i++;
            } while (i <= line);
        }
    }
}
