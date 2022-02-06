import java.util.Scanner;

public class Square extends Shape{
    private double edge;

    public Square(){}

    // Accessors
    public double getEdge() {return edge;}

    public void setEdge(double edge){this.edge = edge;}

    public Square(int edge){
        super("Square");
        this.edge = edge;
    }

    @Override
    public double computeArea() {
        return edge*edge;
    }

    @Override
    public double computePerimeter() {
        return edge*4;
    }

    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the edge of the square");
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
