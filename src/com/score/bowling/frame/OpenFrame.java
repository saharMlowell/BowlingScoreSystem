package com.score.bowling.frame;
import com.score.bowling.Roll;

/**
 * Created by slowell on 12/3/16.
 * OpenFrame is: Still there are some pins standing after 2 balls.
 */
public class OpenFrame implements Frame  {
    Roll firstRoll;
    Roll secondRoll;

    OpenFrame(Roll firstRoll, Roll secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    /**
     * open frame's score is sum of the two rolls.
     *
     * @return score
     */
    @Override
    public int getScore() {
        return firstRoll.getPins() + secondRoll.getPins();
    }
}
