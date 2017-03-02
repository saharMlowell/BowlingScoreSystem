package com.score.bowling.frame;

import com.score.bowling.Roll;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by slowell on 12/3/16.
 */
public class SpareFrameTest {
    @Test
    public void getScore() throws Exception {
        Roll a = new Roll(1);
        SpareFrame frame= new SpareFrame(a);
        assertEquals(11, frame.getScore());

    }

    @Test
    public void oneZero() throws Exception {
        Roll a = new Roll(0);
        SpareFrame frame= new SpareFrame(a);
        assertEquals(10, frame .getScore());
    }
    @Test
    public void oneTen() throws Exception {
        Roll a = new Roll(10);
        SpareFrame frame= new SpareFrame(a);
        assertEquals(20, frame .getScore());

    }

}