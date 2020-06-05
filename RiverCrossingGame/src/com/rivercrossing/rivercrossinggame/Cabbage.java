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
public class Cabbage {
    
    private boolean isNorth = false;
    private int nOrder = 1;

    public Cabbage() {
    }

    public Cabbage(boolean isNorth) {
        this.isNorth = isNorth;
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
