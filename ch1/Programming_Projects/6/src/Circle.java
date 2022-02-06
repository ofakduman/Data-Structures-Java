import java.util.Scanner;

public class Circle extends Shape {
    private double radius = 0;


    Circle(){}
    Circle(double radi){
        super("Circular");
        radius = radi;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double computeArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double computePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        radius = in.nextDouble();
    }

    @Override
    public String toString(){
        return  "\nShape name: " + getShapeName() +
                "\nradius: " + getRadius() +
                "\nperimeter: " + computePerimeter() +
                "\narea: " + computeArea();
    }
}
