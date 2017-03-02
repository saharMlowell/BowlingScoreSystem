package com.score.bowling.frame;

import com.score.bowling.Roll;

import java.util.ArrayList;

/**
 * Created by slowell on 12/3/16.
 * Create List of Frames and initialize frame types based on criteria
 */
public class FrameFactory {
    /**
     * @return a list of frame which includes one of these type: Strike, Spare, Open or 10th
     */
    public static ArrayList<Frame> getFrame(ArrayList<Roll> rolls) {
        ArrayList<Frame> frames = new ArrayList<Frame>(10);
        int throwNum = 0;
        Roll lastOpenThrow = null;
        for (; frames.size() < 9; throwNum++) {
            Roll currThrow = rolls.get(throwNum);
            if (currThrow.getPins() == Roll.MAX_PIN) {
                frames.add(new StrikeFrame(getNext(rolls, throwNum, 1), getNext(rolls, throwNum, 2)));
            } else if (currThrow.getPins() + getNext(rolls, throwNum, 1).getPins() == Roll.MAX_PIN) {
                throwNum++;
                frames.add(new SpareFrame(getNext(rolls, throwNum, 1)));
                lastOpenThrow = null;
            } else if (lastOpenThrow != null) {
                frames.add(new OpenFrame(lastOpenThrow, currThrow));
                lastOpenThrow = null;
            } else {
                lastOpenThrow = currThrow;
            }
        }

        frames.add(new TenthFrame(rolls.get(throwNum),
                rolls.get(++throwNum),
                rolls.size() > ++throwNum ? rolls.get(throwNum) : new Roll(0)));
        return frames;
    }


    private static Roll getNext(ArrayList<Roll> rolls, int startIndex, int readAhead) {
        return rolls.get(startIndex + readAhead);
    }
}
