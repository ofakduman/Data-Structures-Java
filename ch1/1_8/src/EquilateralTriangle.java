import java.util.Scanner;

public class EquilateralTriangle extends Shape{
    private double edge;

    public EquilateralTriangle(){}

    // Accessors
    public double getEdge() {return edge;}

    public void setEdge(double edge){this.edge = edge;}

    public EquilateralTriangle(int edge){
        super("EquilateralTriangle");
        this.edge = edge;
    }

    @Override
    public double computeArea() {
        return (1.73*edge*edge)/4;
    }

    @Override
    public double computePerimeter() {
        return edge*3;
    }

    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the edge of the EquilateralTriangle");
        edge = in.nextDouble();
    }



    @Override
    public String toString(){
        return  "\nShape name: " + getShapeName() +
                "\nedge: " + getEdge() +
                "\nperimeter: " + computePerimeter() +
                "\narea: " + computeArea();
    }






}
