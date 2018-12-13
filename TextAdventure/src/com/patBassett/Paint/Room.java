package com.patBassett.Paint;

import com.patBassett.Player;

import javax.swing.*;
import java.awt.*;

public class Room extends JPanel {



    JPanel northPanel;
    JPanel southPanel;
    JPanel eastPanel;
    JPanel westPanel;




    public Room(JPanel n, JPanel s, JPanel e, JPanel w){
        this.northPanel= n;
        this.southPanel = s;
        this.eastPanel = e;
        this.westPanel = w;

    }


    public JPanel getNorthPanel() {
        return northPanel;
    }

    public void setNorthPanel(JPanel northPanel) {
        this.northPanel = northPanel;
    }

    public JPanel getSouthPanel() {
        return southPanel;
    }

    public void setSouthPanel(JPanel southPanel) {
        this.southPanel = southPanel;
    }

    public JPanel getEastPanel() {
        return eastPanel;
    }

    public void setEastPanel(JPanel eastPanel) {
        this.eastPanel = eastPanel;
    }

    public JPanel getWestPanel() {
        return westPanel;
    }

    public void setWestPanel(JPanel westPanel) {
        this.westPanel = westPanel;
    }


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
