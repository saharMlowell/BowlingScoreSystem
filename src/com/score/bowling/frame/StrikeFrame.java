package com.score.bowling.frame;
import com.score.bowling.Roll;

/**
 * Created by slowell on 12/3/16.
 * StrikeFrame is: Knocking down all 10 pins on the first ball.
 */
public class StrikeFrame implements Frame  {
    Roll nextRoll;
    Roll nextNextRoll;

    StrikeFrame(Roll nextRoll, Roll nextNextRoll){
        this.nextRoll = nextRoll;
        this.nextNextRoll = nextNextRoll;
    }

    /**
     * Strikes are worth 10 PLUS the value of your next 2 rolls
     *
     * @return
     */
    @Override
    public int getScore() {
        return Roll.MAX_PIN + nextRoll.getPins() + nextNextRoll.getPins();
    }
}
