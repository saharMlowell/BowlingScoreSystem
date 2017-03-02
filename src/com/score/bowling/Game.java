package com.score.bowling;
import com.score.bowling.frame.Frame;

import java.util.ArrayList;

/**
 * Created by slowell on 12/3/16.
 * A game consists of 10 frames.
 */
public class Game {
    private ArrayList<Frame> frames = new ArrayList<Frame>(10);

    Game(ArrayList<Frame> frames) {
        for (Frame current : frames) {
            this.frames.add(current);
        }
    }

    /**
     * adding up all the frames scores.
     *
     * @return the game score.
     */
    public int getScore() {
        int totalScore = 0;
        for (Frame current : frames) {
            totalScore += current.getScore();
        }
        return totalScore;
    }
}
