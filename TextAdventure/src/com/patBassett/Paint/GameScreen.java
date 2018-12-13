package com.patBassett.Paint;

import com.patBassett.Paint.RoomComponents.Hallway;
import com.patBassett.Paint.RoomComponents.HallwayWithRightExit;
import com.patBassett.Paint.RoomComponents.Wall;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GameScreen implements KeyListener {




    JFrame window;
    Container container;
    JPanel titlePanel, startPanel, mainPanel, mapPanel;
    JLabel title;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,80);
    JButton startButton,load,exit;
    JTextField textField;

    String tempName;








    public GameScreen(){
        buildScreen();
        container = window.getContentPane();
        buildTitlePanel();
       buildMain();



        }

        public void buildTitlePanel(){

            titlePanel = new JPanel();
            titlePanel.setBounds(200, 200, 600, 150);
            titlePanel.setBackground(Color.BLACK);

            title = new JLabel("100 Dungeon");
            titlePanel.add(title);
            title.setForeground(Color.WHITE);
            title.setFont(titleFont);

            startPanel = new JPanel();
            startPanel.setBounds(440, 500, 150, 100);
            startPanel.setBackground(Color.LIGHT_GRAY);

            startButton = new JButton("Start New");
            load = new JButton("Load Game");
            exit = new JButton("Exit");

            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    window.getContentPane().removeAll();
                    window.repaint();

                  buildMain();
                }
            });

            load.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            load.setBackground(Color.BLACK);
            load.setForeground(Color.WHITE);
            exit.setBackground(Color.BLACK);
            exit.setForeground(Color.WHITE);
            startButton.setBackground(Color.BLACK);
            startButton.setForeground(Color.WHITE);
            startPanel.add(startButton);
            startPanel.add(load);
            startPanel.add(exit);

            container.add(titlePanel);
            container.add(startPanel);


        }

        public void buildScreen(){
            window = new JFrame();
            window.setSize(1000, 800);
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            window.setVisible(true);
            window.getContentPane().setBackground(Color.BLACK);
            window.setLayout(null);

        }

        public void buildMain(){
        mainPanel = new HallwayWithRightExit();
        mainPanel.setBounds(3,3,800,600);
        mainPanel.setBackground(Color.BLACK);
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));


        GridLayout map = new GridLayout(24,24);
        mapPanel = new Map();
        mapPanel.setLayout(map);
        mapPanel.setBounds(810,20,170,170);
        mapPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));


            Insets buttonMargin = new Insets(0,0,0,0);

            //        new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));

//            for (int ii = 0; ii < locations.length; ii++) {
//                for (int jj = 0; jj < locations[ii].length; jj++) {
//                    JButton b = new JButton();
//                    b.setMargin(buttonMargin);
//                    mapPanel.add(b);
//                    container.add(b);
//                    if (locations[ii][jj] != null) {
//                        b.setBackground(Color.WHITE);
//                    } else {
//                        b.setBackground(Color.BLACK);
//                    }
//
//
//                }
//            }


        textField = new JTextField("Enter Command",8);
            textField.setBounds(3,603,800,200);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);
        textField.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        textField.setSelectedTextColor(Color.WHITE);







        container.add(textField);
        container.add(mapPanel);
        container.add(mainPanel);






        }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
