package com.patBassett.Paint;

import com.patBassett.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassSelection extends JPanel {


    JButton paladin, priest, warrior, rouge, ranger, wizard;
    JLabel title;
    JPanel titlePanel;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,60);

    String playerClass;



    public ClassSelection(Player player){


        titlePanel = new JPanel();
        titlePanel.setBounds(200, 100, 600, 150);
        titlePanel.setBackground(Color.BLACK);

        title = new JLabel("Select your class");
        titlePanel.add(title);
        title.setForeground(Color.WHITE);
        title.setFont(titleFont);

        title.setSize(600,150);


        paladin = new JButton("Paladin");
        priest = new JButton("Priest");
        warrior = new JButton("Warrior");
        rouge = new JButton("Rouge");
        ranger = new JButton("Ranger");
        wizard = new JButton("Wizard");


        paladin.setForeground(Color.WHITE);
        priest.setForeground(Color.WHITE);
        warrior.setForeground(Color.WHITE);
        rouge.setForeground(Color.WHITE);
        ranger.setForeground(Color.WHITE);
        wizard.setForeground(Color.WHITE);


        paladin.setBackground(Color.BLACK);
        priest.setBackground(Color.BLACK);
        warrior.setBackground(Color.BLACK);
        rouge.setBackground(Color.BLACK);
        ranger.setBackground(Color.BLACK);
        wizard.setBackground(Color.BLACK);

        paladin.setBounds(100,500,100,100);
        priest.setBounds(200,500,100,100);
        warrior.setBounds(300,500,100,100);
        rouge.setBounds(400,500,100,100);
        ranger.setBounds(500,500,100,100);
        wizard.setBounds(600,500,100,100);

        paladin.setToolTipText("A strong upfront holy warrior, specializing in party buffs and safety while providing great front-line utility.");
        priest.setToolTipText("An excellent back-line support mage, specializing in healing, CC, and utility spells to provide the party survivability and buffs.");
        warrior.setToolTipText("A tanky front-line fighter, specializing in cleave damage, damage reduction, and exceptional single target damage.");
        rouge.setToolTipText("A stealthy hard to hit assassin, specializing in the use of of poison, massive single target crits, and exceptional evasion.");
        ranger.setToolTipText("A both up close and long range class, specializing in the use of bows, crossbows, and shortswords to provide a flexible single target damage.");
        wizard.setToolTipText("Blow shit up while being extremely squishy.");


        paladin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                playerClass = "paladin";
                player.setPlayerClass(playerClass);
                new GameScreen().cleartoMain(player);
            }
        });

        priest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                playerClass = "priest";
                player.setPlayerClass(playerClass);
                new GameScreen().cleartoMain(player);
            }
        });
        warrior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                playerClass = "warrior";
                player.setPlayerClass(playerClass);
                new GameScreen().cleartoMain(player);
            }
        });
        rouge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                playerClass = "rouge";
                player.setPlayerClass(playerClass);
                new GameScreen().cleartoMain(player);
            }
        });
        ranger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                playerClass = "ranger";
                player.setPlayerClass(playerClass);
                new GameScreen().cleartoMain(player);
            }
        });
        wizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                playerClass = "wizard";
                player.setPlayerClass(playerClass);
                new GameScreen().cleartoMain(player);
            }
        });




        this.add(paladin);
        this.add(priest);
        this.add(warrior);
        this.add(rouge);
        this.add(ranger);
        this.add(warrior);
        this.add(wizard);


        this.add(titlePanel);
        this.setBackground(Color.BLACK);

        this.setVisible(true);


    }
}
