package day1.Exerclses;

import java.util.Scanner;

public class Exerclses8_6 {
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = input.nextDouble();
            }
        }
        c = multiplyMatrix(a, b);
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "   ");
            }
            if (i == 1)
                System.out.print(" + ");
            else
                System.out.print("   ");
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "   ");
            }
            if (i == 1)
                System.out.print(" = ");
            else
                System.out.print("   ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.1f", c[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }
        return c;
    }

}
