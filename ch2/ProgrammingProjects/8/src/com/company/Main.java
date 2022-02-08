package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Main extends JFrame {

    public static void main(String[] args) {
        String shapeCoordinate = "110, 60, 80, 100, 120, 150, 100, 250, 130, 300, 170, 230, 150, 190, 180, 70, 160, 50";

        List<Point> coordinates = new LinkedList<>();
        Point before = null;
        Point current = null;
        System.out.println("sonuc:" + Math.pow(3,5));

        Coordinate coordinate = new Coordinate();
        Coordinate coordinate2 = new Coordinate();
        coordinate.readCoordinate(shapeCoordinate);
        coordinate2.readCoordinate(shapeCoordinate);
        coordinate.run();//make shape more less shape as defined in Coordinate Class assigned N number
        coordinate.paint(null);
        coordinate2.paint(null);
    }
}
