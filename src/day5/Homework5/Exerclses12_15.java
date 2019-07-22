package day5.Homework5;

import java.io.IOException;
import java.util.Scanner;

public class Exerclses12_15 {
    public static void main(String[] args)throws IOException {
        java.io.File file=new java.io.File("Exerclses12_15.text");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        java.io.PrintWriter output=new java.io.PrintWriter(file);

        for(int i=0;i<100;i++){
            int x=(int)(Math.random()*101);
            output.print(x+" ");
        }
        output.close();

        Scanner input=new Scanner(file);

        int []a=new int[100];
        int i=0;
        int x=0;
        while (input.hasNext()){
            a[i]=input.nextInt();
            i++;
        }
        for(int j=0;j<100;j++){
            for (int h=0;h<99;h++){
                if(a[h]>a[h+1]){
                    x=a[h];
                    a[h]=a[h+1];
                    a[h+1]=x;
                }
            }
        }

        for(int h=0;h<100;h++){
            System.out.print(a[h]+" ");
        }
        input.close();
    }
}
