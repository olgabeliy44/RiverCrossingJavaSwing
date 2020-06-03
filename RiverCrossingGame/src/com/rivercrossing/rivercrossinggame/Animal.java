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
public class Animal {
    
    private boolean isNorth;
    private int nOrder;

    public Animal() {
    }

    public Animal(boolean isNorth) {
        this.isNorth = isNorth;
    }

    public Animal(boolean isNorth, int nOrder) {
        this.isNorth = isNorth;
        this.nOrder = nOrder;
    }

    public boolean isIsNorth() {
        return isNorth;
    }

    public void setIsNorth(boolean isNorth) {
        this.isNorth = isNorth;
    }

    public int getnOrder() {
        return nOrder;
    }

    public void setnOrder(int nOrder) {
        this.nOrder = nOrder;
    }
    
}
