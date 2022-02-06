package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Rectangle rectangle = new Rectangle(280,230);
        //DrawableRectangle d = new DrawableRectangle(rectangle);
        //d.paint(null);

        Circle c = new Circle(100);
        DrawableCircle dc = new DrawableCircle(c);
        dc.paint(null);

    }
}
