/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2;


import javalib.worldimages.*;


/**
 *
 * @author ldbruby95
 */
public class Bomb {

    Posn pin;
    WorldImage bomb;
    Hero hero;
    int width;
    int height;
    int time;

    public Bomb(Posn pin, int time) {
        this.time = time;
        this.pin = pin;
        this.bomb = new FromFileImage(pin, "bomb.png");
        this.width = bomb.getWidth();
        this.height = bomb.getHeight();
    }

    public Bomb(Posn pin) {
        this(pin, 0);
        
    }

    
    public Bomb incTime() {
        return new Bomb(pin, time + 1);
    }
    
    public WorldImage bombImage() {
        return bomb.getMovedTo(pin);
    }
    
    public boolean canIExplode() {
        if (time > 10) {
            return true;
        } else {
            return false;
        }
    }
    
    
    


}
