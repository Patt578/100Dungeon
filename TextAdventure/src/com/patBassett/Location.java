package com.patBassett;

import com.patBassett.Paint.Room;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Location {


    Room[][] rooms = new Room[24][24];







    public Location( ){



    }


    public void addRoom(Room room, int x, int y){
        room = rooms[x][y];


    }



}
