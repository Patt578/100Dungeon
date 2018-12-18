package com.patBassett.Paint.RoomComponents;

import javax.swing.*;
import java.awt.*;

public class HallwayWithLeftExit extends JPanel {




    @Override
    protected void paintComponent(Graphics g){

        g.setColor(Color.WHITE);

        g.drawLine(30,0,280,150);
        g.drawLine(30,600,280,350);
        g.drawLine(280,150,280,350);

        g.drawLine(770,0,460,200);
        g.drawLine(770,600,460,280);
        g.drawLine(460,200,460,280);


        g.drawLine(350,200,280,200);
       g.drawLine(350,200,350,280);
        g.drawLine(350,280,280,280);
    }

}
