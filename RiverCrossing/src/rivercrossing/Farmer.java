/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivercrossing;

/**
 *
 * @author K
 */
public class Farmer {
    
    private String name;
    private boolean canDrive = true;
    private boolean isNorth = false;

    public Farmer() {
    }
    
    public Farmer(String name) {
        this.name = name;
    }

    public Farmer(String name, boolean isNorth) {
        this.name = name;
        this.isNorth = isNorth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanDrive() {
        return canDrive;
    }

    public void setCanDrive(boolean canDrive) {
        this.canDrive = canDrive;
    }

    public boolean isIsNorth() {
        return isNorth;
    }

    public void setIsNorth(boolean isNorth) {
        this.isNorth = isNorth;
    }
    
}

