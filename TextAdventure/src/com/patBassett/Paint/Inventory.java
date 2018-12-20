package com.patBassett.Paint;

import com.patBassett.Items.Items;

import javax.swing.*;

public class Inventory extends JPanel {

    Items[][] inv = new Items[6][4];



    public Inventory(){


    }


    public void addItem(int x, int y,Items item){
        this.inv[x][y] = item;
    }


    public Items[][] getInv() {
        return inv;
    }


}
