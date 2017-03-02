package com.score.bowling.frame;

import com.score.bowling.Roll;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by slowell on 12/3/16.
 */
public class TenthFrameTest {

    @Test
    public void getScore() throws Exception {
        Roll a = new Roll(4);
        Roll b = new Roll(2);
        Roll c = new Roll(2);
        TenthFrame frame = new TenthFrame(b, c, a);
        assertEquals(frame.getScore(), 8);

    }

    @Test
    public void allTen() throws Exception {
        Roll a = new Roll(10);
        Roll b = new Roll(10);
        Roll c = new Roll(10);
        assertEquals(new TenthFrame(a, b, c).getScore(), 30);
        assertEquals(new TenthFrame(a, c, b).getScore(), 30);
        assertEquals(new TenthFrame(b, a, c).getScore(), 30);

    }

}