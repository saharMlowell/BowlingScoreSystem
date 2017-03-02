package com.score.bowling.frame;

import com.score.bowling.Roll;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by slowell on 12/3/16.
 */
public class StrikeFrameTest {
    @Test
    public void getScore() throws Exception {
        Roll a = new Roll(1);
        Roll b = new Roll(2);
        StrikeFrame s = new StrikeFrame(a,b);
        assertEquals(13, s.getScore());
        assertEquals(13, new StrikeFrame(b, a).getScore());

    }
    @Test
    public void oneTen() throws Exception {
        Roll a = new Roll(10);
        Roll b = new Roll(2);
        assertEquals(22, new StrikeFrame(a,b).getScore());
        assertEquals(22, new StrikeFrame(b,a).getScore());

    }
}