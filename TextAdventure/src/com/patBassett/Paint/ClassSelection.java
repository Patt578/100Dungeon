package com.patBassett.Paint;

import javax.swing.*;
import java.awt.*;

public class ClassSelection extends JPanel {


    JButton paladin, priest, warrior, rouge, ranger, wizard;
    JLabel title;
    JPanel titlePanel;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,60);


    public ClassSelection(){


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

//        human.setToolTipText("Selection of this race includes:    +1 to all ability scores");
//        elf.setToolTipText("Selection of this race includes:    +2 Dexterity  +2 to Wisdom");
//        dwarf.setToolTipText("Selection of this race includes:    +2 Strength  +2 Vigor");
//        gnome.setToolTipText("Selection of this race includes:    +2 Intelligence  +2 Dexterity");
//


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
