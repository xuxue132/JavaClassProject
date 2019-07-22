package day3.Homework3;

public class Exerclses9_9 {
    public static void main(String[] args) {
        //创建三个对象
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);



        System.out.printf("regularPolygon1 area is %.1f and perimeter is %.1f", regularPolygon1.getArea(),
                regularPolygon1.getPerimeter());
        System.out.println();
        System.out.printf("regularPolygon2 area is %.1f and perimeter is %.1f", regularPolygon2.getArea(),
                regularPolygon2.getPerimeter());
        System.out.println();
        System.out.printf("regularPolygon3 area is %.1f and perimeter is %.1f", regularPolygon3.getArea(),
                regularPolygon3.getPerimeter());
        System.out.println();
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.x = 0;
        this.y = 0;
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //计算周长
    public double getPerimeter() {
        return n * side;
    }

    //计算面积
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}