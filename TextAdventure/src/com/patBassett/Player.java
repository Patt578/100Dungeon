package com.patBassett;

import com.patBassett.NPCs.NPCs;

import java.util.ArrayList;

public class Player {
    int health = 50;
    int mana = 50;
    int coin = 0;
    String name;

    int xPos= 0;
    int yPos = 0;


    boolean facingNorth = true;
    boolean facingSouth = false;
    boolean facingEast= false;
    boolean facingWest = false;

    int Strength;
    int Dexteritry;
    int Intelligence;
    int Charisma;
    int Vigor;

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


    public Player(String name, int strength, int dexteritry, int intelligence, int charisma, int vigor, int x,int y) {
        this.name = name;
        this.Strength = strength;
        this.Dexteritry = dexteritry;
        this.Intelligence = intelligence;
        this.Charisma = charisma;
        this.Vigor = vigor;
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






}
