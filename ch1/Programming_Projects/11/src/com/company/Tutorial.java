package com.company;

import javax.swing.*;
import java.awt.*;

public class Tutorial extends JFrame {
    public Tutorial(){
        setTitle("Tutorial");
        setSize(1080,550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        g.drawRect(480,300,280,230);
    }

    public static void main(String[] args){
        Tutorial t = new Tutorial();
        t.paint(null);
    }
}
