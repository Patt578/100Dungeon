package com.patBassett.Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaceSelection extends JPanel {


    JButton human, elf, dwarf, gnome;
    JLabel title;
    JPanel titlePanel, buttonPanel;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,60);


    public RaceSelection(){


        titlePanel = new JPanel();
        titlePanel.setBounds(200, 100, 600, 150);
        titlePanel.setBackground(Color.BLACK);

        title = new JLabel("Select your race");
        titlePanel.add(title);
        title.setForeground(Color.WHITE);
        title.setFont(titleFont);

        title.setSize(600,150);







        human = new JButton("Human");
        elf = new JButton("Elf");
        dwarf = new JButton("Dwarf");
        gnome = new JButton("Gnome");

        human.setForeground(Color.WHITE);
        elf.setForeground(Color.WHITE);
        dwarf.setForeground(Color.WHITE);
        gnome.setForeground(Color.WHITE);

        human.setBackground(Color.BLACK);
        elf.setBackground(Color.BLACK);
        dwarf.setBackground(Color.BLACK);
        gnome.setBackground(Color.BLACK);

   human.setBounds(200,500,100,100);
        elf.setBounds(300,500,100,100);
        dwarf.setBounds(400,500,100,100);
        gnome.setBounds(500,500,100,100);

        human.setToolTipText("Selection of this race includes:    +1 to all ability scores");
        elf.setToolTipText("Selection of this race includes:    +2 Dexterity  +2 to Wisdom");
        dwarf.setToolTipText("Selection of this race includes:    +2 Strength  +2 Vigor");
        gnome.setToolTipText("Selection of this race includes:    +2 Intelligence  +2 Dexterity");

        human.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





            }
        });


        this.add(human);
        this.add(elf);
        this.add(dwarf);
        this.add(gnome);

        this.add(titlePanel);
        this.setBackground(Color.BLACK);

        this.setVisible(true);


    }
}
