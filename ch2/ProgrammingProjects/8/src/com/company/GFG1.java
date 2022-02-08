package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class MyCanvas extends JComponent {

    public void paint(Graphics g)
    {
        String shapeCoordinate = "110, 60, 80, 100, 120, 150, 100, 250, 130, 300, 170, 230, 150, 190, 180, 70, 160, 50";
        List<Point> coordinates = new LinkedList<>();
        Point before = null;
        Point current = null;
        coordinates.add(new Point(110,60));
        coordinates.add(new Point(80,100));
        coordinates.add(new Point(120,150));
        coordinates.add(new Point(100,250));
        coordinates.add(new Point(130,300));
        coordinates.add(new Point(170,230));
        coordinates.add(new Point(150,190));
        coordinates.add(new Point(180,70));
        coordinates.add(new Point(160,50));

        ListIterator iter = (ListIterator) coordinates.iterator();
        // draw and display the line
        before = (Point) iter.next();
        current = (Point) iter.next();
        System.out.println("before: " + before);
        System.out.println("current: " + current);
        g.drawLine(before.getX(), before.getY(), current.getX(), current.getY() );

  /*      while(iter.hasNext()){
            before = (Point) iter.next();
            current = (Point) iter.next();
            g.drawLine(before.getX(), current.getY(), current.getX(), current.getY() );
        }
*/
        for (int i = 1; i < coordinates.size(); i++) {
            g.drawLine(coordinates.get(i-1).getX(), coordinates.get(i-1).getY(), coordinates.get(i).getX(), coordinates.get(i).getY() );

        }


    }
}

public class GFG1 {
    public static void main(String[] a)
    {

        // creating object of JFrame(Window popup)
        JFrame window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(30, 30, 200, 200);

        // setting canvas for draw
        window.getContentPane().add(new MyCanvas());

        // set visibility
        window.setVisible(true);
    }
}