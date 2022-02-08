package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Coordinate extends JFrame {
    private LinkedList<Point> coordinate = new LinkedList<>();
    private LinkedList<Integer> importance = new LinkedList<>();

    private static final int N = 3; //to remove node count total 3 most least importance node will be removed



    public int removeLeastSignificant(){
        int index = 0;
        int leastOneIndex = 0;
        int leastOne = 0;
        int temp = 0;
        Iterator iter = importance.iterator();
        if (iter.hasNext())
            leastOne = (int) iter.next();

        while(iter.hasNext()){
            temp = (int) iter.next();
            index++;
            if (leastOne>temp) {
                leastOneIndex = index;
                leastOne = temp;
            }
        }
        ListIterator iter2 = importance.listIterator(leastOneIndex);
        ListIterator coordinateIter = coordinate.listIterator(leastOneIndex+1);
        coordinateIter.next();
        coordinateIter.remove();

        iter2.next();
        iter2.remove();

        Point P = (Point) coordinateIter.next();
        Point R = (Point) coordinateIter.next();
        coordinateIter.previous();
        coordinateIter.previous();
        Point L = (Point) coordinateIter.previous();


        iter2.add(calculateImportance(P,R,L));

        importance.removeLast();
        return 0;
    }
    public Coordinate(){
        setTitle("Shape");
        setSize(700,550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void add(int x, int y){
        coordinate.add(new Point(x, y));
        if (coordinate.size()>2){
            ListIterator iterator = coordinate.listIterator(coordinate.size());
            addImportance((Point) iterator.previous(), (Point) iterator.previous(), (Point) iterator.previous());

        }
    }

    private int calculateImportance(Point R, Point P, Point L){
        int l1 =(int) Math.sqrt(Math.pow((P.x - R.x),2) + Math.pow((P.y - R.y),2));
        int l2 =(int) Math.sqrt(Math.pow((P.x - L.x),2) + Math.pow((P.y - L.y),2));
        int l3 =(int) Math.sqrt(Math.pow((R.x - L.x),2) + Math.pow((R.y - L.y),2));

        return l1+l2-l3;
    }
    private void addImportance(Point R, Point P, Point L){
        importance.add(calculateImportance(R,P,L));
    }


    public void run(){
        for (int i = 0; i < N; i++) {
            removeLeastSignificant();
        }
    }
    public void readCoordinate(String shapeCoordinate){
        String [] tokens = shapeCoordinate.split(", ");
        for (int i = 0; i < tokens.length; i+=2) {
            add(Integer.parseInt(tokens[i]),Integer.parseInt(tokens[i+1])) ;
        }
    }

    private void printImportances(){
        Iterator iter = importance.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next()+"  ");
        }
    }

    public void paint(Graphics g)
    {
        for (int i = 1; i < coordinate.size(); i++) {
            g.drawLine(coordinate.get(i-1).getX(), coordinate.get(i-1).getY(), coordinate.get(i).getX(), coordinate.get(i).getY() );

        }
    }





    private class Point{
        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

}
