package com.score.bowling.frame;

import com.score.bowling.Roll;

/**
 * Created by slowell on 12/3/16.
 */
public class TenthFrame implements Frame {
    Roll firstRoll;
    Roll secondRoll;
    Roll thirdRoll;

    TenthFrame(Roll firstRoll, Roll secondRoll, Roll thirdRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.thirdRoll = thirdRoll;
    }

    /**
     * tenth frame score is sum of three rolls.
     *
     * @return score
     */
    @Override
    public int getScore() {
        return firstRoll.getPins() + secondRoll.getPins() + thirdRoll.getPins();
    }
}
