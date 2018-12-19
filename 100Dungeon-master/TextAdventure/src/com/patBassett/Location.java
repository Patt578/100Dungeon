package com.patBassett;

import com.patBassett.Paint.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
/**
 * This class is used to micro-manage the floors of the dungeon and in turn will be used in the application of the map.
 * This class will also be used to determine the orientation of the players screen.
 * @author Zachary Thomas
 *
 *Author's notes:
 *Ask where we want to handle the room change, because it could be here, in the player class or in one of the front end classes,
figure that out and implement as necessary.
 */
public class Location {

	//fields
    private Room[][] coordinate = new Room[24][24];
    private boolean isNorth = true;
    private boolean isSouth = false;
    private boolean isEast = false;
    private boolean isWest = false;
    private Player pc;





    // constructor for the location object
    public Location(Player player){
    	this.pc = player;
    	for (int i = 0; i < coordinate.length; i++) {
    		for (int k = 0; k < coordinate.length; k++) {
    			coordinate[i][k] = new Room();
    		}
    	}
    	setRoom();
    }
    /**
     * sets the current room coordinate to the playable characters room
     */
    public void setRoom() {
    	pc.currentRoom = coordinate[pc.getX()][pc.getY()];
    	
    }
    public Room getRoom() {
    	return pc.currentRoom;
    }
    /**
     * checks for the change of coordinates and updates current room
     * 
     */
    public void changedRoom(boolean updateRoom) {
    	if (updateRoom) {
    		setRoom();
    		GameScreen.connect();
    	}
    }
   
    /**
     * sets the boolean value of the of isNorth,isSouth, etc....
     * connects to the main game screen s.t. it rotates the character
     */
    public void orientation() {
    	if(isNorth) {
    		pc.isFacingNorth();
    	}else if (isEast) {
    		pc.isFacingEast();
    	}else if (isWest) {
    		pc.isFacingWest();
    	}
    	else {
    		pc.isFacingSouth();
    	}
    	GameScreen.connect();
    }




}
