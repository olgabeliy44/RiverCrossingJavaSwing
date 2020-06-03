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
public class Boat {

    private int maxCapacity = 2;
    private boolean isNorth;
    
    public Boat() {
    }

    public Boat(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Boat(boolean isNorth) {
        this.isNorth = isNorth;
    }

    public boolean isIsNorth() {
        return isNorth;
    }

    public void setIsNorth(boolean isNorth) {
        this.isNorth = isNorth;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
}
