package com.patBassett.Paint.RoomComponents;

import javax.swing.*;
import java.awt.*;

public class Door extends JPanel {

    @Override
    protected void paintComponent(Graphics g){

        g.setColor(Color.WHITE);
        g.drawLine(20,5,90,60);
        g.drawLine(780,5,710,60);
        g.drawRect(90,60,620,475);
        g.drawLine(20,600,90,535);
        g.drawLine(780,600,710,535);
        g.drawRect(320,250,200,285);


    }

}
