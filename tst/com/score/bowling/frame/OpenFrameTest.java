package com.score.bowling.frame;

import com.score.bowling.Roll;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by slowell on 12/3/16.
 */
public class OpenFrameTest {
    @Test
    public void getScore() throws Exception {
        Roll a = new Roll(5);
        Roll b = new Roll(4);
        assertEquals(9, new OpenFrame(a, b).getScore());
        assertEquals(9, new OpenFrame(b, a).getScore());

    }

    @Test
    public void oneZero() throws Exception {
        Roll a = new Roll(0);
        Roll b = new Roll(9);
        assertEquals(9, new OpenFrame(a, b).getScore());
        assertEquals(9, new OpenFrame(b, a).getScore());
    }
    @Test
    public void allZero() throws Exception {
        Roll a = new Roll(0);
        Roll b = new Roll(0);
        assertEquals(0, new OpenFrame(a, b).getScore());
        assertEquals(0, new OpenFrame(b, a).getScore());

    }

}