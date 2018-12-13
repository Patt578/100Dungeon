package com.patBassett.Paint.RoomComponents;

import javax.swing.*;
import java.awt.*;

public class Wall extends JPanel {

    @Override
    protected void paintComponent(Graphics g){

        g.setColor(Color.WHITE);

        g.drawLine(0,60,800,60);
        g.drawLine(0,540,800,540);


    }

}
