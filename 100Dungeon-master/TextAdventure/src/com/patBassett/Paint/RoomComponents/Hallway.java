package com.patBassett.Paint.RoomComponents;

import javax.swing.*;
import java.awt.*;

public class Hallway extends JPanel {



    @Override
    protected void paintComponent(Graphics g){

        g.setColor(Color.WHITE);

        g.drawLine(30,0,360,200);
        g.drawLine(30,600,360,280);
        g.drawLine(360,200,360,280);

        g.drawLine(770,0,460,200);
        g.drawLine(770,600,460,280);
        g.drawLine(460,200,460,280);
    }


}
