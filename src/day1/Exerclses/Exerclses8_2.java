package day1.Exerclses;

import java.util.Scanner;

public class Exerclses8_2 {
    public static void main(String[] args){
        System.out.println("Enter a 4-by-4 matrix row by row: ");

        double[][] number=new double[4][4];
        double sum=0;
        Scanner input=new Scanner(System.in);

        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++) {
                number[i][j]=input.nextDouble();
            }
            sum+=number[i][i];
        }

        System.out.print("Sum of the elements in the major digonal is "+sum);
    }
}
