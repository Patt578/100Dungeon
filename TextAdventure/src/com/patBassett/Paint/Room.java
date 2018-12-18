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







}
