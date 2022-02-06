package com.company;

import javax.swing.*;
import java.awt.*;

public class Peach extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.cyan);
        g.fillRect(100,100, 98,75);

    }
}
