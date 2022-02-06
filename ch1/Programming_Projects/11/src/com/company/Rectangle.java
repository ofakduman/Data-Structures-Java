package com.company;

import java.awt.*;
import java.util.Scanner;

public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;

    //Constructors
    public Rectangle(){}
    public Rectangle(int wid, int hei){
        super("Rectangle");
        width = wid;
        height = hei;
    }

    // Accessors
    public double getWidth() {return width;}
    public double getHeight() {return height;}

    // Modifiers
    public void setWidth(int width) {this.width = width;}
    public void setHeight(int height) {this.height = height;}

    @Override
    public double computeArea(){ return width*height;}
    @Override
    public double computePerimeter(){ return 2*(width+height);}

    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle");
        width = in.nextDouble();
        System.out.println("Enter the height of the Rectangle");
        height = in.nextDouble();

    }

    @Override
    public String toString(){
        return  "\nShape name: " + getShapeName() +
                "\nwidth: " + getWidth() +
                "\nheight: " + getHeight() +
                "\nperimeter: " + computePerimeter() +
                "\narea: " + computeArea();
    }

}
