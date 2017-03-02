package com.score.bowling;
/**
 * Created by slowell on 12/3/16.
 * Roll would have number of knocked down pins
 */
public class Roll {
    public static final int MAX_PIN = 10;
    private int pin;
    public Roll( int pin){
        this.pin = pin;
    }

    public int getPins() {
        return pin;
    }

}
