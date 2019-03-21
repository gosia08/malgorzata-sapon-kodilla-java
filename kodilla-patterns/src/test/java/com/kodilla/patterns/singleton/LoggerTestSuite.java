package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("this is last log");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("this is last log", result);
    }
}