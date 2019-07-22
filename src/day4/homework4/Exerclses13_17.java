package day4.homework4;

import java.util.Scanner;

public class Exerclses13_17 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        double a1=input.nextDouble();
        double b1=input.nextDouble();
        System.out.println("Enter the second complex number: ");
        double a2=input.nextDouble();
        double b2=input.nextDouble();
        Complex x1= new Complex(a1,b1);
        Complex x2=new Complex(a2,b2);
        x1.add(x2);
        System.out.println(x1.toString(x2));
        x1.substract(x2);
        System.out.println(x1.toString(x2));
        x1.multiply(x2);
        System.out.println(x1.toString(x2));

        try {
            x1.divide(x2);
            System.out.println(x1.toString(x2));
        }catch (ArithmeticException e){
            System.out.println("除数不能为零");
        }
    }

}
class Complex {
    private double a;
    private double b;
    double number1;//The real part of the result
    double number2;//The imaginary part of the result
    int i;//Judge symbol
    public void Complex() {
    }

    public  Complex(double a, double b) {
        this.a=a;
        this.b=b;
    }

    public  Complex(double a) {
        this.a=a;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }
    public Complex add(Complex o){
        number1=a+o.a;
        number2=b+o.b;
        i=1;
        return new Complex(number1,number2);
    }
    public Complex substract(Complex o){
        number1=a-o.a;
        number2=b-o.b;
        i=2;
        return new Complex(number1,number2);
    }
    public Complex multiply(Complex o){
        number1=a*o.a- b*o.b;
        number2=b*o.a+ a*o.b;
        i=3;
        return new Complex(number1,number2);
    }
    public Complex divide(Complex o){
        if(o.a==0&&o.b==0)
            throw new ArithmeticException();
        number1=(a*o.a+ b*o.b)/(o.a*o.a+o.b*o.b);
        number2=(b*o.a- a*o.b)/(o.a*o.a+o.b*o.b);
        i=4;
        return new Complex(number1,number2);
    }

    public String toString(Complex o){
        char x =0;
        switch (i){
            case 1: x='+';break;
            case 2: x='-';break;
            case 3: x='*';break;
            case 4: x='/';break;
        }
        return "("+a+"+"+b+"i"+")"+x+"("+o.a+"+"+o.b+"i"+")"+"="+number1+"+"+number2+"i";
    }
}