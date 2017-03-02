package com.score.bowling.frame;

import com.score.bowling.Roll;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by slowell on 12/3/16.
 */
public class FrameFactoryTest {;
    ArrayList<Roll> rollsData;
    @Before
    public void setUp() throws Exception {
        rollsData = new ArrayList<Roll>();
        for(int i =0; i<=13; i++){
            rollsData.add(new Roll(10));
        }
    }

    @Test
    public void getFrame() throws Exception {
        assertEquals(10,FrameFactory.getFrame(rollsData).size());
        assertEquals(30, FrameFactory.getFrame(rollsData).get(1).getScore());

    }

}