package com.patBassett.Paint;

import com.patBassett.Paint.RoomComponents.HallwayWithLeftExit;
import com.patBassett.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GameScreen implements KeyListener {


    JFrame window;
    Container container;
    JPanel titlePanel, startPanel, mainPanel, mapPanel, characterPanel, invPanel, optionPanel, nameSelectPanel;
    JLabel title, name;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
    JButton startButton, load, exit;
    JTextField textField, nameField;

    JButton spells, guilds, skills, stats, friends, equip, talents, logout;


    Rectangle rect = new Rectangle(1000, 800);




    public GameScreen() {
        buildScreen();
        this.container = window.getContentPane();
        buildTitlePanel();


    }

    //Note that the players race and class are currently just String and may be changed at a later date
    public void raceSelection() {
        Player player = new Player(null,0,0,null,null);
        characterPanel = new RaceSelection(player);
        characterPanel.setBounds(rect);
        container.add(characterPanel);


    }

    public void clear(Player player){


            window.getContentPane().removeAll();
            window.repaint();

            nameSelection(player);


    }

    public void cleartoMain(Player player){


        window.getContentPane().removeAll();
        window.repaint();

        buildMain(player);


    }

    public void nameSelection(Player player) {

    nameSelectPanel =new JPanel();
            nameSelectPanel.setBounds(rect);
            nameSelectPanel.setBackground(Color.BLACK);

    name =new JLabel("Enter you name");
            nameSelectPanel.add(name);
            name.setForeground(Color.WHITE);
            name.setFont(titleFont);
            name.setSize(500,100);

    nameField =new JTextField(10);
            nameSelectPanel.add(nameField);
            nameField.setBackground(Color.GRAY);
            nameField.setSize(300,100);


            container.add(nameSelectPanel);

            nameField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed (ActionEvent e){
            window.getContentPane().removeAll();
            window.repaint();

            player.setName(nameField.getText());
            classSelection(player);




        }
    });
}

public void classSelection(Player player){
        characterPanel = new ClassSelection(player);
    characterPanel.setBounds(rect);
    container.add(characterPanel);



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


             raceSelection();
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
            window.setSize(1000, 850);
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            window.getContentPane().setBackground(Color.BLACK);
            window.setLayout(null);
            window.setVisible(true);


        }

        public void buildMain(Player player){
        //mainPanel is what needs to be updated on player direction within a room
        mainPanel = new HallwayWithLeftExit();
        mainPanel.setBounds(3,3,800,600);
        mainPanel.setBackground(Color.BLACK);
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));

        //Temporary implementation
        JProgressBar healthBar = new JProgressBar();
            healthBar.setString(100 + "/"+100);
            healthBar.setStringPainted(true);
            healthBar.setValue(100);
            healthBar.setMaximum(100);
            healthBar.setBackground(Color.red);
            healthBar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));

            healthBar.setVisible(true);

            mainPanel.add(healthBar);


        GridLayout map = new GridLayout(12,12);

            //Temporary implementation
        mapPanel = new Map();
        mapPanel.setLayout(map);
        mapPanel.setBounds(810,10,170,170);
        mapPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        mapPanel.setBackground(Color.BLACK);
            for (int i =0; i<144 ; i++){
                final JLabel label = new JLabel();
                label.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
                mapPanel.add(label);
            }




        textField = new JTextField("Enter Command",8);
            textField.setBounds(3,603,800,200);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);
        textField.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        textField.setSelectedTextColor(Color.WHITE);

// I'm going to make all items in the game extend JLabel
            // This still needs updating
        GridLayout grid = new GridLayout(6,4,3,3);
        invPanel = new Inventory();
        invPanel.setLayout(grid);
        invPanel.setBounds(810,190,170,400);
        invPanel.setBorder(BorderFactory.createLineBorder(Color.white,3));
        invPanel.setBackground(Color.BLACK);

            for (int i =0; i<24 ; i++){
                final JLabel label = new JLabel("Label");
                label.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                invPanel.add(label);
            }




        GridLayout grid1 = new GridLayout(2,4,3,3);
        optionPanel = new JPanel();
        optionPanel.setLayout(grid1);
        optionPanel.setBounds(810,600,170,200);
        optionPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        optionPanel.setBackground(Color.BLACK);


        spells = new JButton("1");
            guilds = new JButton("2");
            skills = new JButton();
            stats= new JButton();
            friends = new JButton();
            equip = new JButton();
            talents= new JButton();
            logout = new JButton();






            spells.setForeground(Color.WHITE);
            guilds.setForeground(Color.WHITE);
            skills.setForeground(Color.WHITE);
            stats.setForeground(Color.WHITE);
            friends.setForeground(Color.WHITE);
            equip.setForeground(Color.WHITE);
            talents.setForeground(Color.WHITE);
            logout.setForeground(Color.WHITE);

            spells.setBackground(Color.BLACK);
            guilds.setBackground(Color.BLACK);
            skills.setBackground(Color.BLACK);
            stats.setBackground(Color.BLACK);
            friends.setBackground(Color.BLACK);
            equip.setBackground(Color.BLACK);
            talents.setBackground(Color.BLACK);
            logout.setBackground(Color.BLACK);




            optionPanel.add(spells);
            optionPanel.add(guilds);
            optionPanel.add(skills);
            optionPanel.add(stats);
            optionPanel.add(friends);
            optionPanel.add(equip);
            optionPanel.add(talents);
            optionPanel.add(logout);






        container.add(optionPanel);
        container.add(invPanel);
        container.add(textField);
        container.add(mapPanel);
        container.add(mainPanel);



            window.setVisible(true);


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
