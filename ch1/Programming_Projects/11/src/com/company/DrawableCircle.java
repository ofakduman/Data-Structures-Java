package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawableCircle extends JFrame implements DrawableInt{
    private Circle circle=null;

    public DrawableCircle(Circle circle){
        this.circle = circle;
        setTitle("Circle");
        setSize(1080,550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public DrawableCircle(){
        setTitle("Circle");
        setSize(1080,550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public boolean is_inputs_are_valid() {
        if (circle==null || circle.getRadius()<=0)
            return false;
        return true;
    }

    @Override
    public void paint(Graphics g) {
        if(is_inputs_are_valid())
            g.drawOval(500, 200, (int) circle.getRadius(),(int) circle.getRadius());
        else
            System.out.println("Dude circle is not valid input!");
    }
}
