package com.patBassett;

import com.patBassett.NPCs.NPCs;
import com.patBassett.Paint.Inventory;

import java.util.ArrayList;

public class Player {
    int health = 50;
    int mana = 50;
    int coin = 0;



    String name, race, playerClass;

    int xPos= 0;
    int yPos = 0;


    boolean facingNorth = true;
    boolean facingSouth = false;
    boolean facingEast= false;
    boolean facingWest = false;

    int Strength =10;
    int Dexteritry = 10;
    int Intelligence = 10;
    int Charisma = 10;
    int Vigor = 10;

    int initiative;
    int dodge;
    int ac;

    int magicResist;
    int physicalResist;

    int experince;
    int level;


    int x;
    int y;

    int mining;
    int smithing;
    int fishing;
    int fletching;
    int crafting;
    int herblore;
    int slieghtOfHand;
    int insight;
    int perception;
    int deception;
    int enchanting;

    int pp;
    int stealth;







    public static ArrayList<NPCs> party = new ArrayList<>();


    Inventory inv;


    public Player(String name,int x,int y, String race, String playerClass) {

        this.x = x;
        this.y = y;



    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }



    private void use(){

    }

    private void take(){

    }

    private void drop(){

    }

    private void attack(){

    }

    private void inspect(){

    }

    public boolean isFacingNorth() {
        return facingNorth;
    }

    public void setFacingNorth(boolean facingNorth) {
        this.facingNorth = facingNorth;
    }

    public boolean isFacingSouth() {
        return facingSouth;
    }

    public void setFacingSouth(boolean facingSouth) {
        this.facingSouth = facingSouth;
    }

    public boolean isFacingEast() {
        return facingEast;
    }

    public void setFacingEast(boolean facingEast) {
        this.facingEast = facingEast;
    }

    public boolean isFacingWest() {
        return facingWest;
    }

    public void setFacingWest(boolean facingWest) {
        this.facingWest = facingWest;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }



}
