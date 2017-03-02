package com.score.bowling;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by slowell on 12/3/16.
 */
public class FileUtilTest {
    FileUtil testFile;
    @Before
    public void setUp() throws Exception {
        testFile = new FileUtil("input.txt");

    }

    @Test
    public void result() throws Exception {
        String resultOne = "Player One  : 279";
        String resultTwo = "Player Two  : 101";
        List<String> expctedResult = Arrays.asList(resultOne,resultTwo);
        assertEquals(expctedResult, testFile.process());

    }

}