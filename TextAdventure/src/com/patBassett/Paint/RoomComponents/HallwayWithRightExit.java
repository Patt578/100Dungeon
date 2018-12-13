package com.patBassett.Paint.RoomComponents;

import javax.swing.*;
import java.awt.*;

public class HallwayWithRightExit extends JPanel {


    @Override
    protected void paintComponent(Graphics g){

        g.setColor(Color.WHITE);

        g.drawLine(30,0,360,200);
        g.drawLine(30,600,360,280);
        g.drawLine(360,200,360,280);

        g.drawLine(770,0,560,150);
        g.drawLine(770,600,560,350);
        g.drawLine(560,150,560,350);

        g.drawLine(500,200,500,280);
        g.drawLine(500,200,560,200);
        g.drawLine(500,280,560,280);
    }


}
