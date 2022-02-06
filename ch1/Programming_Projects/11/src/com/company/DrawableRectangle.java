package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawableRectangle extends JFrame implements DrawableInt {
    private Rectangle rectangle=null;


    public DrawableRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
        setTitle("Rectangle");
        setSize(1080,550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public DrawableRectangle(){
        setTitle("Rectangle");
        setSize(1080,550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public boolean is_inputs_are_valid() {
        if (rectangle==null || (rectangle.getHeight()<=0 || rectangle.getWidth()<=0))
            return false;
        return true;
    }


    @Override
    public void paint(Graphics g) {
        if(is_inputs_are_valid())
            g.drawRect(400, 200, (int) rectangle.getWidth(),(int) rectangle.getHeight());
        else
            System.out.println("Dude rectangle is not valid input!");
    }


}
