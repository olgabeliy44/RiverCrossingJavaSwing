/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivercrossing.rivercrossinggame;

/**
 *
 * @author K
 */
public class Item {
    private boolean isBoatInNorth = false;
    private boolean isCabbageInNorth = false;
    private boolean isGoatInNorth = false;
    private boolean isWolfInNorth = false;

    public Item() {
    }

    public Item(boolean isBoatInNorth, boolean isCabbageInNorth, boolean isGoatInNorth, boolean isWolfInNorth) {
        this.isBoatInNorth = isBoatInNorth;
        this.isCabbageInNorth = isCabbageInNorth;
        this.isGoatInNorth = isGoatInNorth;
        this.isWolfInNorth = isWolfInNorth;
    }

    public boolean isIsBoatInNorth() {
        return isBoatInNorth;
    }

    public void setIsBoatInNorth(boolean isBoatInNorth) {
        this.isBoatInNorth = isBoatInNorth;
    }

    public boolean isIsCabbageInNorth() {
        return isCabbageInNorth;
    }

    public void setIsCabbageInNorth(boolean isCabbageInNorth) {
        this.isCabbageInNorth = isCabbageInNorth;
    }

    public boolean isIsGoatInNorth() {
        return isGoatInNorth;
    }

    public void setIsGoatInNorth(boolean isGoatInNorth) {
        this.isGoatInNorth = isGoatInNorth;
    }

    public boolean isIsWolfInNorth() {
        return isWolfInNorth;
    }

    public void setIsWolfInNorth(boolean isWolfInNorth) {
        this.isWolfInNorth = isWolfInNorth;
    }
    
    
}
