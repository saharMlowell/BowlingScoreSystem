package com.score.bowling.frame;

import com.score.bowling.Roll;

/**
 * Created by slowell on 12/3/16.
 * SpareFrame is: Knocking down all 10 with 2 balls.
 */
public class SpareFrame implements Frame  {
    Roll nextRoll;

    SpareFrame(Roll nextRoll){
        this.nextRoll = nextRoll;
    }

    /**
     * Spares are worth 10 PLUS the value of your next roll
     *
     * @return score
     */
    @Override
    public int getScore() {
        return Roll.MAX_PIN + nextRoll.getPins();
    }
}
