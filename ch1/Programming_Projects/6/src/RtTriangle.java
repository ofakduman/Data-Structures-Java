import java.util.Scanner;

public class RtTriangle extends Shape {
    private double base;
    private double height;

    RtTriangle(){}
    RtTriangle(double bas, double hei){
        super("RtTriangle");
        base = bas;
        height = hei;
    }

    public double getBase() {return base;}
    public double getHeight() {return height;}
    public void setBase(double base) {this.base = base;}
    public void setHeight(double height) {this.height = height;}

    @Override
    public double computeArea() {
        return base*height/2;
    }

    @Override
    public double computePerimeter() {
        double kenar=Math.sqrt(Math.pow((base/2),2) + Math.pow(height,2));
        return 2*kenar + base;
    }

    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the Rectangle");
        base = in.nextDouble();
        System.out.println("Enter the height of the Rectangle");
        height = in.nextDouble();
    }

    @Override
    public String toString(){
        return  "\nShape name: " + getShapeName() +
                "\nbase: " + getBase() +
                "\nheight: " + getHeight() +
                "\nperimeter: " + computePerimeter() +
                "\narea: " + computeArea();
    }

}
